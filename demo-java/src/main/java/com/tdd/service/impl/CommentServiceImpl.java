package com.tdd.service.impl;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tdd.dto.QueryDTO;
import com.tdd.entity.Article;
import com.tdd.entity.Comment;
import com.tdd.mapper.ArticleMapper;
import com.tdd.mapper.CommentMapper;
import com.tdd.service.ArticleService;
import com.tdd.service.CommentService;
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
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> selectAll() {

        return commentMapper.selectAll();
    }

    @Override
    public List<Comment> selectByArticleId(Comment comment) {
        return commentMapper.selectByArticleId(comment);
    }

    @Override
    public int saveComment(Comment comment) {
        return commentMapper.saveComment(comment);
    }
}
