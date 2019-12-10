package com.jiajia.cover.service.impl;

import com.jiajia.cover.dao.UserMapper;
import com.jiajia.cover.entity.User;
import com.jiajia.cover.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUserInfo() {
        return userMapper.queryAllUser();
    }

    @Override
    public User getUserInfo() {
        return userMapper.getUserInfo();
    }


}
