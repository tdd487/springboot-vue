package com.tdd.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description: 用户实体类
 **/
@TableName(value = "article")
public class ArticleVO {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer catid;
    private String title;
    private String cnum;
    private String description;
    private String content;
    private Long updatetime;
    private Integer views;
    private String thumb;

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", catid='" + catid + '\'' +
                ", title='" + title + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", views='" + views + '\'' +
                ", cnum='" + cnum + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", thumb='" + thumb + '\'' +
                '}';
    }
}
