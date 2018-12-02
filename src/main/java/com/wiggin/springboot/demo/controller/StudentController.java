package com.wiggin.springboot.demo.controller;

import com.wiggin.springboot.demo.model.Student;
import com.wiggin.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * copyright 2015-2020
 *
 * @author wiggin
 * @date 2017/9/26 22:48
 * @Description: 控制器
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/qryById")
    public Student qry(int id){
        System.out.println("this is v1 0");
        return service.queryById(id);
    }

    @RequestMapping(value = "/qryById")
    public Student qry(int id){
        Student student = new Student();
        student.setId(1);
        student.setAddress("广东");
        student.setName("jack");
        student.setDepartment("学习部");
        student.setSex("男");
        return student;
    }

    @RequestMapping(value = "/getStudent")
    public Student qry(int id){
        Student student = new Student();
        student.setId(2);
        student.setAddress("广东");
        student.setBirth(new Date());
        student.setDepartment("纪检部");
        student.setSex("男");
        return student;
    }
}
