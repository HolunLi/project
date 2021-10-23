package Knowledge.k12;

/*
时间:2021-1-23 17:08:55
目的: 内部类的初探
*/

public class Test {

    //用static修饰的是静态内部类
    static class InnerClass1 {

    }

    //没用static修饰的是实例内部类
    class InnerClass2 {

    }

    public void doSome() {
        //在方法体中定义的类为局部内部类，该类的作用范围仅限于所处的方法体
        class InnerClass3 {

        }
    }
}
