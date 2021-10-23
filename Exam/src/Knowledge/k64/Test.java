package Knowledge.k64;

/*
时间: 2021-3-21 16:08:17
知识点: 使用字节输出打印流PrintStream复制文本文件
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintStream pw = null;
        try {
            //使用带缓冲区的字符流读取xxx.txt中的数据
            br = new BufferedReader(new FileReader("xxx.txt"));
            //使用字节打印流将读取的数据,输出到abc.txt
            pw = new PrintStream("abc.txt");
            String line;
            while((line = br.readLine()) != null) { //每次从xxx.txt中读取一行数据
                pw.println(line); //将读取的一行数据输出到abc.txt中,并换行
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pw.close();//打印流中的close方法,不会抛出异常
        }
    }
}
