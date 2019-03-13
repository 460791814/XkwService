package com.xkw.framework.api.article;

import com.xkw.framework.domain.article.request.ArticleListRequest;
import com.xkw.framework.domain.article.response.ArticleListResponse;

public interface ArticleControllerApi {
    public ArticleListResponse GetSoftList(ArticleListRequest model);
    public ArticleListResponse findById(Integer id);
}
