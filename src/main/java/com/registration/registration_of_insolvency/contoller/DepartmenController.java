package com.registration.registration_of_insolvency.contoller;

import com.registration.registration_of_insolvency.entity.Department;
import com.registration.registration_of_insolvency.service.DepartmentService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmenController {
    public static final String PATH="/service";
    @Autowired
    private DepartmentService departmentService;

    @PostMapping(PATH)
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }
    @GetMapping(PATH+"/{id}")
    public Optional<Department> findDepartmentById(@PathVariable int id) {
        return departmentService.findDepartmentById(id);
    }

    @GetMapping(PATH)
    public List<Department> allDepartments() {
        return departmentService.allDepartments();
    }
}
