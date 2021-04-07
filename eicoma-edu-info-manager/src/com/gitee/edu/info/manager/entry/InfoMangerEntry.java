package com.gitee.edu.info.manager.entry;

import com.gitee.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoMangerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------欢迎来到黑马信息管理系统--------");
        System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
        String choice = sc.next();

        while (true){
            switch(choice){
                case "1":
                    System.out.println("欢迎来到学生信息管理系统！");
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("欢迎来到老师信息管理系统！");
                    break;
                case "3":
                    System.out.println("感谢您的使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }

    }
}
