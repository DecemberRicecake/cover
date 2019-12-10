package com.jiajia.cover.dao;

import com.jiajia.cover.entity.UserHouse;

public interface UserHouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserHouse record);

    int insertSelective(UserHouse record);

    UserHouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserHouse record);

    int updateByPrimaryKey(UserHouse record);
}