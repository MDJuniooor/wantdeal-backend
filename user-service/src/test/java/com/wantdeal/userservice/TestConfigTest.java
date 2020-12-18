package com.wantdeal.userservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestConfigTest {
    @Autowired
    private TestConfig testConfig;

    @Test
    void name() {
        String age = testConfig.getAge();

        System.out.println("My age is " + age);
        assertThat(age).isEqualTo("300");
    }
}