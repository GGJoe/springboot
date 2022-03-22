package com.guoajiahe.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guoajiahe.domain.Book;
import org.springframework.stereotype.Service;


public interface IBookService extends IService<Book> {


//    boolean saveBook(Book book);

    IPage<Book> selectPage(Integer current,Integer size);


}
