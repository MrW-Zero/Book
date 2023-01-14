package com.wztcode.servlet;

import com.wztcode.pojo.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取请求的参数
        // 2. 发送 sql 语句到数据库去查询学生信息
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student(i + 1, "name" + i + 1, 18 + i + 1, "phone" + i + 1));
        }
        // 3. 保存查询到的学生信息，保存到 request 域中
        request.setAttribute("stuList", students);
        // 4. 请求转发
        request.getRequestDispatcher("/exercises/stuTable.jsp").forward(request, response);
    }
}
