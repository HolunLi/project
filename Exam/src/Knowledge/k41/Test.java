package Knowledge.k41;

import java.util.ArrayList;
import java.util.List;

/*
时间: 2021-2-15 20:26:28
知识点: 构造集合时,不使用泛型
 */

public class Test {
    public static void main(String[] args) {
        /*
        构造ArrayList集合时,没有使用泛型。没有使用泛型时,ArrayList类中
        声明的泛型E默认是Object类型。因此,可以往该集合中添加任意类型的元素
         */
        List arrayList = new ArrayList();

        arrayList.add("aaaa");
        arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++) {
            //集合中第二个元素的类型是Integer类型,取出时强制转换成String类型会发生类型转换错误
            String item = (String) arrayList.get(i);
            System.out.println(item);
        }
    }
}
