package com.wantdeal.authservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClientDto {

    private String name;
    private String redirectUri;
    private String clientType;
}

