package com.tdd.controller;


import com.tdd.dto.QueryDTO;
import com.tdd.dto.TimerRiverDTO;
import com.tdd.entity.TimeRiver;
import com.tdd.result.Result;
import com.tdd.service.TimeRiverService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static javafx.scene.input.KeyCode.T;


/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description 用户管理
 */
@RestController
public class TimeRiverController {

    @Autowired
    TimeRiverService timeRiverService;

    //时间长河
    @PostMapping("/wormer_api/addTimeRiver")
    public Result index(@RequestBody TimerRiverDTO timerRiverDTO){

        TimeRiver timerRiver = new TimeRiver();
        BeanUtils.copyProperties(timerRiverDTO,timerRiver);
        timerRiver.setCreateTime(new Date());
        return new Result(200,"",timeRiverService.addTimeRiver(timerRiver));
    }
    //时间长河
    @PostMapping("/wormer_api/updateTimeRiver")
    public Result updateTimeRiver(@RequestBody TimerRiverDTO timerRiverDTO){

        TimeRiver timerRiver = new TimeRiver();
        BeanUtils.copyProperties(timerRiverDTO,timerRiver);
        timerRiver.setCreateTime(new Date());
        return new Result(200,"",timeRiverService.updateTimeRiverById(timerRiver));
    }
    //时间长河
    @PostMapping("/wormer_api/delTimeRiver")
    public Result delTimeRiver(@RequestBody TimerRiverDTO timerRiverDTO){
        return new Result(200,"",timeRiverService.deleteById(timerRiverDTO.getId()));
    }
    //时间长河
    @PostMapping("/wormer_api/findTimeRiver")
    public Result findTimeRiver(@RequestBody TimerRiverDTO timerRiverDTO){
        TimeRiver timerRiver = new TimeRiver();
        BeanUtils.copyProperties(timerRiverDTO,timerRiver);
        return new Result(200,"",timeRiverService.findByType(timerRiver));
    }
}
