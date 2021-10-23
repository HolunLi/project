package Knowledge.k34;

/*
时间: 2021-2-6 15:42:23
知识点: 自定义异常类
*/

//MyException类为自定义异常类,因为直接继承Exception类,所以属于编译时异常
class MyException extends Exception {
    //提供一个无参数的构造方法
    public MyException() {
    }

    //提供一个带有String类型参数的构造方法
    public MyException(String message) {
        super(message);
    }
}

public class Test {
    public static void main(String[] args) {
        MyException e = new MyException("发生自定义异常!!!");
        e.printStackTrace();
    }
}












