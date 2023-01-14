package com.wztcode.test;

import com.wztcode.dao.BookDao;
import com.wztcode.dao.impl.BookDaoImpl;
import com.wztcode.domain.Book;
import com.wztcode.domain.Page;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.SQLException;

class BookDaoTest {

    private BookDao bookDao = new BookDaoImpl();

    @Test
    void addBook() throws SQLException {
        bookDao.addBook(new Book(null, "世界那么美", "陈青年", new BigDecimal(999), 3000, 200, null));
    }

    @Test
    void deleteBookById() throws SQLException {
        bookDao.deleteBookById(4);
    }

    @Test
    void updateBook() throws SQLException {
        bookDao.updateBook(new Book(5, "世界如此美丽！", "青年", new BigDecimal(9999), 25000, 300, null));
    }

    @Test
    void queryBookById() throws SQLException {
        Book book = bookDao.queryBookById(3);
        System.out.println(book);
    }

    @Test
    void queryBooks() throws SQLException {
        for (Book book : bookDao.queryBooks()) {
            System.out.println(book);
        }

    }

    @Test
    void queryForPageTotalCount() {
        Integer count = bookDao.queryForPageTotalCount();
        System.out.println(count);
    }

    @Test
    void test() {
        for (Book book : bookDao.queryForPageItems(0, Page.PAGE_SIZE)) {
            System.out.println(book);
        }

    }
}