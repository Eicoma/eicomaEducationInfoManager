package com.gitee.edu.info.manager.service;

import com.gitee.edu.info.manager.dao.StudentDao;
import com.gitee.edu.info.manager.domain.Student;

public class StudentService {

    private StudentDao studentDao = new StudentDao();

    public boolean addStudent(Student stu) {
        boolean exists = studentDao.addStudent(stu);
        return exists;
    }

    public boolean isExists(String inputId) {
        Student[] stuArray = studentDao.findAllStudent();
        boolean exists = false;
        for (int i = 0; i < stuArray.length; i++) {
            if (stuArray[i] != null && stuArray[i].getId().equals(inputId)){
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        Student[] stuArray = studentDao.findAllStudent();
        boolean flag = false;
        for (int i = 0; i < stuArray.length; i++) {
            Student stu = stuArray[i];
            if (stu != null){
                flag = true;
                break;
            }
        }
        if (flag){
            return stuArray;
        }else{
            return null;
        }
    }


    public void deleteStudent(String inputId) {
        studentDao.deleteStudent(inputId);
    }
}
