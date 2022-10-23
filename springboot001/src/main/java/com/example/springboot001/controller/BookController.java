package com.example.springboot001.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
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
    public Boolean save(@RequestBody Book book) {
        return bookService.insert(book);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return bookService.modify(book);
    }

    @GetMapping
    public List<Book> getAll(Integer id) {
        return bookService.list();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }
}
