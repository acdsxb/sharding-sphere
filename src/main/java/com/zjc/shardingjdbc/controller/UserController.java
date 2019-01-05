package com.zjc.shardingjdbc.controller;

import com.zjc.shardingjdbc.model.User;
import com.zjc.shardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * create by zhaojinchao on 2018/12/18
 */
@Component
@RestController
@ResponseBody
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get_by_id")
    public User getUserById(@RequestParam(name = "id") Long id) {
        return userService.getUserById(id);
    }
}
