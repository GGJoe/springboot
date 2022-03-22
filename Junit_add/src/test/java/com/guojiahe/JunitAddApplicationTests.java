package com.guojiahe;

import com.guojiahe.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitAddApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void add(){
        System.out.println("hello world");
    }

    @Autowired
    private BookDao bookDao;

    @Test
    void testJunit(){
        bookDao.save();
    }


}
