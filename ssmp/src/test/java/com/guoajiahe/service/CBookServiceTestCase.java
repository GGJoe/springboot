package com.guoajiahe.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guoajiahe.domain.Book;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CBookServiceTestCase {


    @Autowired
    private IBookService iBookService;


    @Test
    void testGetById(){
        iBookService.getById(15);
    }

    @Test
    void show(){
        System.out.println("CBookServiceTestCase");
    }
    @Test
    void testSelectPage(){
        LambdaQueryWrapper<Book> l = new LambdaQueryWrapper();
        l.like(Book::getName,"spring");
        IPage page = new Page(1,5);

        iBookService.page(page,l);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(21);
        book.setName("IService<T>");
        book.setType("IService<T>");
        book.setDescription("IService<T>");
        iBookService.updateById(book);
    }
}
