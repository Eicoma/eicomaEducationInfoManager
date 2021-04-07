package com.gitee.edu.info.manager.dao;

import com.gitee.edu.info.manager.domain.Student;

public class StudentDao {

    private static Student[] stuArray = new Student[5];

    public boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < stuArray.length; i++) {
            Student student = stuArray[i];
            if (student == null){
                index = i;
                break;
            }
        }

        if (index == -1){
            return false;
        }else{
            stuArray[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stuArray;
    }


    public void deleteStudent(String inputId) {
        for (int i = 0; i < stuArray.length; i++) {
            Student stu = stuArray[i];
            if (stu != null && stu.getId().equals(inputId)){
                stuArray[i] = null;
                break;
            }
        }
    }

    public void updateStudent(String inputId, Student newStu) {
        for (int i = 0; i < stuArray.length; i++) {
            Student stu = stuArray[i];
            if (stu != null && stu.getId().equals(inputId)){
                stuArray[i] = newStu;
                break;
            }
        }
    }
}
