package Knowledge.k50;

import java.util.*;

/*
时间: 2021-3-6 13:06:24
知识点:往可支持排序的集合中添加元素,必须保证该元素对应的类实现了Comparable接口,以TreeSet和TreeMap为例
 */

//Student类实现Comparable接口,即该类支持排序
class Student implements Comparable<Student> {
    private int age;
    private String name;

    public Student(int age, String name) { this.age = age; this.name = name; }

    public String toString() { return this.age + "," + this.name; }

    /*在Student类中重写Comparable接口中的compareTo方法,在该方法中编写比较规则
      用于比较两个Student类型对象之间的大小*/
    public int compareTo(Student o) {
        //这里将属性age的大小就作为两个Student类型对象的大小
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else //age相同的Student对象,按name进行排序,即再按name比较大小
            return this.name.compareTo(o.name);
    }
}


public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(18,"Holun");
        students[1] = new Student(12,"Bob");
        students[2] = new Student(18,"Alex");
        students[3] = new Student(24,"lisa");

        //往TreeSet中添加一个元素,必须保证该元素对应的类已实现Comparable接口
        Set<Student> mySet = new TreeSet<>();
        mySet.add(students[0]);
        mySet.add(students[1]);
        mySet.add(students[2]);
        mySet.add(students[3]);
        //遍历TreeSet中的元素
        for (Student student : mySet)
            System.out.println(student);
        System.out.println();

        //往TreeMap中一个键值对,必须保证该键值对中key对应的类已实现Comparable接口
        Map<Student, Integer> myMap = new TreeMap<>();
        myMap.put(students[0], 1);
        myMap.put(students[1], 2);
        myMap.put(students[2], 3);
        myMap.put(students[3], 4);
        //遍历TreeMap中的元素
        Set<Map.Entry<Student, Integer>> set = myMap.entrySet();
        for (Map.Entry<Student, Integer> node : set)
            System.out.println(node);
    }
}
