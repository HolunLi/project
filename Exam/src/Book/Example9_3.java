package Book;
/*
2020-12-6 20:27:13
书本P171页，例题:先将"欢迎welcome"写入到文件"hello.txt"中，再从该文件中读取数据
目的:
    熟练掌握文件字节输入流(FileInputStream)和文件字节输出流(FileInputStream)
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example9_3 {
    public static void main(String[] args) {
        File file = new File("D:/Test", "hello.txt");
        byte b[] = "欢迎welcome".getBytes();

        try
        {
            //将"欢迎welcome"写入到文件"hello.txt"中
            FileOutputStream f1 = new FileOutputStream(file, true); //这里创建了一个指向文件hello.txt的文件字节输出流
            f1.write(b);
            f1.close(); //关闭输出流

            //从文件hello.txt中读取数据
            FileInputStream f2 = new FileInputStream(file);
            int n;
            while ((n=f2.read(b,0,2)) != -1) { //用于判断是否已读取到文件的末尾
                String str = new String(b, 0, n);//从字节数组下标为0的位置开始，取n个字节构造字符串对象
                System.out.println(str);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
