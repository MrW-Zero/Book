package com.wztcode.web;

import com.wztcode.domain.User;
import com.wztcode.service.UserService;
import com.wztcode.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@SuppressWarnings({"all"})
public class RegisterServlet extends HttpServlet {

    private final UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("获取到了");
        // 1. 获取请求的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        // 2. 检查验证码是否正确
        if ("abc".equals(code)) {
            // 验证码正确
            // 3. 检查用户名是否可用

            if (userService.existUsername(username)) {
                System.out.println("该用户名[" + username + "]可用");
                userService.registerUser(new User(null, username, password, email));
                request.getRequestDispatcher("/pages/user/regist_success.jsp").forward(request, response);
            } else {
                System.out.println("该用户名[" + username + "]不可用");
                // 将错误信息放入到 request 域中
                request.setAttribute("msg", "用户名已存在！！！");
                // 将用户名和邮箱回显到客户端
                request.setAttribute("username", username);
                request.setAttribute("email", email);
                request.getRequestDispatcher("/pages/user/regist.jsp").forward(request, response);
            }
        } else {
            // 将错误信息放入到 request 域中
            request.setAttribute("msg", "验证码错误！！！");
            // 将用户名和邮箱回显到客户端
            request.setAttribute("username", username);
            request.setAttribute("email", email);
            // 验证码不正确, 跳转到注册页面
            System.out.println("验证码[" + code + "]不正确");
            request.getRequestDispatcher("/pages/user/regist.jsp").forward(request, response);
        }
    }
}
