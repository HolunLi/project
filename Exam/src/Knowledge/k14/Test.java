package Knowledge.k14;

/*
时间: 2021-1-23 21:10:08
目的: 使用 new 类名() {} 声明匿名类，并用其创建对象。
*/

class In {
    public int sum(int x, int y) {
        return x + y;
    }
}

class Student {
    //该方法中的形参i,是用来接收匿名对象的地址,成为它的上转型对象
    public int sum(In i, int x, int y) {
        return i.sum(x, y);
    }
}

public class Test {
    public static void main(String[] args) {    
        Student stu_1 = new Student();

        //这里声明了一个匿名类并用其创建对象，该匿名类被认为是类In的子类
        int sum =  stu_1.sum(new In() { }, 10, 20);

        System.out.println("x + y = " + sum); //输出: x + y = 30
    }
}