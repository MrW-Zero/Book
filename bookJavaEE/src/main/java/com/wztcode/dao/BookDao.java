package com.wztcode.dao;

import com.wztcode.domain.Book;

import java.util.List;

public interface BookDao {

    /**
     * 添加图书
     *
     * @param book
     * @return
     */
    public int addBook(Book book);

    /**
     * 删除图书
     *
     * @param id
     * @return
     */
    public int deleteBookById(Integer id);

    /**
     * 修改图书信息
     *
     * @param book
     * @return
     */
    public int updateBook(Book book);

    /**
     * 查询单个图书信息
     *
     * @param id
     * @return
     */
    public Book queryBookById(Integer id);

    /**
     * 查询所有图书信息
     *
     * @return
     */
    public List<Book> queryBooks();

    public Integer queryForPageTotalCount();

    public List<Book> queryForPageItems(int begin, int pageSize);
}
