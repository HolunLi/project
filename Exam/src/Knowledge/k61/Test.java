package Knowledge.k61;

/*
时间: 2021-3-17 20:36:00
知识点: 使用OutputStreamWriter写入数据
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {
    public static void main(String[] args) throws IOException {
        /*以FileOutputStream为参数构造一个OutputStreamWriter(包装流),并使用默认的字符集(UTF-8)将待写出的字符编码成字节
        实际是先使用OutputStreamWriter将待写出的字符编码成字节,再使用底层FileOutputStream将字节写入到xxx.txt */
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("xxx.txt",true));
        String s = "伦哥真帅！！！"; //也可将字符数组中字符写入到xxx.txt
        osw.write(s); //将字符串"伦哥真帅！！！"中的一个个字符编码成字节后,再写入到xxx.txt
        osw.close();
    }
}
