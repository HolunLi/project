package Knowledge.k7;
/*
时间:2020-12-14 13:48:27
书本P173页的例题,先用字符输出流向一个已经存在的文件末尾加若干个字符，再用字符输入流读取文件中的内容
*/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class K7 {
    public static void main(String[] args) {
        File file = new File("D:/Test","xx.txt");
        char c[] = "欢迎".toCharArray(); //String类中的方法toCharArray()，可以将字符串对象转化成一个字符数组

        try {
            FileWriter out = new FileWriter(file,true);
            out.write(c);
            out.write("来到北京!");
            out.close();

            FileReader in = new FileReader(file);
            /*
            int n;
            while ((n=in.read(c,0,2)) != -1) {
                String str = new String(c,0,2); //从字符数组c下标为0的位置开始，取2个字符创建字符串
                System.out.println(str);
            }*/
            int m;
            char[] c1 = new char[100];
            m = in.read(c1); //从文件读取c1.length个字符到字符数组从c1,如果到达文件末尾返回-1
            String str = new String(c1); //通过一个字符数组创建字符串对象
            System.out.printf("%s\n从文件%s中,读取了%d个字符。\n", str, file.getName(),m);

            in.close(); //只要不关闭输入流，每次调用方法read()，都继续顺序读取文件中的其余内容，直到读取到文件末尾，返回-1结束
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
