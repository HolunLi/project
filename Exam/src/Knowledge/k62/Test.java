package Knowledge.k62;

/*
时间: 2021-3-20 21:12:33
知识点: 为了达到读取数据的最高效率，可以再BufferedReader中包装一个
       InputSteamReader,即使用InputSteamReader为参数构造一个BufferedReader。
 */

import java.io.*;

public class Test {
    //该程序为了方便学习,所以把可能发生的异常抛出了,但在实际开发中不能这样做
    public static void main(String[] args) throws IOException {
        //创建一个指向Hello.txt的FileInputStream,Hello.txt采用GBK编码
        FileInputStream stream = new FileInputStream("Hello.txt");
        //这里InputStreamReader是包装流,FileInputStream是节点流,并采用GBK字符集将从Hello.txt中读取的字节解码成字符
        InputStreamReader streamReader = new InputStreamReader(stream, "GBK");
        //BufferedReader是包装流,InputStreamReader在这里作为节点流,由此看出包装流和节点流是相对而言的。
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
