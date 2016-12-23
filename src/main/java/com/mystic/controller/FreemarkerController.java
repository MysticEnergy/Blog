package com.mystic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wasmir on 2016/12/23.
 */

@Controller
public class FreemarkerController {

    @RequestMapping("/freemarker")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView("test");
        mv.addObject("title","test");
        mv.addObject("content","content");
        return mv;
    }
}
