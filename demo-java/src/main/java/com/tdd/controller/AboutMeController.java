package com.tdd.controller;


import com.tdd.dto.QueryDTO;
import com.tdd.result.Result;
import com.tdd.service.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description 用户管理
 */
@RestController
public class AboutMeController {

    @Autowired
    AboutMeService aboutMeService;

    //关于我
    @PostMapping("/wormer_api/aboutMe")
    public Result index(@RequestBody QueryDTO queryDTO){
        return new Result(200,"",aboutMeService.selectByPrimaryKey(queryDTO.getId()));
    }
}
