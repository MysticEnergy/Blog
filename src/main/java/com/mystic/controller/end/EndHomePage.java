package com.mystic.controller.end;

import com.mystic.service.BlogServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by wasmir on 2017/2/3.
 */
@Controller
@RequestMapping("/admmmmin")
public class HomePage {
    @Resource
    BlogServices blogServices;

    @RequestMapping("/homePage")
    public ModelAndView showHomePage(ModelAndView modelAndView){
        modelAndView.setViewName("/end/index");
        modelAndView.addObject("blogs",blogServices);
        //        return "/front/homePage";
        return modelAndView;
    }
}
