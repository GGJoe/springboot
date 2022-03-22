package com.guoajiahe.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guoajiahe.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao  extends BaseMapper<Book> {

    /*
    MyBatis 查询方法
     */
    @Select("select * from tb_book where id=#{id}")
    Book getById(Integer id);
}
