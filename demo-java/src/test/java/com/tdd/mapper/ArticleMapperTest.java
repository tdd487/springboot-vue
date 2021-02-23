package com.tdd.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tdd.entity.Article;
import com.tdd.entity.User;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ArticleMapperTest {
    @Autowired
    ArticleMapper articleMapper;


    @Test
    @DisplayName("分页查询")
    public void testSelectUserPages(){
        Integer pageNo=0;
        Integer pageSize=4;
        Page<User> page=new Page<>(pageNo,pageSize);
        //IPage<User> userIPage=userMapper.selectUserPage(page,"");
        List<Article> article = articleMapper.select();
        System.out.println(article.toString());
    }

    @Test
    @DisplayName("根据id查询")
    public void selectById(){
        Integer id=1;
        Article article = articleMapper.selectById(id);
        System.out.println(article.toString());
    }
}