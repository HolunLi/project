package Knowledge.k54;

/*
时间: 2021-3-12 21:30:46
知识点: 使用FileInputStream+FileOutputStream，实现文件复制。
比如: 将D盘根目录下的图片(链表数组图解.png),复制到D:\Project\Exam\src\Knowledge\k54下
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileInputStream stream1 = null;
        FileOutputStream stream2 = null;

        try {
            //指向要复制的图片
            stream1 = new FileInputStream("D:/链表数组图解.png");
            //指向图片最终被复制到的目的地
            stream2 = new FileOutputStream("Exam/src/Knowledge/k54/链表数组图解.png");

            byte[] bytes = new byte[1024*1024]; //byte数组长度就是一次读取的字节个数
            int count;
            //边读取,边写入
            while ((count = stream1.read(bytes)) != -1) { //一次读取1M，即1024*1024个字节到byte数组中
                stream2.write(bytes, 0, count); //一次读取多少字节,就写入多少字节
            }
            stream2.flush(); //最后记得要刷新输出流通道

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            /*关闭这两个流时,都会抛出一个异常,并且抛出的这两个异常的类型都是相同的。
            所以这里要分开捕获这个两个异常,不要一起捕获。
            因为如果放一起捕获,一旦其中一个流指向为空,即发生异常,另一个流就无法关闭*/
            if (stream1 != null) {
                try {
                    stream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (stream2 != null) {
                try {
                    stream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


