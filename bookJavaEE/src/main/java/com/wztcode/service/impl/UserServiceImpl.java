package com.wztcode.service.impl;

import com.wztcode.dao.UserDao;
import com.wztcode.dao.impl.UserDaoImpl;
import com.wztcode.domain.User;
import com.wztcode.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User userLogin(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public void registerUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public boolean existUsername(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            System.out.println("该用户名合法");
            return true;
        } else {
            System.out.println("该用户名不合法");
            return false;
        }
    }
}
