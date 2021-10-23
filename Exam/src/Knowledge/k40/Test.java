package Knowledge.k40;

import java.util.ArrayList;
import java.util.List;

/*
时间: 2021-2-15 16:51:29
知识点: 构造集合时,使用泛型
 */

public class Test {
    public static void main(String[] args) {
        //构造ArrayList集合时,使用泛型
        List<String> arrayList = new ArrayList<String>();
        /*
        解析:
        将String这个引用数据类型作为实参传递给List接口和ArrayList类
        中声明的泛型E,即用String类型替换List接口和ArrayList类中声明的泛型E。
        这个过程实际就是人为指定泛型接口/类/方法中声明的泛型,具体是哪种数据类型。
        此时,ArrayList集合底层的Object[]数组中的元素,就只能存放String对象的地址。
        在不引起误解的情况下,可以理解为:
        ArrayList集合中就只能存放String类型的元素。
        根本原因是:
        add方法中的形参e的类型E(泛型)已被替换成String类型,
        所以只能往集合中添加String类型的元素。
        add方法是ArrayList类中的方法,该方法如下:
        - public boolean add(E e); //形参e的类型E是一个泛型,已被替换成String类型
        */

        arrayList.add("aaaa");
        //已不能往该集合中添加整型常量100,并且在编译阶段,编译器就会报错
        //arrayList.add(100); //红色波浪线,提示有错误

        for(int i = 0; i< arrayList.size();i++){
            /*
            因为get方法的类型E是一个泛型,已被替换成String类型,
            所以取出某个元素不需要再强制类型转换。get方法如下:
            - public E get(int index)
             */
            String item = arrayList.get(i);
            System.out.println(item);
        }
    }
}





