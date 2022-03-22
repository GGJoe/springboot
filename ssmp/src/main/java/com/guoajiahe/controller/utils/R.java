package com.guoajiahe.controller.utils;

import lombok.Data;


@Data
public class R {
    private Boolean flag;
    private Object data;
    private String messgae;
    public R(Boolean flag){
        this.flag = flag;
    }
    public R(){};

    public R(boolean flag,Object data){
        this.flag = flag;
        this.data=data;
    }
    public R(boolean flag,String message){
        this.flag = flag;
        this.messgae = message;
    }


}
