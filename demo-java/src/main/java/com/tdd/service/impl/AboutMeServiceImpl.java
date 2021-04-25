package com.tdd.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tdd.dto.QueryDTO;
import com.tdd.entity.AboutMe;
import com.tdd.entity.User;
import com.tdd.mapper.AboutMeMapper;
import com.tdd.mapper.UserMapper;
import com.tdd.service.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
@Service
public class AboutMeServiceImpl implements AboutMeService {

    @Autowired
    AboutMeMapper aboutMeMapper;


    @Override
    public AboutMe selectByPrimaryKey(Integer id) {
        return aboutMeMapper.selectByPrimaryKey(id);
    }
}
