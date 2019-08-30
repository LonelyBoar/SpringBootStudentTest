package com.mybatis.demo.service;

import com.mybatis.demo.dao.StudentDao;
import com.mybatis.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    public StudentDao _StudentDao;

    public List<Student> getAll() {
        return _StudentDao.getAll();
    }
    public boolean addStudent(Student student)
    {
        return _StudentDao.addStudent(student);
    }

    public boolean deleteStudentById(String id)
    {
        return _StudentDao.deleteStudentById(id);
    }

    public boolean updateStudent(Student student)
    {
        return _StudentDao.updateStudent(student);
    }
}
