package com.guojiahe.dao;

import com.guojiahe.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeacherDao {
    @Select("select * from teachers where id =#{id}")
    public Teacher getById(Integer id);
}
