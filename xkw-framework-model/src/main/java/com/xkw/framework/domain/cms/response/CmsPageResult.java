package com.xkw.framework.domain.cms.response;

import com.xkw.framework.domain.cms.CmsPage;
import com.xkw.framework.model.response.ResponseResult;
import com.xkw.framework.model.response.ResultCode;
import lombok.Data;


@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode,CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
