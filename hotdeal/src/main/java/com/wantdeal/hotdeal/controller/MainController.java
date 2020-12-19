package com.wantdeal.hotdeal.controller;


import com.wantdeal.hotdeal.service.UserClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
@RefreshScope
@RequiredArgsConstructor
public class MainController {

    private final UserClientService userClientService;

    @Value("${server.port}")
    private int port;

    @Value("${spring.message}")
    private String message;

    @GetMapping("/hotdeal/detail")
    public String hotdealDetail() {
        return "hotdeal Detail - Port " + port + " - " + message;
    }

    @GetMapping("/hotdeal")
    public String hotdeal() {
        return "hotdeal - Port " + port + " - " + message;
    }

    @GetMapping("/hotdeal/fegin/user")
    public String userFegin() { return userClientService.getUser(); }

    @GetMapping("/hotdeal/fegin/user/detail")
    public String userDetailFegin() { return userClientService.getUserDetail(); }
}


