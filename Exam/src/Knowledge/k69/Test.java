package Knowledge.k69;

/*
时间: 2021-3-25 21:53:28
知识点: 序列化集合,也就是将一个集合中的多个对象一起进行序列化
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//定义一个Student类,实现Serializable接口,即支持序列化
class Student implements Serializable {

    //这是一个固定不变的序列版本号(可以自己手动定义,也可以通过IDEA工具自动生成)
    private static final long serialVersionUID = -9040381403454495051L;
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + "," + this.name;
    }
}


public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> myList = new ArrayList<>();
        myList.add(new Student(1, "小红"));
        myList.add(new Student(2, "小军"));
        myList.add(new Student(3, "小亮"));
        myList.add(new Student(4, "小狗"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));

        //将ArrauList集合中的所有对象,转化成字节序列,写入到xxx.txt中
        oos.writeObject(myList);
        /*将xxx.txt中的字节序列全部读取出来,转化成对应的对象后,再将这些对象组成一个集合并返回
        注意这里需要指定这个集合的类型,所以涉及到强制类型转换。*/
        List<Student> newList = (ArrayList<Student>) ois.readObject();
        for (Student stu : newList) {
            System.out.println(stu);
        }

        ois.close();
        oos.close();
    }
}
