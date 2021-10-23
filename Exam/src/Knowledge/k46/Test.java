package Knowledge.k46;

/*
时间: 2021-2-20 15:19:58
知识点: 遍历Map集合中元素(键值对)的两种方法
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //HashMap集合实现了Map接口,是一个Map集合
        Map<Integer,String> myMap = new HashMap<>();
        //往Map集合中添加4个元素(键值对)
        myMap.put(1, "Holun");
        myMap.put(2, "Jimi");
        myMap.put(3, "Mola");
        myMap.put(4, "Kaka");

        /*
        方法一:
        Map集合先调用keySet方法返回一个由Map集合中所有的key组成的Set集合
        即返回Map集合中所有的key
         */
        Set<Integer> set1 = myMap.keySet();
        for (Integer in : set1) {
            //Map集合再调用get方法,指定key获取对应的value
            System.out.println(in + "," + myMap.get(in));
        }

        /*
        方法二:
        Map集合先调用entrySet方法返回一个由Map.Entry对象组成的Set集合
        一个Map.Entry对象就是一个键值对,即返回Map集合中所有的键值对
         */
        Set<Map.Entry<Integer,String>> set2 = myMap.entrySet();
        for (Map.Entry<Integer,String> m : set2) {
            //Map.Entry对象再分别调用getKey和getValue方法,获取key和value
            System.out.println(m.getKey() + "," + m.getValue()); //直接输出引用变量m也行
        }
    }
}
