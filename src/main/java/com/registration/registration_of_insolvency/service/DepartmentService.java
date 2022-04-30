package com.registration.registration_of_insolvency.service;

import com.registration.registration_of_insolvency.entity.Department;
import com.registration.registration_of_insolvency.store.DepartmentStore;
import com.registration.registration_of_insolvency.store.impl.InMemStoreImpl;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private InMemStoreImpl departmentStore;

    public Department createDepartment(Department department) {
        return departmentStore.createDepartment(department);
    }

    public Optional<Department> findDepartmentById(@NonNull Integer id) {
        return departmentStore.findDepartmentById(id);
    }
    public List<Department> allDepartments() {
        return departmentStore.allDepartments();
    }
}
