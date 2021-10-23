package Knowledge.k32;

/*
时间: 2021-2-3 16:34:35
知识点: 异常类
        */

public class Test {
    public static void main(String[] args) {
        int x = 10, y = 0, z;

        z = x / y;
        /*
         因为除数y为0,当程序执行到该语句时会发生异常
         发生异常即在底层创建了一个异常对象(new ArithmeticException("/ by zero");)
         因为在main方法中没有编写处理该异常的语句,会自动将该异常抛给JVM
         JVM打印输出异常信息到控制台,并终止当前程序的运行。
         此时就能在控制台看见如下所示的异常信息:
         --------------------------------------------------------------------
         Exception in thread "main" java.lang.ArithmeticException: / by zero
	     at Knowledge.k32.Test.main(Test.java:12)
	     --------------------------------------------------------------------
        */
        System.out.println(z); //前面的语句出现异常,该语句不会被执行
    }
}


