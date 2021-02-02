package com.tdd.service;

import com.tdd.dto.LoginDTO;
import com.tdd.result.Result;

/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description:
 **/

public interface LoginService {
    public Result login(LoginDTO loginDTO);
}
