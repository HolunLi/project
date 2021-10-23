package Knowledge.k53;

/*
时间: 2021-3-12 18:19:19
知识点: 调用read(byte[] b);方法,读取文件中的字节
该方法从文件中读取b.length个字节存储到byte数组b中，并返回读取的字节个数,如果读取到文件末尾，返回-1。
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileInputStream stream = null;
        try {
            //创建一个指向文件abc的输入流
            stream = new FileInputStream("Exam/src/Knowledge/K53/abc");

            byte[] bytes = new byte[20];
            int count; //记录读取的字节数量
            while ((count = stream.read(bytes)) != -1) {
                //从字节数组bytes中,下标为0的位置开始,取count个字节为参数,创建一个String对象
                System.out.print(new String(bytes, 0, count));
            }

        /*使用构造方法"FileInputStream(String name)"创建文件字符输入流对象,
        和调用read方法读取字节,都会抛出一个异常,最好分别进行catch*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                /*读取完毕一定要关闭输入流。关闭流的语句,最好放在finally中,
                因为不管是否发生异常,finally中的语句都会执行*/
                if (stream != null) {
                    stream.close(); //调用close方法关闭流,也会抛出一个异常,需要进行try-catch
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
