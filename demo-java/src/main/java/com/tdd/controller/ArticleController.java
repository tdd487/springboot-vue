package com.tdd.controller;

import com.tdd.dto.QueryDTO;
import com.tdd.result.Result;
import com.tdd.service.ArticleService;
import com.tdd.vo.ArticleVO;
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
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/wormer_api/article")
    public Result index(@RequestBody QueryDTO queryDTO){
        return new Result(200,"",articleService.select());
    }

    @PostMapping("/wormer_api/articleById")
    public Result articleById(@RequestBody QueryDTO queryDTO){
        ArticleVO vo = new ArticleVO();
        vo.setId(queryDTO.getId());
        return new Result(200,"",articleService.selectById(vo));
    }
}
