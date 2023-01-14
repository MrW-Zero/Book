package com.wztcode.test;

import com.wztcode.domain.Book;
import com.wztcode.domain.Page;
import com.wztcode.service.BookService;
import com.wztcode.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BookServiceTest {

    private BookService bookService = new BookServiceImpl();

    @Test
    void addBook() {
        bookService.addBook(new Book(null, "天下无敌", "独孤求败",  new BigDecimal(999), 200, 0, null));
    }

    @Test
    void deleteBookById() {
        bookService.deleteBookById(6);
    }

    @Test
    void updateBook() {
        bookService.updateBook(new Book(6, "天下无敌, 是多么寂寞啊~", "独孤求败",  new BigDecimal(999), 200, 0, null));
    }

    @Test
    void queryBookById() {
        Book book = bookService.queryBookById(3);
        System.out.println(book);
    }

    @Test
    void queryBooks() {
        for (Book book : bookService.queryBooks()) {
            System.out.println(book);
        }
    }

    @Test
    void page() {
        System.out.println(bookService.page(1, Page.PAGE_SIZE));
    }

}