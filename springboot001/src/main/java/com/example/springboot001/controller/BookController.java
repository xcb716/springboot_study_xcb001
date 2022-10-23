package com.example.springboot001.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboot001.common.R;
import com.example.springboot001.entity.Book;
import com.example.springboot001.service.inte.IBookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Resource
    private IBookService bookService;

    @PostMapping
    public R save(@RequestBody Book book) {
        Boolean flag = bookService.insert(book);
        return new R(flag);
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        Boolean flag = bookService.delete(id);
        return new R(flag);
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        Boolean flag = bookService.modify(book);
        return new R(flag);
    }

    @GetMapping
    public R getAll(Integer id) {
        List<Book> bookList = bookService.list();
        return new R(true, bookList);
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return new R(true, book);
    }
}
