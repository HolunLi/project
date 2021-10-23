package HomeWork;

import java.util.Iterator;
import java.util.LinkedList;

class Student1 {
    String name;
    int score;

    Student1(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}

public class Example7_8 {
    public static void main(String[] args) {
        LinkedList<Student1> mylist = new LinkedList<Student1>();
        Student1 stu1 = new Student1("张小一", 78),
                stu2 = new Student1("王小二", 98),
                stu3 = new Student1("李大山", 67);
        mylist.add(stu1);
        mylist.add(stu2);
        mylist.add(stu3);
        int number = mylist.size();
        System.out.println("现在链表中有" + number + "个节点:");
        for (int i = 0; i < number; i++) {
            Student1 temp = mylist.get(i); //这里使用泛型类LinkedList<E>中的get()方法，遍历链表
            System.out.printf("第" + i + "节点中的数据,学生:%s,分数:%d\n", temp.name, temp.score);
        }
        Student1 removeSTU = mylist.remove(1);
        System.out.printf("被删除的节点中的数据是:%s,%d\n", removeSTU.name, removeSTU.score);
        Student1 replaceSTU = mylist.set(1, new Student1("赵钩林", 68));
        System.out.printf("被替换的节点中的数据是:%s,%d\n", replaceSTU.name, replaceSTU.score);
        number = mylist.size();
        Iterator<Student1> iter = mylist.iterator();
        System.out.println("现在链表中有" + number + "个节点:");
        for (int i = 0; i < number; i++) {
            Student1 te = iter.next(); //这里使用泛型类Iterator<E>中的next()方法，遍历链表
            System.out.printf("第" + i + "节点中的数据,学生:%s,分数:%d\n", te.name, te.score);
        }
        if (mylist.contains(stu1))
        {
            System.out.println("链表包含" + stu1 + ":");
            System.out.println(stu1.name + "," + stu1.score);
        }
        else
            System.out.println("链表没有节点包含有" + stu1);
    }
}
