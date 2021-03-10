package com.tdd.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tdd.dto.QueryDTO;
import com.tdd.dto.UserInfoDTO;
import com.tdd.entity.UserInfo;
import com.tdd.mapper.UserInfoMapper;
import com.tdd.result.Result;
import com.tdd.service.ArticleService;
import com.tdd.service.UserInfoService;
import com.tdd.util.RestUtil;
import com.tdd.vo.ArticleVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sun.net.www.http.HttpClient;

/**
 * @Author tdd
 * @Date 2021/2/21
 * @Description
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserInfoService userInfoService;

    //文章列表
    @PostMapping("/wormer_api/article")
    public Result index(@RequestBody QueryDTO queryDTO){
        return new Result(200,"",articleService.select());
    }

    //根据id查询文章
    @PostMapping("/wormer_api/articleById")
    public Result articleById(@RequestBody QueryDTO queryDTO){
        ArticleVO vo = new ArticleVO();
        vo.setId(queryDTO.getId());
        return new Result(200,"",articleService.selectById(vo));
    }

    //保存授权用户信息
    @PostMapping("/wormer_api/saveUserInfo")
    public Result saveUserInfo(@RequestBody UserInfoDTO userInfoDTO){
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDTO,userInfo);
        return new Result(200,"",userInfoService.addUserInfo(userInfo));
    }

    @PostMapping("wormer_api/jscode2session")
    public Result jscode2session(@RequestBody QueryDTO queryDTO) throws Exception {
        String code = queryDTO.getCode();
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx0b297b9e59b7a475&secret=37d95faa9f9ae0131c09de7637e3d052&js_code="+code+"&grant_type=authorization_code";
        RestUtil restUtil = new RestUtil();
        String resultString = restUtil.load(url,"");
        return new Result(200,"",JSONObject.parse(resultString));
    }
}
