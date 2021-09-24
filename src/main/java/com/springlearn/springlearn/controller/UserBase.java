package com.springlearn.springlearn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
@Slf4j
public class UserBase {
    /**
     * 获取用户信息
     * @return string
     */
    @RequestMapping("/info")
    @ResponseBody
    public String getUser() {
        log.info("output=====> hello world");
        return "hello world";
    }
}
