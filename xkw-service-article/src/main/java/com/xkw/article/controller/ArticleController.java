package com.xkw.article.controller;

import com.xkw.framework.api.article.ArticleControllerApi;
import com.xkw.framework.domain.article.request.ArticleListRequest;
import com.xkw.framework.domain.article.response.ArticleListResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController implements ArticleControllerApi {
    @Override
    @GetMapping("/list")
    public ArticleListResponse GetSoftList( ArticleListRequest model) {
        ArticleListResponse response=new ArticleListResponse();
        response.setId(8);
        return response;
    }

    @Override
    @GetMapping("/get/{id}")
    public ArticleListResponse findById(@PathVariable("id") Integer id) {
        ArticleListResponse response=new ArticleListResponse();
        response.setId(id);
        return response;
    }
}
