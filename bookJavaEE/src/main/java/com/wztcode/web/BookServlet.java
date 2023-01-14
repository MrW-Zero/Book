package com.wztcode.web;

import com.wztcode.domain.Book;
import com.wztcode.domain.Page;
import com.wztcode.service.BookService;
import com.wztcode.service.impl.BookServiceImpl;
import com.wztcode.utils.WebUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet {

    private BookService bookService = new BookServiceImpl();

    public void list(HttpServletRequest request, HttpServletResponse response) {
        // 1. 查询全部图书
        List<Book> books = bookService.queryBooks();
        // 2. 保存到 Request 域中
        request.setAttribute("books", books);
        // 3. 请求转发到 pages/manager/manager.jsp 页面
        try {
            request.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //    1. 获取请求的参数 == 封装成为 Book 对象
        Book book = WebUtils.copyParamToBean(req.getParameterMap(), new Book());
        //    2. 调用 BookService.addBook() 保存图书
        bookService.addBook(book);
        //    3. 跳到图书列表页面（sendRedirect）请求重定向
//        req.getRequestDispatcher("/manager/bookServlet?action=list").forward(req, resp);
        //            /manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=list");
    }


    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取请求的参数 id, 图书编号
        String id1 = request.getParameter("id");
        int id = WebUtils.parseInt(request.getParameter("id"), 0);
        // 2. 调用 bookService.deleteBookById() 删除图书
        bookService.deleteBookById(id);
        // 3. 重定向回图书列表管理页面
        // /book/manager/bookServlet?action=list
        response.sendRedirect(request.getContextPath() + "/manager/bookServlet?action=list");
    }


    protected void getBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取图书编号
        int id = WebUtils.parseInt(request.getParameter("id"), 0);
        // 2. 调用 BookService.queryBookById(id) Book 得到修改的图书信息
        Book book = bookService.queryBookById(id);
        // 3. 把图书保存到 request 域中
        request.setAttribute("book", book);
        // 4. 请求转发到 /pages/manager/book_edit.jsp 页面
        request.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(request, response);
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取请求的参数 == 封装成为 Book 对象
        Book book = WebUtils.copyParamToBean(request.getParameterMap(), new Book());
        // 2. 调用 BookService.updateBook(book) 修改图书信息
        bookService.updateBook(book);
        // 3. 重定向回图书列表管理页面
        //    地址：/工程名/manager/bookServlet?action=list
        response.sendRedirect(request.getContextPath() + "/manager/bookServlet?action=list");
    }

    /**
     * 处理分页功能
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取请求的参数 pageNo 和 pageSize
        int pageNo = WebUtils.parseInt(request.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(request.getParameter("pageSize"), Page.PAGE_SIZE);
        // 2. 调用 BookService.page(pageNo, pageSize): Page 对象
        Page page = bookService.page(pageNo, pageSize);
        // 3. 保存 Page 对象到 Request 域中
        request.setAttribute("page", page);
        // 4. 请求转发到 /pages/manager/book_manager.jsp 页面
        request.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(request, response);
    }
}
