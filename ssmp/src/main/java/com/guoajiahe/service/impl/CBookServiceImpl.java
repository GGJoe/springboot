package com.guoajiahe.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoajiahe.dao.BookDao;
import com.guoajiahe.domain.Book;
import com.guoajiahe.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CBookServiceImpl  extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private  BookDao bookDao;
    @Override
    public IPage<Book> selectPage(Integer current, Integer size) {
        IPage<Book> page = new Page(current,size);
        return bookDao.selectPage(page, null);
    }
}
