package Knowledge.k52;

/*
时间: 2021-3-9 20:03:13
知识点: 使用Collections类中的sort方法对List集合中的元素进行排序
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Student o) {
        return this.id - o.id;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class StuB implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> myList = new ArrayList<>();
        myList.add(new Student(17171, "holun"));
        myList.add(new Student(17174, "kaka"));
        myList.add(new Student(17172, "jimi"));
        myList.add(new Student(17173, "maka"));
        //排序前
        for (Student student : myList) {
            System.out.println(student);
        }
        System.out.println();

        //Collections.sort(myList); //不提供比较器,必须保证集合中的元素对应的类支持排序,并在ComparaTo方法中编写了相应的比较规则
        Collections.sort(myList, new StuB()); //或者提供一个比较器,对集合中的元素进行排序
        //排序后
        for (Student student : myList) {
            System.out.println(student);
        }

    }
}
