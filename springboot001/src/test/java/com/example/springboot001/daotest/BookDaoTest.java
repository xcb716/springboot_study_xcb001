package com.example.springboot001.daotest;

import com.example.springboot001.dao.BookDao;
import com.example.springboot001.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void testSave() {
        Book book = new Book();
        book.setId(1);
        book.setName("测试姓名001");
        book.setType("测试类型001");
        book.setDescription("测试描述001");
        bookDao.insert(book);
    }

    @Test
    public void testGetById() {
        System.out.println(bookDao.selectById(1));
    }
}
