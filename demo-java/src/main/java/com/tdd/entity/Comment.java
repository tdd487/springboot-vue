package com.tdd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description: 用户实体类
 **/
@TableName(value = "comment")
public class Comment {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userId;
    private String articleId;
    private String commentContent;

    public Comment() {
    }

    public Comment(Integer id, String userId, String articleId, String commentContent) {
        this.id = id;
        this.userId = userId;
        this.articleId = articleId;
        this.commentContent = commentContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", articleId='" + articleId + '\'' +
                ", commentContent=" + commentContent +
                '}';
    }
}
