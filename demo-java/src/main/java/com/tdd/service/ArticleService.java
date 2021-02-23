package com.tdd.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tdd.dto.QueryDTO;
import com.tdd.entity.Article;
import com.tdd.mapper.ArticleMapper;
import com.tdd.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
public interface ArticleService {

    IPage<Article> selectUserPage(QueryDTO queryDTO);

    List<ArticleVO> select();

    ArticleVO selectById(ArticleVO vo);
}
