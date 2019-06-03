package com.example.demo.service.impl;

import com.example.demo.dao.InterfaceDao;
import com.example.demo.entity.InterfaceVO;
import com.example.demo.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/3.
 */
@Service
public class InterfaceServiceImpl implements InterfaceService {

    @Autowired
    public InterfaceDao interfaceDao;
    @Override
    public List<InterfaceVO> getList() {
        return interfaceDao.getList();
    }
}
