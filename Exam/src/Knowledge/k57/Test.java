package Knowledge.k57;

/*
时间: 2021-3-14 13:36:58
知识点: 字节缓冲输入流 (BufferedInputStream)
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    //该程序用于学习方便,所以把可能发生的异常抛出,但在实际开发中并不能这样处理
    public static void main(String[] args) throws IOException {
        /*
        这里先了解一个概念: 若构建一个流与需要另一个流作为参数,这种流被称为包装流/处理流。
        这里被作为参数的流称为节点流。节点流位于包装流里面,所以包装流的底层实际还是使用
        节点流来读写数据。
        该程序中的FileInputStream就是一个节点流,BufferedInputStream就是位于外层的包装流
         */

        FileInputStream s = new FileInputStream("abc.txt"); //作为节点流
        //以文件字节输入流作为参数构造一个字节缓冲输入流
        BufferedInputStream stream = new BufferedInputStream(s); //包装流
        /*BufferedInputStream stream = new BufferedInputStream(new FileInputStream("abc.txt")); //也行
        这里的BufferedInputStream(字节缓冲输入流)为底层的FileInputStream(文件字节输入流),提供一个缓冲区数组,
        所以这里的BufferedInputStream实际就是一个带缓冲区的文件字节输入流
        缓冲区数组就好比一个中转站,临时存放要读写的数据。在实际读写数据时,还是使用底层的FileInputStream进行读写。*/

        byte[] bytes = new byte[30];
        int count;
        while ((count = stream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, count));
        }
        stream.close();
    }
}
