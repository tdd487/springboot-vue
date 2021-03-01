package com.tdd.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tdd.dto.QueryDTO;
import com.tdd.entity.Article;
import com.tdd.entity.Comment;
import com.tdd.vo.ArticleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description
 */
public interface CommentService {

    List<Comment> selectAll();
    List<Comment> selectByArticleId(Comment comment);

    int saveComment(Comment comment);
}
