package Knowledge.k53;

/*
时间: 2021-3-12 19:20:46
知识点: available方法的使用
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileInputStream stream = null;

        try {
            stream = new FileInputStream("Exam/src/Knowledge/K53/abc");
            /*输入流对象stream先调用available方法,返回输入流中剩余没读到的字节数量,
            将返回的字节数量就作为byte数组的长度。因为还没开始读取文件中的字节,
            所有此时调用available方法返回的字节数量,实际就是文件abc中包含的所有字节数量。
            因此,这里无需循环,一次便可读取文件中所有的字节。但这种方式不太适合太大文件,因为byte数组不能太大*/
            byte[] bytes = new byte[stream.available()];
            stream.read(bytes);
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
