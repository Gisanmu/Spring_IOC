package pers.sanmu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.sanmu.service.StudentService;

public class StudentController {



    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentService studentService = context.getBean("studentServiceImpl",StudentService.class);
        studentService.saveStudent();
    }
}
