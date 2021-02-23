package com.tdd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tdd.entity.Article;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description: TODO
 **/

public interface ArticleMapper extends BaseMapper<Article> {
    IPage<Article> selectUserPage(Page<Article> page, String keyword);
    List<Article> select();

    Article selectById(@Param("id") Integer id);
}
