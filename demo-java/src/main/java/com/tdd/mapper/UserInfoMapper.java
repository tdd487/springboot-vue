package com.tdd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tdd.entity.UserInfo;
import org.apache.ibatis.annotations.Param;


/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description: TODO
 **/

public interface UserInfoMapper extends BaseMapper<UserInfo> {

    int insertUserInfo(@Param("userInfo") UserInfo userInfo);
}
