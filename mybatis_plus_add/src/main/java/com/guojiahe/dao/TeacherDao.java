package com.guojiahe.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guojiahe.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeacherDao  extends BaseMapper<Teacher> {
}
