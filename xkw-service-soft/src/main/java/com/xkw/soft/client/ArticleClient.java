package com.xkw.soft.client;

import com.xkw.framework.domain.article.request.ArticleListRequest;
import com.xkw.framework.domain.article.response.ArticleListResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "xkw-service-article") //指定远程调用的服务名
public interface ArticleClient {
    @GetMapping("/article/list") //用GetMapping标识远程调用的http的方法类型
    public ArticleListResponse getArticleList(@RequestParam(value = "id")Integer id);
    @GetMapping("/article/get/{id}")
    public ArticleListResponse findById(@PathVariable("id") Integer id);
}
