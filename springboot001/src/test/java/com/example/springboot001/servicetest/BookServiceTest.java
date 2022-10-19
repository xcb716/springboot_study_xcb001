package com.example.springboot001.servicetest;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboot001.entity.Book;
import com.example.springboot001.service.inte.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();
        book.setId(4);
        book.setName("测试姓名008");
        book.setType("测试类型008");
        book.setDescription("测试描述008");
        bookService.save(book);
    }
    @Test
    void testDelete() {
        bookService.delete(2);
    }
    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(4);
        book.setName("测试姓名修改004");
        book.setType("测试类型修改004");
        book.setDescription("测试描述修改004");
        bookService.update(book);
    }
    @Test
    void testGetById() {
        bookService.getById(1);
    }
    @Test
    void testGetAll() {
        bookService.getAll();
    }
    @Test
    void testGetByPage() {
        bookService.getByPage(1, 3);
    }
}
