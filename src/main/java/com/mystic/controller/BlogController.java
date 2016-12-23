package com.mystic.controller;

import com.mystic.service.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mystic.pojo.Blog;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wasmir on 2016/12/22.
 */

@Controller

public class BlogController {
    @Autowired
    Blog blog;
    @Resource
    BlogServices blogServices;

    @RequestMapping("/blog")
    public String test(HttpServletRequest request, Model model){
        String title = request.getParameter("title");
        String context = request.getParameter("context");
        blog.setTitle(title);
        blog.setContent(context);
        blogServices.getBlogMapper().insert(blog);
        return "index";
    }
}
