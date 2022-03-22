package com.guoajiahe.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guoajiahe.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.getById(1));
    }

    @Test
    void TestGetByIdMP(){
        System.out.println(bookDao.selectById(1));
    }
    @Test
    void TestSaveMP(){
        Book book = new Book();
        book.setType("Test");
        book.setDescription("testDescription");
        book.setName("test");
        bookDao.insert(book);
    }
    @Test
    void TestUpdateMP(){
        Book book = new Book();
        book.setId(15);
        book.setType("Test15");
        book.setDescription("testDescription15");
        book.setName("test15");
        bookDao.updateById(book);
    }
    @Test
    void TestDeleteMP(){
        bookDao.deleteById(16);
    }
    @Test
    void TestGetAllMP(){
        System.out.println(bookDao.selectList(null));
    }
    @Test
    void TestGetPageMP(){
        IPage page =new Page(1,5);
        LambdaQueryWrapper<Book> l = new LambdaQueryWrapper<Book>();
        l.like(Book::getName,"spring");
        IPage iPage = bookDao.selectPage(page, l);
        System.out.println(iPage.getPages());
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());
    }
    @Test
    void TestGetByMP(){
        /*
        需要创建一个queryWrapper对象,添加查询条件
         */
        // select * from tb_book where name like %spring%
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","spring");
        IPage page = new Page(1,5);
        bookDao.selectPage(page,queryWrapper);
    }

    @Test
    void TestMistakeGetByMP(){
        String name =null;
        /*
        需要创建一个LambdaQueryWrapper对象,添加查询条件
         */
        // select * from tb_book where name like %spring%
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like( name!=null,Book::getName,name);
        IPage iPage = new Page(1,5);
        bookDao.selectPage(iPage,lambdaQueryWrapper);
    }
}



