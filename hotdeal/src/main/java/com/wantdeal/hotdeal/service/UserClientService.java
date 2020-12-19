package com.wantdeal.hotdeal.service;

import com.wantdeal.hotdeal.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserClientService {
    @Autowired
    UserFeignClient userFeignClient;

    public String getUser(){
        return userFeignClient.getUser();
    }

    public String getUserDetail(){
        return userFeignClient.getUserDetail();
    }
}
