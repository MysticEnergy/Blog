package com.mystic.controller.front;

import com.mystic.service.BlogServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by 书生 on 2017/2/3.
 * 前台页面
 */
@Controller
@RequestMapping("/blog")
public class HomePage {
    @Resource
    BlogServices blogServices;
    /*
    * 首页列表页
    * */
    @RequestMapping("/homePage")
    public ModelAndView showHomePage(ModelAndView modelAndView){
        modelAndView.setViewName("/front/homePage");
        modelAndView.addObject("blogs",blogServices.selectAllBlogs());
        return modelAndView;
    }

    /*
    * 展示单个博文页面
    * */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ModelAndView showOneBlog(ModelAndView modelAndView,@PathVariable Integer id){
        modelAndView.setViewName("/front/oneBlog");
        modelAndView.addObject("oneBlog",blogServices.selectById(id));
        return modelAndView;
    }

}
