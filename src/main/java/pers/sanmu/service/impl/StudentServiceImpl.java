package pers.sanmu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import pers.sanmu.dao.StudentDao;
import pers.sanmu.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {

    /**
     * 可以使用set注入或@Autuwrite注解注入
     */
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        studentDao.saveStudent();
    }
}
