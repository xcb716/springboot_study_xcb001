package com.example.springboot001.service.inte;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot001.entity.Book;

public interface IBookService extends IService<Book> {
    //追加的操作与原始操作通过名称区分，功能类似
    Boolean insert(Book book);
    Boolean delete(Integer id);
    Boolean modify(Book book);
    Book get(Integer id);
}
