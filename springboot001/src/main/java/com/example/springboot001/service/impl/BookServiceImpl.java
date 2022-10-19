package com.example.springboot001.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot001.dao.BookDao;
import com.example.springboot001.entity.Book;
import com.example.springboot001.service.inte.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    public IPage<Book> getByPage(int currentPage, int pageSize) {
        IPage<Book> page = new Page<Book>(currentPage, pageSize);
        return bookDao.selectPage(page, null);
    }
}
