package com.tdd.dto;

/**
 * @Author tdd
 * @Date 2021/1/23
 * @Description 查询业务实体
 * 这里仅仅定义了三个参数，在实际应用中可以定义多个参数
 */
public class CommentDTO {

    private Integer id;
    private String userId;
    private String articleId;
    private Integer commentContent;

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

    public Integer getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(Integer commentContent) {
        this.commentContent = commentContent;
    }
}

