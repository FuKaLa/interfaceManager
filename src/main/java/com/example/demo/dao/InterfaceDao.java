package com.example.demo.dao;

import com.example.demo.entity.InterfaceVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/6/3.
 */
@Mapper
@Repository
public interface InterfaceDao {
    List<InterfaceVO> getList();
}
