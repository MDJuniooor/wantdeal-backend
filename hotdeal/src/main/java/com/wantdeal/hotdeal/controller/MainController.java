package com.wantdeal.hotdeal.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
@RefreshScope
public class MainController {

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
}


