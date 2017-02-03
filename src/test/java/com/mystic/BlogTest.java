package com.mystic;

import com.mystic.dao.blogMapper;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 书生 on 2017/2/3.
 */
public class BlogTest {
    private static Logger logger = Logger.getLogger("test");
    //  private ApplicationContext ac = null;


    @Before
    public void before() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test1() {

        System.out.println();

    }

}
