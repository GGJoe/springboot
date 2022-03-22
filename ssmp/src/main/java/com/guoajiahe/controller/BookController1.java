package com.guoajiahe.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.guoajiahe.domain.Book;
import com.guoajiahe.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.BooleanControl;
import java.util.List;

//@RestController
//@RequestMapping("books")
public class BookController1 {

    @Autowired
    private IBookService service;

    @GetMapping
    public List<Book> selectAll(){
        return service.list();
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return service.updateById(book);
    }

    //save操作请求体传json，使用@RequestBody
    @PostMapping
    public Boolean save( @RequestBody Book book){
        return service.save(book);
    }
    @DeleteMapping("{id}")
    public Boolean delete( @PathVariable Integer id){
        return service.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById( @PathVariable Integer id){
        return service.getById(id);
    }

    @GetMapping("{current}/{size}")
    public IPage<Book> selectPage(@PathVariable Integer current,@PathVariable Integer size){
        return service.selectPage(current,size);
    }
}
