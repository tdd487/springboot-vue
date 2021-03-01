package com.tdd.controller;


import com.tdd.dto.CommentDTO;
import com.tdd.dto.QueryDTO;
import com.tdd.entity.Comment;
import com.tdd.result.Result;
import com.tdd.service.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tdd
 * @Date 2021/2/21
 * @Description
 */
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;


    @PostMapping("/wormer_api/comment/selectAll")
    public Result selectAll(@RequestBody QueryDTO queryDTO){
        return new Result(200,"",commentService.selectAll());
    }

    @PostMapping("/wormer_api/comment/selectByArticleId")
    public Result selectAll(@RequestBody CommentDTO commentDTO){
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO,comment);
        return new Result(200,"",commentService.selectByArticleId(comment));
    }

    @PostMapping("/wormer_api/comment/saveComment")
    public Result saveComment(@RequestBody CommentDTO commentDTO){
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO,comment);
        return new Result(200,"",commentService.saveComment(comment));
    }
}
