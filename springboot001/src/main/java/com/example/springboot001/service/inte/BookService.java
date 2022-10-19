package com.example.springboot001.service.inte;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboot001.entity.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean delete(Integer id);
    Boolean update(Book book);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getByPage(int currentPage, int pageSize);
}
