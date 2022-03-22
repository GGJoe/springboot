package com.guoajiahe.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.guoajiahe.domain.Book;

import java.util.List;

public interface BookService {

    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> selectAll();
    IPage<Book> selectPage(Integer current,Integer size);
}
