package com.tdd.service.impl;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tdd.dto.QueryDTO;
import com.tdd.entity.Article;
import com.tdd.mapper.ArticleMapper;
import com.tdd.service.ArticleService;
import com.tdd.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public IPage<Article> selectUserPage(QueryDTO queryDTO) {
        Page<Article> page=new Page<>(queryDTO.getPageNo(),queryDTO.getPageSize());
        return articleMapper.selectUserPage(page,queryDTO.getKeyword());
    }

    @Override
    public List<ArticleVO> select() {
        List<Article> list = articleMapper.select();
        List<ArticleVO> voList = new ArrayList<>();
        for(Article a : list) {
            ArticleVO vo = new ArticleVO();
            vo.setId(a.getId());
            vo.setCatid(a.getCatid());
            vo.setCnum(a.getCnum());
            vo.setContent(a.getContent());
            vo.setDescription(a.getDescription());
            vo.setThumb(a.getThumb());
            vo.setTitle(a.getTitle());
            vo.setViews(a.getViews());
            vo.setUpdatetime(a.getUpdatetime().getTime());
            voList.add(vo);
        }
        return voList;
    }

    @Override
    public ArticleVO selectById(ArticleVO articleVO) {
        Article a = articleMapper.selectById(articleVO.getId());
        ArticleVO vo = new ArticleVO();
        vo.setThumb(a.getThumb());
        vo.setTitle(a.getTitle());
        vo.setViews(a.getViews());
        vo.setUpdatetime(a.getUpdatetime().getTime());
        vo.setId(a.getId());
        vo.setCatid(a.getCatid());
        vo.setCnum(a.getCnum());
        vo.setContent(a.getContent());
        vo.setDescription(a.getDescription());

        return vo;
    }


}
