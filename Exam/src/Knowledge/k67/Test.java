package Knowledge.k67;

/*
时间: 2021-3-22 20:29:43
知识点: 使用setOut方法,设置System.out输出数据的方向
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream stream = new PrintStream("xxx.txt");
        System.setOut(stream);//设置System.out将数据输出到xxx.txt中
        for (int i = 1; i <= 5; i++) {
            //此时System.out调用println方法不再是将数据输出到控制台,而是将数据输出到xxx.txt中
            System.out.println("我的第" + i +"个对象");
        }
        stream.close();
    }
}
