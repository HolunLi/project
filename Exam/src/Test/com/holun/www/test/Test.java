package Test.com.holun.www.test;
import Test.com.holun.www.computer.*;
import Test.com.holun.www.jiekou.InsertDrawable;
import Test.com.holun.www.mouse.Mouse;

public class Test {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        InsertDrawable[] in = new InsertDrawable[4];

        c1.setIn(in);
        c1.组装();
    }
}
