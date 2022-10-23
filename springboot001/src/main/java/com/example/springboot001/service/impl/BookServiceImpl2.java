package com.example.springboot001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot001.dao.BookDao;
import com.example.springboot001.entity.Book;
import com.example.springboot001.service.inte.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    public Boolean insert(Book book) {
        return bookDao.insert(book) > 0;
    }

    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    public Boolean modify(Book book) {
        return bookDao.updateById(book) > 0;
    }

    public Book get(Integer id) {
        return bookDao.selectById(id);
    }
}
