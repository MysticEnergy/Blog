package com.mystic.controller.front;

import com.mystic.service.BlogServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by 书生 on 2017/2/3.
 */
@Controller
@RequestMapping("/blog")
public class HomePage {

    @Resource
    BlogServices blogServices;

    @RequestMapping("/homePage")
    public ModelAndView showHomePage(ModelAndView modelAndView){
        modelAndView.setViewName("/front/homePage");
        modelAndView.addObject("blogs",blogServices.selectAllBlogs());
        return modelAndView;
    }

}
