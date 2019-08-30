package com.mybatis.demo.dao;

import com.mybatis.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao
{
    List<User> getAll(String email);
}
