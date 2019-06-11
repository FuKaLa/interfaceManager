package com.example.demo.dao;

import com.example.demo.entity.AchievementVO;
import com.example.demo.entity.AdminVO;
import com.example.demo.entity.InterfaceVO;
import com.example.demo.entity.TeachVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.intellij.lang.annotations.JdkConstants;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/6/3.
 */
@Mapper
@Repository
public interface InterfaceDao {
    List<TeachVO> getTeach();

    List<AdminVO> getAdmin();

    List<AchievementVO> getAch(@Param("type") Integer type);
}
