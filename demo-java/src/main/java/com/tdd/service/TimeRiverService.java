package com.tdd.service;

import com.tdd.dto.TimerRiverDTO;
import com.tdd.entity.TimeRiver;

import java.util.List;

/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
public interface TimeRiverService {

    Integer addTimeRiver(TimeRiver timeRiver);

    Integer updateTimeRiverById(TimeRiver timeRiver);

    Integer deleteById(Integer id);

    List<TimerRiverDTO> findByType(TimeRiver timeRiver);

}
