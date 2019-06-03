package com.example.demo.controller;

import com.example.demo.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/6/3.
 */
@Controller
@RequestMapping("/interface")
public class InterfaceController {
    @Autowired
    private InterfaceService interfaceService;

    @RequestMapping("/getList")
    public List getList(){
        return interfaceService.getList();
    }

}
