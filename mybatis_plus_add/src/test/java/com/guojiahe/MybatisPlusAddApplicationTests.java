package com.guojiahe;

import com.guojiahe.dao.TeacherDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusAddApplicationTests {

    @Autowired
    private TeacherDao teacherDao;
    @Test
    void contextLoads() {
        System.out.println(teacherDao.selectById(2));
    }
    @Test
    void testGetAll(){
        System.out.println(teacherDao.selectList(null));
    }

}
