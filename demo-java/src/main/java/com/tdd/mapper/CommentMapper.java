package com.tdd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tdd.entity.Article;
import com.tdd.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description: TODO
 **/

public interface CommentMapper extends BaseMapper<Comment> {

    List<Comment> selectAll();
    List<Comment> selectByArticleId(@Param("Comment") Comment comment);

    int saveComment(@Param("Comment") Comment comment);

}
