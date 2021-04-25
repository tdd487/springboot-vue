package com.tdd.service;

import com.tdd.entity.AboutMe;

import java.util.List;

/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
public interface AboutMeService {

    AboutMe selectByPrimaryKey(Integer id);
}
