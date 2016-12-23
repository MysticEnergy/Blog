package com.mystic;

import com.mystic.pojo.Blog;
import com.mystic.service.BlogServices;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by 书生 on 2016/12/22.
 */
public class test {

    private static Logger logger = Logger.getLogger("test");
    //  private ApplicationContext ac = null;

    private BlogServices blogService = null;

    @Before
    public void before() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        blogService = (BlogServices) ac.getBean("blogServices");
    }

    @Test
    public void test1() {

        System.out.println(blogService.getBlogMapper().toString());
        Blog blog = new Blog();
        blog.setContent("test");
        blog.setTitle("test");
        blogService.getBlogMapper().insertSelective(blog);
    }



}
