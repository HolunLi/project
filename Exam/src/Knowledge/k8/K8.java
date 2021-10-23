package Knowledge.k8;

/*
时间:2020-12-16 14:54:03
目的:测试继承(1)
*/

class A {
    int x, y;
    public void f() {
        this.x = 1;    //x = 1; 也行
        this.y = 2;   //y = 2; 也行
    }
    public void input() {
        System.out.println(x + "," + y);
    }
}

/*
B继承A的成员变量x,y 和 方法f(),input();
通过继承后，B类中也有了成员变量x,y 和 方法f(),input()
但需要注意的是，B类中的x,y 和 A类中的x,y 是不同的变量，占不同的存储空间
 */
class B extends A {
    /*在子类B中通过重写继承而来的方法f(),将继承而来的方法f()隐藏(隐藏不代表删除)
      所以这里的方法f()已经是一个新的方法*/
    public void f() {
        x = 3;
        y = 4;
    }

    public void change() {
        super.f(); //通过super关键字可以调用被子类B隐藏的方法f()
    }
}

public class K8 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.f();
        b1.input();   //输出 3,4;
        /*
        b1.change();
        b1.input();   //输出 1,2;
        */

        A a1 = new A();
        a1.f();
        a1.input();  //输出 1,2;
        b1.input();  //输出 3,4
    }
}
