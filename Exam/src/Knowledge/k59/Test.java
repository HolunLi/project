package Knowledge.k59;

/*
时间: 2021-3-14 20:00:16
知识点: BufferedWriter对象调用newLine方法，换一行再写出数据
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
   /* //该程序用于学习方便,所以把可能发生的异常抛出,但在实际开发中并不能这样处理
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("xxx.txt"));
        String str = "伦哥你真";
        writer.write(str);
        //写入字符串"伦哥你真"到文本文件(xxx.txt)中后,在该文本文件中换一行继续写入字符串"帅!!!"
        writer.newLine();
        writer.write("帅!!!");
        *//*带缓冲区的输出流,不管是字节输出流还是字符输出流,
        必须调用flush方法或close方法后,才会真正将数据写入到目的地。
        在没调用这两个方法之前,待写出的数据被临时存放缓冲区中*//*
        writer.close(); //具体调用close方法还是flush方法,以情况而定
    }*/

    //实际开发中，应该对可能发生的异常进行try-catch
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("xxx.txt", true));
            String str = "伦哥你真";
            writer.write(str);
            writer.newLine();
            writer.write("帅!!!");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
