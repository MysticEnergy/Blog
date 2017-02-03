package com.mystic;

import com.mystic.dao.BlogMapper;
import com.mystic.pojo.Blog;
import com.mystic.service.BlogServices;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by 书生 on 2017/2/3.
 */
public class BlogTest {
    private static Logger logger = Logger.getLogger("test");
    //  private ApplicationContext ac = null;
    BlogMapper blogMapper = null;
    BlogServices blogServices = null;

    @Before
    public void before() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        blogMapper = (BlogMapper) ac.getBean("blogMapper");
        blogServices = (BlogServices) ac.getBean("blogServices");
    }

    @Test
    public void test1() {
        Blog blog = new Blog();
        blog.setTitle("123");
        blog.setContent("123");
        blog.setCreateTime(new Date(System.currentTimeMillis()));
        blogMapper.insertSelective(blog);
        System.out.println("success!");
    }

    @Test
    public void testFindAll(){
        System.out.println(blogServices.selectAllBlogs().toString());
    }

}
