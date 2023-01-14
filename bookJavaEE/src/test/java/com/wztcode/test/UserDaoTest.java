package com.wztcode.test;

import com.wztcode.dao.UserDao;
import com.wztcode.dao.impl.UserDaoImpl;
import com.wztcode.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    void queryUserByUsername() throws SQLException {
        if (userDao.queryUserByUsername("admin") == null) {
            System.out.println("该用户名合法");
        } else {
            System.out.println("该用户名不合法");
        }
    }

    @Test
    void queryUserByUsernameAndPassword() throws SQLException {
        if (userDao.queryUserByUsernameAndPassword("admin", "admin") == null) {
            System.out.println("用户名或密码有误");
        } else {
            System.out.println("登录成功");
        }
    }

    @Test
    void saveUser() throws SQLException {
        System.out.println(userDao.saveUser(new User(null, "root", "root", "3032534307@qq.com")));

    }
}