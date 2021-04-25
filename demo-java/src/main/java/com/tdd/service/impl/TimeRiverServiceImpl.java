package com.tdd.service.impl;


import com.tdd.dto.TimerRiverDTO;
import com.tdd.entity.TimeRiver;
import com.tdd.mapper.TimeRiverMapper;
import com.tdd.service.TimeRiverService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
@Service
public class TimeRiverServiceImpl implements TimeRiverService {

    @Autowired
    TimeRiverMapper timeRiverMapper;


    @Override
    public Integer addTimeRiver(TimeRiver timeRiver) {

        return timeRiverMapper.insertSelective(timeRiver);
    }

    @Override
    public List<TimerRiverDTO> findByType(TimeRiver timeRiver) {
        List<TimeRiver>  timeRivers = timeRiverMapper.selectByType(timeRiver.getType());
        List<TimerRiverDTO> timerRiverDTOS = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(TimeRiver tr : timeRivers) {
            TimerRiverDTO timerRiverDTO = new TimerRiverDTO();
            BeanUtils.copyProperties(tr,timerRiverDTO);
            timerRiverDTO.setCreateTime(sdf.format(tr.getCreateTime()));
            timerRiverDTOS.add(timerRiverDTO);
        }
        return timerRiverDTOS;
    }
}
