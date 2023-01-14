package com.wztcode.service.impl;

import com.wztcode.dao.BookDao;
import com.wztcode.dao.impl.BookDaoImpl;
import com.wztcode.domain.Book;
import com.wztcode.domain.Page;
import com.wztcode.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();


    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }

    @Override
    public Page page(int pageNo, int pageSize) {
        Page page = new Page();
        // 设置当前页码
        page.setPageNo(pageNo);
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        int pageTotalCount = bookDao.queryForPageTotalCount();
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal++;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 求开始页的索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Book> items = bookDao.queryForPageItems(begin, pageSize);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }
}
