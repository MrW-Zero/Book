package com.wztcode.service;

import com.wztcode.domain.Book;
import com.wztcode.domain.Page;

import java.util.List;

public interface BookService {

    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    public Page page(int pageNo, int pageSize);
}
