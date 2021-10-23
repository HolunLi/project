package Knowledge.k48;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
时间: 2021-2-27 19:29:28
知识点: 往Set集合中添加元素,必须保证添加的元素对应的类中已重写hashCode和equals方法
 */

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    //重写equals方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    //重写hashCode
    public int hashCode() {
        /*Objects是一个工具类,hash是该类中的一个静态方法
        调用该方法可以获取name的哈希码值*/
        return Objects.hash(name);
    }
}

public class Test {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        Student s1 = new Student("Holun");
        Student s2 = new Student("Holun");

        //往HashSet集合中添加对象s1,s2,这两个对象的内容相同
        set.add(s1);
        set.add(s2);

        //使用增强for循环遍历HashSer集合
        for (Student s : set)
            System.out.println(s);
    }
}
