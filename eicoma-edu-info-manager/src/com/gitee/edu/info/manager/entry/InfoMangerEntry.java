package com.gitee.edu.info.manager.entry;

import com.gitee.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoMangerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("--------欢迎来到Eicoma信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            //这一部录入的操作必须也包含在while(true)循环内，不然switch无法在后续的循环中接受到新值，便会无限执行case 1的子句
            String choice = sc.next();


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
