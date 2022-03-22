package com.guojiahe;

import com.guojiahe.dao.TeacherDao;
import com.guojiahe.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisAddApplicationTests {
    @Autowired
    private TeacherDao teacherDao;
    @Test
    void contextLoads() {
        System.out.println(teacherDao.getById(1));
    }

}
