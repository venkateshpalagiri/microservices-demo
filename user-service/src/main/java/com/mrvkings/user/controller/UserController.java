package com.mrvkings.user.controller;

import com.mrvkings.user.VO.ResponseTemplateVO;
import com.mrvkings.user.entity.Users;
import com.mrvkings.user.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrvkings.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public Users saveUser(@RequestBody Users user){
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }
}
