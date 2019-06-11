package com.example.demo.controller;

import com.example.demo.service.LoginService;
import com.example.demo.utils.R;
import com.example.demo.utils.Tool;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/3.
 */
@CrossOrigin
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping("/login")
    public R checkUser(String userName, String password, Integer roleId){
        if(StringUtils.isNotEmpty(userName) && StringUtils.isNotEmpty(password)
                && roleId != null){
            password = Tool.MD5(password);
            //判断用户是否存在
            if(loginService.existUser(userName)<1){
                return R.error("用户不存在");
            }
            //判断角色是否正确
            if(loginService.checkRole(userName,roleId)<1){
                return R.error("用户角色不正确");
            }
            if(loginService.checkUser(userName,roleId,password)<1){
                return R.error("用户密码不正确");
            }
        }else {
            return R.error("用户信息不完整");
        }
        return R.ok();
    }

















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
    public String userCheck() {
//        ModelAndView modelAndView = new ModelAndView("asd");
//        Map map = new HashMap();
//        map.put("name", "test001");
//        map.put("sex", "男");
//        map.put("age", "22");
//        modelAndView.addObject("list", map);
//        modelAndView.addObject("list2", "这是第test个集合");
        return "/asd";
    }
}
