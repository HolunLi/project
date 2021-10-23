package Knowledge.k33;

/*
时间: 2021-2-4 14:41:55
知识点: 使用try...catch语句处理异常
*/

public class Test {
    public static void main(String[] args) {
        divide(10, 0);
    }

     //不对外抛出异常,在divide方法使用try-catch语句处理异常
     public static void divide(int x, int y) {
       int z = 0;
       try {
           //将可能发生异常的语句,放在try语句中
           z = x / y; //除数y为0,在运行阶段该语句会发生异常
       }
       catch (ArithmeticException e) { //catch语句用来捕捉异常并进行处理
           System.out.println("除数不能为0");
           System.exit(0);
       }
       System.out.println(z);
    }
}






