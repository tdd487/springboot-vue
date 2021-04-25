package com.tdd.mapper;

import com.tdd.entity.TimeRiver;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimeRiverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TimeRiver record);

    int insertSelective(TimeRiver record);

    TimeRiver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TimeRiver record);

    int updateByPrimaryKey(TimeRiver record);

    List<TimeRiver> selectByType(@Param("type") Integer type);
}