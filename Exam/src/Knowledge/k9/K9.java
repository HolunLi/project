package Knowledge.k9;

/*
时间:2020-12-16 15:01:24
目的:测试继承(2)
*/

class C {
    int x = 1, y = 2;

    C() {}

    C(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void f() {
        System.out.printf("%d,%d\n", x, y);
    }
}

class D extends C {
    int z;

    D() {
        z = 300;
    }

    D(int x, int y) {
        /*注意这里调用父类的构造方法，初始化的并不是父类C中的成员变量x,y，而是子类D中继承的成员变量x,y。
          简单的理解就是在子类中调用父类的构造方法，用来初始化子类的成员变量(继承而来)
          父类C中的成员变量x,y 与 子类D中继承的成员变量x,y，不是相同的变量，占不同的内存单元*/
        super(x, y);
        z = 300;
    }
    public void f() {
        System.out.printf("%d,%d,%d\n", x, y, z);
    }
}

public class K9 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.f(); //输出 1,2

        D d1 = new D(10, 20);
        d1.f(); //输出 10,20,300
        c1.f(); //输出 1,2
        C c2 = new C();
        c2.f(); //输出 1,2

        D d2 = new D();
        d2.f();  //1,2,300
    }
}
