package com.mystic.controller.end;

import com.mystic.dto.BlogReqDTO;
import com.mystic.pojo.Blog;
import com.mystic.service.BlogServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by wasmir on 2017/2/3.
 */
@Controller
@RequestMapping("/admmmmin")
public class EndController {
    @Resource
    BlogServices blogServices;

    @RequestMapping({"/homePage","/index"})
    public ModelAndView showHomePage(ModelAndView modelAndView){
        modelAndView.setViewName("/end/index");
        modelAndView.addObject("blogs",blogServices);
        return modelAndView;
    }
    @RequestMapping("/list")
    public ModelAndView showList(ModelAndView modelAndView){
        modelAndView.setViewName("/end/list");
        modelAndView.addObject("blogs",blogServices.selectAllBlogs());
        return modelAndView;
    }

    @RequestMapping(value = "/list/{id}",method = RequestMethod.PUT)
    public ModelAndView update(ModelAndView modelAndView, @PathVariable Integer id){
        modelAndView.setViewName("/end/change");
        modelAndView.addObject("blog",blogServices.selectById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/list/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        blogServices.delById(id);
    }

    @RequestMapping(value = "/list/{id}",method = RequestMethod.GET)
    public ModelAndView updateBlog(@PathVariable Integer id,ModelAndView modelAndView){
        modelAndView.setViewName("/end/post");
        modelAndView.addObject("blog",blogServices.selectById(id));
        return modelAndView;
    }

    @RequestMapping("/post")
    public ModelAndView post(ModelAndView modelAndView){
        modelAndView.setViewName("/end/post");
        return modelAndView;
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public void commitPost(BlogReqDTO blogReqDTO){
        //TODO：表单验证
        Blog blog = new Blog();
        if (blogReqDTO.getTitle() != null && !blogReqDTO.getTitle().equals("")&&blogReqDTO.getContent() != null && !blogReqDTO.getContent().equals("")) {
            blog.setTitle(blogReqDTO.getTitle());
            blog.setContent(blogReqDTO.getContent());
            blog.setTag(blogReqDTO.getTag());
            blog.setCreateTime(new Date());
            blog.setHits(0L);
            blogServices.insert(blog);
        }else {
            return;
        }
    }
}
