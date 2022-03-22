package com.guoajiahe.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guoajiahe.dao.BookDao;
import com.guoajiahe.domain.Book;
import com.guoajiahe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    //注入数据层，转调数据层方法
    @Autowired
    private BookDao bookDao;
    public BookServiceImpl() {
        super();
    }
    @Override
    public IPage<Book> selectPage(Integer current, Integer size) {
        IPage page = new Page(current,size);
        return bookDao.selectPage(page,null);
    }
    @Override
    public Boolean save(Book book) {
        //数据层方法insert返回的值是影响行数，故而返回>0即代表操作成功进行
        return bookDao.insert(book)>0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> selectAll() {
        return bookDao.selectList(null);
    }
}
