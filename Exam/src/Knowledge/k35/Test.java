package Knowledge.k35;

/*
时间: 2021-2-6 21:11:05
知识点: 若父类中有一个方法抛出了异常，其子类重写该方法时，有3种选择:
       - 子类重写该方法时，不抛出任何异常。
       - 子类重写该方法时，抛出的异常和重写前抛出的异常相同。
       - 子类重写该方法时，抛出的异常是重写前抛出的异常的子类。
*/

import java.rmi.AlreadyBoundException;

class Test1 {
    public void fun() throws Exception {

    }
}

public class Test extends Test1 {
    //子类重写fun方法时，不抛出任何异常。
    //public void fun() { }

    //子类重fun()方法时，抛出的异常和重写前抛出的异常相同
    //public void fun() throws Exception { }

    //子类重写fun方法时，抛出的异常是重写前抛出的异常的子类
    public void fun() throws NullPointerException { }
}
