package com.example.demo.controller;

import com.example.demo.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/6/3.
 */
@CrossOrigin
@Controller
@RequestMapping("/interface")
public class InterfaceController {
    @Autowired
    private InterfaceService interfaceService;

    @RequestMapping("/getTeach")
    public List getTeach(){
        return interfaceService.getTeach();
    }

    @RequestMapping("/getAdmin")
    public List getAdmin(){
        return interfaceService.getAdmin();
    }

    @RequestMapping("/getAch")
    public List getAch(){
        return interfaceService.getAch();
    }


}
