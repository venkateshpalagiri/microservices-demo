package com.mrvkigns.department.controller;

import com.mrvkigns.department.entity.Department;
import com.mrvkigns.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
    return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable ("id") Long departmentId){
        log.info("Inside getDepartmentById of 'DepartmentController'");
        return departmentService.getDepartmentById(departmentId);
    }
}
