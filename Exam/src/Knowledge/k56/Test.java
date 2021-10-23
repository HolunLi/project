package Knowledge.k56;

/*
时间: 2021-3-13 17:39:06
知识点: 使用文件字符输入流读取文本文件中的数据
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("Exam/src/Test/a.txt");
            char[] c = new char[8];
            int count;
            while ((count = fileReader.read(c)) != -1) {
                //将字符数组转换成字符串,并打印输出
                System.out.print(new String(c, 0, count));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
