package com.zjc.shardingjdbc.service;

import com.zjc.shardingjdbc.model.User;
import com.zjc.shardingjdbc.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * create by zhaojinchao on 2018/12/18
 */
@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        User user = userRepository.getUserById(id);
        return user;
    }
}
