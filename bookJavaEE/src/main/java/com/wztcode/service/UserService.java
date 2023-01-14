package com.wztcode.service;

import com.wztcode.domain.User;

import java.sql.SQLException;

public interface UserService {

    /**
     * 用户登录
     * @param user user 对象
     * @return 如果为空, 则表示登录失败; 否则成功
     */
    public User userLogin(User user);

    /**
     * 用户注册
     * @param user user 对象
     */
    public void registerUser(User user);

    /**
     * 检查用户名是否合法(用户名唯一)
     * @param user user 对象
     * @return 如果为空, 则表示该用户名可用, 否则表示用户名已存在
     */
    public boolean existUsername(String username);
}
