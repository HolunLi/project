package Knowledge.k39;

/*
时间: 2021-2-14 17:30:56
知识点: 静态内部类和实例内部类的差异
 */

public class Test {

    //InnerClass1是一个静态的内部类
    static class InnerClass1 {
        int i1 = 10; //i1是一个实例变量(非静态的成员变量被称为实例变量)
        static int i2 = 10; //i2是一个静态变量(静态的成员变量被称为静态变量或类变量)
        public final int i3 = 10; //i3是一个常量
        public static final int i4 = 10; //i4是一个静态常量

        static void f() {} //这是一个静态方法(类方法)
        void g() {} //这是一个实例方法(非静态的方法被称为实例方法)
    }

    //InnerClass2是实例内部类(非静态内部类)
    class InnerClass2 {
        int i1 = 10; //i1是一个实例变量(非静态的成员变量被称为实例变量)
        //static int i2 = 10; //i2是一个静态变量,实例内部类中不能声明静态变量,报错
        public final int i3 = 10; //i3是一个常量
        //变量i4虽然也是静态的(被static修饰),但i4同时也被final修饰,被当作常量来处理
        public static final int i4 = 10;

        //static void f() {} //实例内部类中不能声明静态方法,报错
        void g() {} //这是一个实例方法(非静态的方法被称为实例方法)
    }

    public static void main(String[] args) {

    }
}
