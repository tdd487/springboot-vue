package com.tdd.mapper;



import com.tdd.entity.Article;
import com.tdd.entity.UserInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserInfoMapperTest {
    @Autowired
    UserInfoMapper userInfoMapper;



    @Test
    @DisplayName("保存授权用户")
    public void selectById(){

        UserInfo userInfo = new UserInfo();
        userInfo.setNickName("也好");
        userInfo.setAvatarUrl("www.baidu.com");
        userInfo.setCity("南宁");
        userInfo.setCountry("中国");
        userInfo.setLanguage("zh_CN");
        userInfo.setProvince("广西");
        userInfo.setGender(1);
        Integer result= userInfoMapper.insertUserInfo(userInfo);
        System.out.println(result);
    }
}