package com.registration.registration_of_insolvency.contoller;

import com.registration.registration_of_insolvency.contoller.request.DeptRequest;
import com.registration.registration_of_insolvency.entity.Department;
import com.registration.registration_of_insolvency.service.DepartmentService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmenController {
    public static final String PATH="/service";
    @Autowired
    private DepartmentService departmentService;

    @PostMapping(PATH)
    public ResponseEntity<?> createDepartment(@RequestBody DeptRequest department) {
        return ResponseEntity.ok(departmentService.createDepartment(department.asRequest()).asResponse());
    }
    @GetMapping(PATH+"/{id}")
    public ResponseEntity<?> findDepartmentById(@PathVariable @NonNull int id) {
        return ResponseEntity.ok(departmentService.findDepartmentById(id).asResponse());
    }
    @GetMapping(PATH)
    public ResponseEntity<?> allDepartments() {
        var deptResponseList=departmentService.allDepartments().stream().map(Department::asResponse);
        return ResponseEntity.ok(deptResponseList);
    }
}
