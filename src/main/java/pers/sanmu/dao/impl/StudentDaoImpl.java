package pers.sanmu.dao.impl;

import pers.sanmu.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void saveStudent() {
        System.out.println("存入一个学生信息。");
    }
}
