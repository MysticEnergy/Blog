package com.mystic.controller.end;

import com.mystic.service.BlogServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

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
        //        return "/front/homePage";
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
        modelAndView.setViewName("");
        modelAndView.addObject("blog",blogServices.selectById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/list/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        blogServices.delById(id);
    }
}
