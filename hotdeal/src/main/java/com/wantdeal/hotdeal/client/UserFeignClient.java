package com.wantdeal.hotdeal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
public interface UserFeignClient {
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/v1/user",
            consumes = "application/json")
    String getUser();

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/v1/user/detail",
            consumes = "application/json")
    String getUserDetail();
}
