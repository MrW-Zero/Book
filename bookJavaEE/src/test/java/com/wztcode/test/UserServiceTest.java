package com.wztcode.test;

import com.wztcode.domain.User;
import com.wztcode.service.UserService;
import com.wztcode.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    void userLogin() throws SQLException {
        System.out.println(userService.userLogin(new User(null, "admin", "admin", null)));
    }

    @Test
    void registerUser() throws SQLException {
        userService.registerUser(new User(null, "hello", "hello", "123456@qq.com"));
    }

    @Test
    void existUsername() throws SQLException {
        userService.existUsername("admin");
    }
}