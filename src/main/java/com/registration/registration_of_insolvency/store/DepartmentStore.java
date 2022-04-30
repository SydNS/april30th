package com.registration.registration_of_insolvency.store;

import com.registration.registration_of_insolvency.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentStore {
    Department createDepartment(Department department);
    Optional<Department> findDepartmentById(Integer id);
    List<Department> allDepartments();
}
