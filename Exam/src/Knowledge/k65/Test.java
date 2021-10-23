package Knowledge.k65;

/*
时间: 2021-3-22 19:38:15
知识点: 使用System.in读取从键盘输入的数据,再使用System.out将读取的数据打印输出的控制台。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            /*使用System.in按字节读取从键盘输入的数据,再将System.in包装成转换流
            InputStreamReader,再将InputStreamReader包装成BufferedReader,
            表面上看过去,好像就是使用BufferedReader读取从键盘输入的数据,实际上是
            使用底层的System.in来读取从键盘输入的数据。*/
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入一行文字:");
            System.out.println(reader.readLine()); //从键盘输入一行数据后,直接打印输出的控制台
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
