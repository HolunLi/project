package Knowledge.k4;

/*
时间:2020-11-30 19:53:38
final修饰符
final 修饰符修饰的实例变量称为常量，其值不可以更改
      定义时必须赋初值(初始化)，不能采用系统默认的值
      一般和 public static 联合使用 ，常量的值不可更改，所以不怕谁更改
*/

class 常量 {
    public static final int x = 3;  //定义时必须赋初值
}

public class K4 {
    public static void main(String[] args) {
        常量 c = new 常量();
        System.out.println(常量.x); //c.x也行
    }
}
