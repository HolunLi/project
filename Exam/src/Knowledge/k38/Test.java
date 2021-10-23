package Knowledge.k38;

import java.util.ArrayList;
import java.util.LinkedList;

/*
时间: 2021-2-13 12:09:02
知识点: 如何使用 - public ArrayList(Collection<? extends E> c); 这个构造方法
 */

public class Test {
    public static void main(String[] args) {
        //构造一个LinkedList集合,并往集合中添加元素
        LinkedList l1 = new LinkedList(); ///l1指向这个LinkedList集合
        l1.add(12);
        l1.add(23);
        l1.add(34);

        //构造一个包含集合l1中所有元素的ArrayList集合
        ArrayList l2 = new ArrayList(l1); //l2指向这个ArrayList集合
        //输出集合l2中的所有元素
        for (Object o : l2)
            System.out.print(o + " "); //输出:12 23 34
    }
}