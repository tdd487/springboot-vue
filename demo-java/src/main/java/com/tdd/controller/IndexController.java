package com.tdd.controller;

import com.tdd.dto.QueryDTO;
import com.tdd.entity.User;
import com.tdd.result.Result;
import com.tdd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author tdd
 * @Date 2021/2/21
 * @Description
 */
@RestController
public class IndexController {

    @PostMapping("/apiii/index")
    public Result index(@RequestBody QueryDTO queryDTO){
        return new Result(200,"","傻逼");
    }
}
