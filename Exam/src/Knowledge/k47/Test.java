package Knowledge.k47;

/*
时间: 2021-2-20 21:17:24
知识点: 测试Map集合
 */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        //往Map集合中添加4个元素(键值对)
        myMap.put(1, "Holun");
        myMap.put(2, "Jimi");
        myMap.put(3, "Mola");
        myMap.put(4, "Kaka");

        //取出Map集合中所有的key
        Set<Integer> set = myMap.keySet();
        Iterator<Integer> it1 = set.iterator();
        while (it1.hasNext())
            System.out.print(it1.next() + " ");
        System.out.println();
        /*使用增强for遍历Set集合中的元素
        for (Integer integer: set)
            System.out.print(integer + " ");*/

        //取出Map集合中所有的value
        Collection<String> c = myMap.values();
        Iterator<String> it2 = c.iterator();
        for (;it2.hasNext();)
            System.out.print(it2.next() + " ");
        System.out.println();

        //取出Map集合中所有的键值对
        Set<Map.Entry<Integer,String>> set2 = myMap.entrySet();
        /*Iterator<Map.Entry<Integer,String>> it3 = set2.iterator();
        while (it3.hasNext()) {
            Map.Entry<Integer,String> m = it3.next();
            System.out.println(m.getKey() + "," + m.getValue());
        }*/
        //这里使用增强for遍历会更好
        for (Map.Entry<Integer,String> m : set2)
            System.out.println(m.getKey() + "," + m.getValue());
    }
}

