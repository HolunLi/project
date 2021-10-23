package Knowledge.k44;

/*
时间: 2021-2-16 15:03:05
知识点: 定义泛型时,限制泛型的上边界
 */

import java.util.ArrayList;

/*
声明泛型类Generic,并限制泛型T只能是Number类的子类或Number类
所以在使用该泛型类时,传入的类型只能是Number类的子类或Number类
 */
class Generic<T extends Number>{
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    /*
    在泛型类Generic中声明了一个泛型方法fx,并限制泛型k只能
    是String类的子类或String类,所以调用该方法时,传递的实参
    的类型必须是String类的子类或String类。泛型K的作用范围仅限于方法体。
     */
    public <k extends String> void fx(k m) { System.out.println(m); }
    //泛型方法fx中定义的泛型K只能是T类的子类或本身,T类是泛型类Generic中定义的泛型
    //public <k extends T> void fx(k m) { System.out.println(m); }
}

public class Test {
    //该方法中的形参obj为Generic类型(Generic是一个泛型类)
    public static void showKeyValue(Generic<? extends Number> obj) {
        Generic<? extends Number>  g = obj;
        System.out.println(g.getKey());
    }

    public static void main(String[] args) {
        //使用泛型类Generic时,传入的类型(String)不在指定的类型限制范围内,编译器报错
        //Generic<String> g1 = new Generic<>("abc");
        Generic<Integer> g2 = new Generic<>(100);
        System.out.println(g2.getKey()); //输出:100

        //调用fx方法时,传递的实参不是指定的类型,编译器报错
        //g2.fx(123);
        g2.fx("abc"); //输出:abc

        showKeyValue(new Generic<Double>(12.34)); //输出:12.34
        //这一行代码编译器会提示错误,因为String类型并不是Number类型的子类
        //showKeyValue(new Generic<String>("abc"));
    }
}
