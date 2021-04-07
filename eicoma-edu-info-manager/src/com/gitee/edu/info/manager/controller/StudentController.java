package com.gitee.edu.info.manager.controller;

import com.gitee.edu.info.manager.domain.Student;
import com.gitee.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    private Scanner sc = new Scanner(System.in);

    StudentService studentService = new StudentService();


    public void start() {
        studentLoop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println("添加学生信息");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生信息");
                    deleteStudent();
                    break;
                case "3":
                    System.out.println("修改学生信息");
                    break;
                case "4":
                    System.out.println("查询学生信息");
                    findAllstudent();
                    break;
                case "5":
                    System.out.println("感谢您使用学生信息管理系统！");
                    break studentLoop;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }

    }

    public void deleteStudent() {
        while (true) {
            String inputId = sc.next();
            boolean exists = studentService.isExists(inputId);
            if (exists) {
                studentService.deleteStudent(inputId);
                System.out.println("删除成功！");
                break;
            } else {
                System.out.println("该学号不存在，请重新输入");
            }
        }
    }

    public void findAllstudent() {
        Student[] stuArray = studentService.findAllStudent();
        if (stuArray == null) {
            System.out.println("没有学生信息，请录入后再查询");
            return;
        }

        System.out.println(("学号\t\t姓名\t年龄\t生日"));
        for (int i = 0; i < stuArray.length; i++) {
            Student stu = stuArray[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getAge() + "\t" + stu.getName() + "\t\t" + stu.getBirthday());
            }
        }
    }

    //对id进行是否存在的判断
    public void addStudent() {
        String inputId;
        boolean flag = false;
        while (true) {
            System.out.println("请输入学生学号");
            inputId = sc.next();
            flag = studentService.isExists(inputId);
            if (flag) {
                System.out.println("您输入的学号已存在，请重新输入");
            } else {
                break;
            }
        }

        Student stu = inputStudentInfo(inputId);

        boolean hasSpace;
        hasSpace = studentService.addStudent(stu);
        if (hasSpace) {
            System.out.println("学生信息录入成功！");
        } else {
            System.out.println("学生信息录入失败，请联系管理员");
        }

    }

    //学生信息存入学生对象
    public Student inputStudentInfo (String inputId){
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String birthday = sc.next();
        Student stu = new Student();
        stu.setId(inputId);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        return stu;
    }
}
