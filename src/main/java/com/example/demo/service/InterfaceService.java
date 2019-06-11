package com.example.demo.service;

import com.example.demo.entity.AchievementVO;
import com.example.demo.entity.AdminVO;
import com.example.demo.entity.InterfaceVO;
import com.example.demo.entity.TeachVO;

import java.util.List;

/**
 * Created by Administrator on 2019/6/3.
 */
public interface InterfaceService {

    List<TeachVO> getTeach();

    List<AdminVO> getAdmin();

    List<AchievementVO> getAch();
}
