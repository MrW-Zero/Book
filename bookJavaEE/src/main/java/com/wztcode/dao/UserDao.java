package com.wztcode.dao;

import com.wztcode.domain.User;

import java.sql.SQLException;

public interface UserDao {


    // .......
    /**
     * 根据用户名查询user对象
     * @param username 用户名
     * @return 为空则没有该用户, 该用户名可用
     */
    public User queryUserByUsername(String username);

    /**
     * 根据 用户名 和 密码 查询用户
     * @param username 用户名
     * @param password 密码
     * @return 为空, 则说明用户名或密码有误
     */
    public User queryUserByUsernameAndPassword(String username, String password);


    /**
     * 保存用户
     * @param user user 对象
     * @return 返回保存修改的行数
     */
    public int saveUser(User user);
}
