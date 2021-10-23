package Test;



/*
从键盘输入字符串，要求将读取到的整行字符串转成大写输出，然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序
方法一：使用Scanner实现，调用next()返回一个字符串
方法二：使用System.in实现，System.in --->转换流--->BufferedReader的readLine()
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) {
        BufferedReader br = null;
        InputStreamReader isr = null;
        try {
            //造流（转换流、标准输入流和缓冲流）
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            //从键盘输入字符串
            while (true){
                System.out.println("请输入字符串：");
                String s = br.readLine();
                if ("e".equalsIgnoreCase(s)||"exit".equalsIgnoreCase(s)){
                    System.out.println("程序结束");
                    break;
                }
                //将读取到的整行字符串转成大写输出
                String s1 = s.toUpperCase();
                System.out.println(s1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流资源
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
