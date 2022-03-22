package com.guoajiahe.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.guoajiahe.controller.utils.MyExceptionAdvice;
import com.guoajiahe.controller.utils.R;
import com.guoajiahe.domain.Book;
import com.guoajiahe.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private IBookService service;

    @GetMapping
    public R selectAll(){
        return new R(true,service.list());
    }

    @PutMapping
    public R update(@RequestBody Book book) throws IOException {
        if (true){
            throw new IOException();
        }

        return new R(service.updateById(book));
    }

    //save操作请求体传json，使用@RequestBody
    @PostMapping
    public R save( @RequestBody Book book){
        return new R(service.save(book));
    }
    @DeleteMapping("{id}")
    public R delete( @PathVariable Integer id){
        return new R(service.removeById(id));
    }

    @GetMapping("{id}")
    public R getById( @PathVariable Integer id){
        return new R(true,service.getById(id));
    }

    @GetMapping("{current}/{size}")
    public R selectPage(@PathVariable Integer current, @PathVariable Integer size){
        return new R(true,service.selectPage(current,size));
    }
}
