package com.bianjiahao.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.bianjiahao.api.entity.User;
import com.bianjiahao.api.service.UserService;
import com.bianjiahao.api.util.R;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
@RefreshScope
public class UserController {

    @Reference
    private UserService userServicer;
    @Value("${user.userName}")
    private String test;

    @RequestMapping("/user")
    public R getUser() {
        User sadq = userServicer.getUser("sadq");
        System.out.println(sadq);
        return R.ok().put("user",sadq);

    }

    @RequestMapping("/test")
    public R test() {
        return R.ok().put("data",test);
    }
}
