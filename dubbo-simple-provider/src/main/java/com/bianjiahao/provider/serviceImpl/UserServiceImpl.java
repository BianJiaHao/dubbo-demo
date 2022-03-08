package com.bianjiahao.provider.serviceImpl;

import com.bianjiahao.api.entity.User;
import com.bianjiahao.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String userName) {
        return new User(userName,18);
    }
}
