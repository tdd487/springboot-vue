package com.tdd.mapper;

import com.tdd.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description: TODO
 **/

public interface UserMapper extends BaseMapper<User> {
    IPage<User> selectUserPage(Page<User> page,String keyword);
    User select(@Param("username") String username,@Param("password") String password);
}
