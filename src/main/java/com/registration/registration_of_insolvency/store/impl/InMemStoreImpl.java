package com.registration.registration_of_insolvency.store.impl;

import com.registration.registration_of_insolvency.entity.Department;
import com.registration.registration_of_insolvency.repository.DepartmentRepository;
import com.registration.registration_of_insolvency.store.DepartmentStore;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class InMemStoreImpl implements DepartmentStore {
    private ArrayList<Department> departmentList= new ArrayList<Department>();

    @Override
    public Department createDepartment(Department department) {
        departmentList.add(department);
        return departmentList.get(departmentList.size()-1);
    }

    @Override
    public Optional<Department> findDepartmentById(@NonNull Integer id) {
        return Optional.ofNullable(departmentList.get(id));
    }

    @Override
    public List<Department> allDepartments() {
        return departmentList;
    }
}
