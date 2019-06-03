package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/3.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        Map map = new HashMap();
        map.put("name", "test001");
        map.put("sex", "男");
        map.put("age", "22");
        modelAndView.addObject("list", map);
        modelAndView.addObject("list2", "这是第二个集合");
        ;

        return modelAndView;
    }
    @RequestMapping("/check")
    public ModelAndView userCheck() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
