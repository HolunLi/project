package Knowledge.k37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
时间: 2021-2-9 17:23:44
知识点: 增强for循环的使用 和 toArray方法的使用
 */

public class Test {
    public static void main(String[] args) {
        Collection e = new ArrayList();

        e.add(100); //自动装箱
        e.add(10.12); //自动
        e.add("Hello!");

        //调用toArray方法返回一个包含ArrayList集合中所有元素的Object[]数组
        Object[] o = e.toArray();

        //使用增强for循环更便于输出(遍历)集合中的元素
        for (Object i : e) //变量e指向ArrayList集合
            System.out.println(i);

        for (Object i : o)
            System.out.println(i);

        //数组也是一个集合可以使用,array是int[]数组
        int[] array = {1,2,3,45,5};
        for (int i : array)
            System.out.print(i + " ");

        ArrayList<Integer> e1 = new ArrayList<Integer>();
        e1.add(123);
        e1.add(1234);
        for (Object i : e1)
            System.out.println(i);
        Iterator<Integer> it = e1.iterator();
        for (int i = 0; i < e1.size(); i++) {
            System.out.println(it.next());
        }
    }
}