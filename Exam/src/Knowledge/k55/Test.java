package Knowledge.k55;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileOutputStream stream = null;

        try {
            //以追加的方式,将数据写入到文本文件末尾(b.txt)
            stream = new FileOutputStream("Exam/src/Knowledge/k55/b.txt",true);
            String s = "I am student.";
            byte[] b = s.getBytes(); //调用getBytes方法将字符串转换成字节数组
            stream.write(b); //将字节数组b中的所有字节写入到文本文件的末尾
            stream.flush();

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
