package com.example.demo.controller;

import com.example.demo.entity.AchievementVO;
import com.example.demo.service.InterfaceService;
import com.example.demo.utils.R;
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
    public R getTeach(){
        return R.resultData(interfaceService.getTeach());
    }

    @RequestMapping("/getAdmin")
    public R getAdmin(){
        return R.resultData(interfaceService.getAdmin());
    }

    /**
     * 老师type 2 ,其他是1
     * @param type
     * @return
     */
    @RequestMapping("/getAch")
    public R getAch(Integer type,String username){
        List<AchievementVO> list = interfaceService.getAch(type);
        if(type == 5){
            for (AchievementVO vo : list){
                vo.setTeacher(username);
            }
        }
        return R.resultData(list);
    }


}
