package com.registration.registration_of_insolvency.store.impl;

import com.registration.registration_of_insolvency.entity.Department;
import com.registration.registration_of_insolvency.store.DepartmentStore;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class SqlStoreImpl implements DepartmentStore {
    @Override
    public Department createDepartment(Department department) {
        return null;
    }

    @Override
    public Optional<Department> findDepartmentById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Department> allDepartments() {
        return null;
    }
}
