package Knowledge.k60;

/*
时间: 2021-3-17 13:23:38
知识点: 使用InputStreamReader读取数据
 */

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        /*以FileInputStream为参数构造一个InputStreamReader(包装流),并使用默认的字符集(UTF-8)将读取的字节解码成字符
        实际是先使用底层的FileInputStream读取a.txt中的字节(a.txt也是采用UTF-8编码),
        再使用外层的InputStreamReader依照指定字符集,将字节解码成字符.*/
        InputStreamReader streamReader = new InputStreamReader(new FileInputStream("D:/a.txt"));
        char[] chars = new char[5];
        int count;
        while ((count = streamReader.read(chars)) != -1) { //将读取的字节解码成字符后,存储到字符数组chars中
            System.out.print(new String(chars, 0, count));
        }
        streamReader.close();
    }
}
