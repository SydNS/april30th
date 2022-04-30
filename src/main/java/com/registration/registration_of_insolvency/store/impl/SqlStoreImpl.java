package com.registration.registration_of_insolvency.store.impl;

import com.registration.registration_of_insolvency.entity.Department;
import com.registration.registration_of_insolvency.repository.DepartmentRepository;
import com.registration.registration_of_insolvency.store.DepartmentStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class SqlStoreImpl implements DepartmentStore {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Optional<Department> findDepartmentById(Integer id) {
        Optional<Department> department=departmentRepository.findById(id);
        return department;
    }

    @Override
    public List<Department> allDepartments() {
        return departmentRepository.findAll();
    }
}
