package HomeWork;

import java.util.LinkedList;

class Person{
    String name;
    char sex;
}

class Student extends Person
{
    String number;

    //定义该类的构造方法，并用该构造方法初始化该类的成员变量
    Student(String name, char sex, String number)
    {
        this.name = name;
        this.sex = sex;
        this.number = number;
    }
}

public class Test5 {
    public static void main(String[] args) {
        LinkedList<Student> mylist  = new LinkedList<Student>();
        Student[] stu = new Student[3];

        //向链表中加入节点
        stu[0] = new Student("小明", '男', "17171");
        stu[1] = new Student("小红", '女', "17172");
        stu[2] = new Student("小亮", '男', "17173");
        for (int i = 0; i < stu.length; i++)
            mylist.add(stu[i]);

        //遍历链表
        for (int i = 0; i < mylist.size(); i++) {
            Student aStu = mylist.get(i);
            System.out.printf("链表中第%d个节点中的数据为:%s,%c,%s\n", i+1,
                               aStu.name, aStu.sex, aStu.number);
        }

        //获取该链表第一个对象中学生的名字与最后一个对象中学生的名字
        Student bStu = mylist.getFirst();
        System.out.printf("该链表第一个对象中学生的名字为:%s\n", bStu.name);
        bStu = mylist.pollLast();
        System.out.printf("该链表最后一个对象中学生的名字为:%s\n", bStu.name);

        //获取对象stu[1]在链表中的位置
        System.out.printf("对象stu[1]在链表中的位置为%d\n", mylist.indexOf(stu[1])+1);
    }
}


