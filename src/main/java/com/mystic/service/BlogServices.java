package com.mystic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mystic.dao.BlogMapper;
import com.mystic.pojo.Blog;

/**
 * Created by wasmir on 2016/12/22.
 */

@Service
public class BlogServices {
    private BlogMapper blogMapper;

    public BlogMapper getBlogMapper() {
        return blogMapper;
    }
    @Autowired
    public void setBlogMapper(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }

    public int insert(Blog blog){
        return blogMapper.insert(blog);
    }
}
