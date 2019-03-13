package com.xkw.soft.controller;

import com.xkw.framework.api.soft.SoftControllerApi;
import com.xkw.framework.domain.soft.response.SoftListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soft")
public class SoftController implements SoftControllerApi {


    @Override
    @GetMapping("/list")
    public SoftListResponse GetSoftList() {
        SoftListResponse response=new SoftListResponse();
        response.setId(1);
        return response;
    }
}
