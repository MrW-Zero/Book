package com.wztcode.web;

import com.wztcode.domain.User;
import com.wztcode.service.UserService;
import com.wztcode.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@SuppressWarnings({"all"})
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("登录成功");
        // 1. 获取请求参数 用户名 和 密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 2. 根据 用户名 和 密码 查询用户是否存在
        User user = userService.userLogin(new User(null, username, password, null));
        if (user == null) {
            // 将错误信息回显到客户端, 存放到 request 域中
            request.setAttribute("msg", "用户名或密码错误！！！");
            request.setAttribute("username", username);
            // 登录失败, 跳转回登录页面
            request.getRequestDispatcher("/pages/user/login.jsp").forward(request, response);
        } else {
            // 登录成功, 跳转到登录成功页面
            request.getRequestDispatcher("/pages/user/login_success.jsp").forward(request, response);
        }

    }
}

