package com.guojiahe.controller;

// Rest 模式

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @RequestMapping(value = "/books/{id}",method = RequestMethod.GET)
    public  String getById(@PathVariable Integer id){
        System.out.println("springboot is running");
        return "springboot is running";
    }

}
