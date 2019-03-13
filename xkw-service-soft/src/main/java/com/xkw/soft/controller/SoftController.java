package com.xkw.soft.controller;

import com.xkw.framework.api.soft.SoftControllerApi;
import com.xkw.framework.domain.article.request.ArticleListRequest;
import com.xkw.framework.domain.article.response.ArticleListResponse;
import com.xkw.framework.domain.soft.response.SoftListResponse;
import com.xkw.soft.client.ArticleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soft")
public class SoftController implements SoftControllerApi {
    @Autowired
    ArticleClient client;
    @Override
    @GetMapping("/list")
    public SoftListResponse GetSoftList() {

      ArticleListResponse response1= client.getArticleList(18);

        SoftListResponse response=new SoftListResponse();
        response.setId(1);
        return response;
    }
}
