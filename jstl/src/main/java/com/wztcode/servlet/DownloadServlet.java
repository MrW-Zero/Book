package com.wztcode.servlet;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取要下载的文件名
        String downloadFileName = "nezha.jpg";
        // 2. 读取要下载的文件内容
        ServletContext servletContext = getServletContext();
        // 获取要下载的文件类型
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
        System.out.println("下载的文件类型：" + mimeType);
        // 4. 在回传前, 通过响应头告诉客户端返回的数据类型
        response.setContentType(mimeType);
        // 5. 还要告诉客户端收到的数据是用于下载使用 (还是使用响应头)
        // Content-Disposition 响应头, 表示收到的数据怎么处理
        // attachment 表示附件, 表示下载使用
        // filename= 表示指定下载的文件名
        if (request.getHeader("User-Agent").contains("Firefox")) {
            response.setHeader("Content-Disposition", "attachment; filename==?UTF-8?B?+" +new BASE64Encoder().encode("哪吒.jpg".getBytes(StandardCharsets.UTF_8)) + "+?=");
        } else {
            response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("哪吒.jpg", "UTF-8"));
        }
        /**
         * / 斜杠被服务器解析表示为 http://ip:port/工程名/ 映射 到代码的 webapp 目录
         */
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
        // 获取响应的输出流
        ServletOutputStream outputStream = response.getOutputStream();
        // 3. 把下载的文件内容回传给客户端
        // 读取输入流中全部的数据, 复制给输出流, 输出给客户端
        IOUtils.copy(resourceAsStream, outputStream);
    }
}
