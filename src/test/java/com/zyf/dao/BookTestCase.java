package com.zyf.dao;

import com.zyf.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("aaa");
        book.setName("bbb");
        book.setDescription("ccc");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(1);
        book.setType("aaa");
        book.setName("bbb");
        book.setDescription("ccc");
        bookDao.updateById(book);
    }
    @Test
    void testDelete(){
        bookDao.deleteById(3);
    }
    @Test
    void testGetAll(){
        System.out.println(bookDao.selectList(null));
    }
}
