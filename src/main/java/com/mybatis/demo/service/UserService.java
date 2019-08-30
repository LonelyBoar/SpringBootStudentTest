package com.mybatis.demo.service;

import com.mybatis.demo.dao.UserDao;
import com.mybatis.demo.model.Student;
import com.mybatis.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    UserDao _UserDao;

    public List<User> getAll(String email) {
        return _UserDao.getAll(email);
    }

}

