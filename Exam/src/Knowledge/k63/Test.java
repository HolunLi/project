package Knowledge.k63;

/*
时间: 2021-3-20 22:26:25
知识点: 从采用GBK编码的文本文件中读取数据,再将数据写入到采用UTF-8编码的文本文件中
 */

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //Hello.txt采用GBK编码
        FileInputStream stream1 = new FileInputStream("Hello.txt");
        //使用转换流InputStreamReader读取Hello.txt中的数据
        InputStreamReader isr = new InputStreamReader(stream1,"GBK");
        //xxx.txt采用UTF-8编码
        FileOutputStream stream2 = new FileOutputStream("xxx.txt",true);
        //使用转换流OutputStreamWriter将从Hello.txt中读取的数据写入到xxx.txt
        OutputStreamWriter osw = new OutputStreamWriter(stream2,"UTF-8");

        char[] chars = new char[20];
        int count;
        while ((count = isr.read(chars)) != -1) {
            //一次从Hello.txt中读取了几个字符,就写入几个字符到xxx.txt中
            osw.write(chars,0, count);
        }
        /*OutputStreamWriter也必须在调用flush方法或close方法后，
        才会真正将数据写入到目的地。*/
        osw.close();
        isr.close();
    }
}
