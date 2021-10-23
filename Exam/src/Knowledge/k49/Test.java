package Knowledge.k49;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
时间: 2021-3-3 20:01:26
知识点: /构造一个包含指定“Map集合中所有元素”的HashMap。
 */


public class Test {
    public static void main(String[] args) {
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1, "holun");
        myMap.put(2, "ka");
        myMap.put(3, "lala");
        myMap.put(4, "78");
        myMap.put(1, "xxx");
        myMap.put(5, "xxx");

        Set<Map.Entry<Integer,String>> set1 = myMap.entrySet();
        for (Map.Entry<Integer,String> m : set1) {
            //使用泛型,取出的key是Integer类型和value是String类型
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //构造一个包含myMap中所有键值对的HashMap,myMap指向另一个HashMap
        Map map = new HashMap(myMap);
        Set<Map.Entry> set2 = map.entrySet();
        for (Map.Entry m : set2) {
            //没有使用泛型,取出的key和value默认是Object类型
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
