package Knowledge.k58;

/*
时间: 2021-3-14 19:41:48
知识点: BufferedReader对象调用readLine方法读取文本文件中的一行数据
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    //该程序用于学习方便,所以把可能发生的异常抛出,但在实际开发中并不能这样处理
    public static void main(String[] args) throws IOException {
        //将一个文件字符输出流包装成字符缓冲输出流,可以更高效的读取文本文件中的数据
        BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
        String str = null;
        while ((str = reader.readLine()) != null) { //一次读取文本文件(abc.txt)中的一行数据
            System.out.println(str); //每读取了一行数据,便将该行数据打印输出到控制台
        }
        reader.close();
    }
}


