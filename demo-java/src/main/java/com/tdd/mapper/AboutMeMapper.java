package com.tdd.mapper;

import com.tdd.entity.AboutMe;

public interface AboutMeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AboutMe record);

    int insertSelective(AboutMe record);

    AboutMe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AboutMe record);

    int updateByPrimaryKey(AboutMe record);
}