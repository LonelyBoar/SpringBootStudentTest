package com.mybatis.demo.controller;

import com.mybatis.demo.model.Student;
import com.mybatis.demo.model.User;
import com.mybatis.demo.service.StudentService;
import com.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController
{
    @Autowired
    StudentService _StudentService;

    @RequestMapping("/getAll")
    public ModelAndView getAll()
    {
        ModelAndView mv = new ModelAndView();
         List<Student> StudentTemp =  _StudentService.getAll();
        StudentTemp.add(new Student(){});
        mv.addObject("StudentList",StudentTemp);
        //要跳转的页面
        mv.setViewName("Student");
        return mv;
    }

    @RequestMapping("/addStudentView")
    public ModelAndView addStudentView()
    {
        ModelAndView mv = new ModelAndView("addStudent");
        return  mv;
    }
    @RequestMapping("/addStudent")
    public ModelAndView addStudent(Student _Student)
    {
        _StudentService.addStudent(_Student);
        ModelAndView mv = new ModelAndView();
        List<Student> StudentTemp =  _StudentService.getAll();
        mv.addObject("StudentList",StudentTemp);
        mv.setViewName("Student");
        return  mv;
    }

    @RequestMapping("/deleteStudent")
    public ModelAndView deleteStudent(String id)
    {
        _StudentService.deleteStudentById(id);
        ModelAndView mv = new ModelAndView();
        List<Student> StudentTemp =  _StudentService.getAll();
        mv.addObject("StudentList",StudentTemp);
        return  mv;
    }
    @RequestMapping("/UpdateStudent")
    public ModelAndView deleteStudent(Student _Student)
    {
        _StudentService.updateStudent(_Student);
        ModelAndView mv = new ModelAndView();
        List<Student> StudentTemp =  _StudentService.getAll();
        mv.addObject("StudentList",StudentTemp);
        return  mv;
    }
}
