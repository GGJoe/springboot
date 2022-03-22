package com.guoajiahe.controller.utils;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//异常处理器
//定义controller层处理器
@RestControllerAdvice
public class MyExceptionAdvice{
    //拦截所有异常信息,异常信息可以分别拦截
    @ExceptionHandler(Exception.class)
    public R doException(Exception e){
        //记录日志
        //通知运维
        //通知开发
        e.printStackTrace();
        return new R(false,e.getMessage());

    }
}
