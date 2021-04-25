package com.tdd.service.impl;


import com.tdd.entity.UserInfo;
import com.tdd.mapper.UserInfoMapper;
import com.tdd.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Integer addUserInfo(UserInfo userInfo) {
        UserInfo userInfo1 = userInfoMapper.selectByNickName(userInfo);
        if(null != userInfo1) {
            return userInfo1.getId();
        }else{
            userInfoMapper.insertUserInfo(userInfo);
            return userInfo.getId();
        }

    }
}
