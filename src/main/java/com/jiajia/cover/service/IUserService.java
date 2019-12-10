package com.jiajia.cover.service;

import com.jiajia.cover.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUserInfo();

    User getUserInfo();

}
