package Knowledge.k51;

/*
时间: 2021-3-8 19:35:32
知识点: 为添加到可排序集合中的元素,提供一个比较器。以TreeSet和TreeMap为例
 */


import java.util.*;

//声明了Student类
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "," +  name;
    }
}

/*StuComparator类实现Comparator接口,并将Student类型作为实参传递
给该接口中声明的泛型T,因此StuComparator类的对象就可以调用Compara方
法比较两个Student对象之间的大小。也就是说StuComparator类的实例就是
Student类的比较器,可以比较Student对象之间的大小*/
class StuComparator implements Comparator<Student> {
    //在StuComparator类中重写Compare方法,在该方法中编写比较规则
    public int compare(Student o1, Student o2) {
        //属性id的大小就作为两个Student对象的大小
        return o1.id - o2.id;
    }
}

public class Test {
    public static void main(String[] args) {
        //在构造TreeSet集合时,提前为添加到TreeSet中的元素,提供一个比较器
        Set<Student> set = new TreeSet(new StuComparator());
        /*或者在构造TreeSet集合时,直接传入一个实现Comparator接口的匿名类的对象作为比较器
        这样就不需要再单独声明一个类去实现Comparator接口
        Set<Student> set1 = new TreeSet<>(new Comparator<Student>() {
            //在这个匿名类中重写compare方法,并编写计较规则
            public int compare(Student o1, Student o2) {
                return o1.id - o2.id;
            }
        });*/

        set.add(new Student(17171, "小红"));
        set.add(new Student(17174, "小军"));
        set.add(new Student(17172, "小亮"));
        set.add(new Student(17173, "小明"));
        //遍历TreeSet集合
        for (Student node : set) {
            System.out.println(node);
        }
        System.out.println();

        /*//在构造TreeMap集合时,提前为添加到TreeMap中的键值对中的key,提供一个比较器
        Map<Student, Integer> myMap = new TreeMap(new StuComparator());
        */
        /*同理在构造TreeMap集合时,也可以直接传入一个实现Comparator接口的匿名类的对象
        作为比较器。这样就不需要再单独声明一个类去实现Comparator接口*/
        Map<Student, Integer> myMap = new TreeMap(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.id - o2.id;
            }
        });
        myMap.put(new Student(17171, "小红"), 1);
        myMap.put(new Student(17174, "小军"), 2);
        myMap.put(new Student(17172, "小亮"), 3);
        myMap.put(new Student(17173, "小明"), 4);
        //遍历TreeSet集合
        Set<Map.Entry<Student,Integer>> nodes = myMap.entrySet();
        for (Map.Entry<Student,Integer> node : nodes) {
            System.out.println(node.getKey() + "," + node.getValue());
        }
    }
}