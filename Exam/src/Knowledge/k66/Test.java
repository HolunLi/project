package Knowledge.k66;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
时间: 2021-3-22 20:11:14
知识点: 使用setIn方法,设置System.in从哪里读取数据
 */

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream("xxx.txt"));
        System.setIn(stream);//设置System.in从xxx.txt中读取数据
        //此时System.in不再是读取从键盘输入的数据,而是读取xxx.txt中的数据
        Scanner reader = new Scanner(System.in);
        //读取xxx.txt中的第一行数据,并打印输出到控制台
        System.out.println(reader.nextLine());
        stream.close();
    }
}
