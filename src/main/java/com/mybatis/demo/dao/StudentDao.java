package com.mybatis.demo.dao;

import com.mybatis.demo.model.Student;

import java.util.List;

public interface StudentDao
{
    List<Student> getAll();
}
