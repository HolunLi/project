package Book;

import java.util.Scanner;

class Person{
    private String name;
    private int age;

    //这里为该类定义了一个无参构造方法，实际上如果该类中没有定义任何构造方法，系统会默认提供一个无参构造方法
    Person(){}

    //获取姓名并输出
    void getName(String name)
    {
        this.name = name;
        System.out.println("姓名:" + name);
    }

    //获取年龄并输出
    void getAge(int age)
    {
        this.age = age;
        System.out.println("年龄:" + age);
    }
}

class Student extends Person{
    private String id;
    private double credit;
    Scanner reader = new Scanner(System.in);

    //为该类定义构造方法,并初始化成员变量id, credit
    Student(String id, double credit){
        this.id = id;
        this.credit = credit;
    }

    //获取学号并输出
    void setId(String id)
    {
        this.id = id;
        System.out.println("学号:" + id);
    }

    //设置选修课
    void selectCourse()
    {
        int n = 0;
        char c;
        String[] array = new String[10];

        System.out.println("开始选修课程!不能超过10门选课!");
        for (int i = 0; ; i++) {
            System.out.printf("请输入第%d门要选修的课程名:", i+1);
            array[i] = reader.next();
            n++;
            credit = credit + 2;
            System.out.println("我已经选修了课程!");
            System.out.print("请输入是否继续选修下一门课程(Y/N):");
            c = reader.next().charAt(0);
            if (c=='Y' || c=='y')
                continue;
            else
                break;
        }

        //输出选修的课程数，课程名和学分
        System.out.printf("该学生共选修了%d门课，分别为:%n", n);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.printf("%n学分为:%.0f%n", credit);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Student stu_1 = new Student("0000", 0);
        Student stu_2 = new Student("0000", 0);


        System.out.println("第一位学生的信息:");
        System.out.println("========================================");
        stu_1.getName("Holun Li");
        stu_1.getAge(22);
        stu_1.setId("2040435103");
        stu_1.selectCourse();
        System.out.println("========================================");

        System.out.printf("%n第二位学生的信息:%n");
        System.out.println("========================================");
        stu_2.getName("Wenjie Yang");
        stu_2.getAge(21);
        stu_2.setId("2040435106");
        stu_2.selectCourse();
        System.out.println("========================================");
    }
}


