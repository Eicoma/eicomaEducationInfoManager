package com.gitee.edu.info.manager.controller;

import java.util.Scanner;

public class StudentController {

    private Scanner sc = new Scanner(System.in);

    public void start() {
        studentLoop:
        while(true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();

            switch (choice){
                case "1":
                    System.out.println("添加学生信息");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生信息");
                    break;
                case "3":
                    System.out.println("修改学生信息");
                    break;
                case  "4":
                    System.out.println("查询学生信息");
                    break;
                case "5":
                    System.out.println("感谢您使用学生信息管理系统！");
                    break studentLoop;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }

    }

    public void addStudent() {
        String inputId = sc.next();

    }
}
