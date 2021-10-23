package Knowledge.k13;

/*
时间: 2021-1-23 20:59:28
目的: 使用 new 接口名() {} 声明匿名类，并用其创建对象。
*/

interface In {
    int sum(int x, int y);
}

class Student {
    public int sum(In i, int x, int y) {  //这里的形参i，是用来接收匿名对象的地址
       return i.sum(x, y);
    }
}

public class Test {
    public static void main(String[] args) {
        Student stu_1 = new Student();

                  //这里声明了一个匿名类并用其创建对象，该匿名类被认为是实现In接口的类。
        int sum =  stu_1.sum(new In() {
                    //所以在该匿名类的类体必须重写接口In中的sum方法
                    public int sum(int x, int y) {
                        return x + y;
                    }
                  }, 10, 20);

        System.out.println("x + y = " + sum); //输出: x + y = 30

    }
}

