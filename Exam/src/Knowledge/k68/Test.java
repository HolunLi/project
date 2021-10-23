package Knowledge.k68;

/*
时间: 2021-3-25 20:40:20
知识点: 使用ObjectOutputStream将对象写入到文本文件,在使用ObjectInputStream读取出来
 */

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String s = "lihaolun";
        //使用序列化流将字符串对象进行序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt",true));
        //使用反序列化流将字节序列重构成对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));

        oos.writeObject(s); //将字符串对象s转化成字节序列后,写入到xxx.txt
        System.out.println((String) ois.readObject()); //读取xxx.txt中的字节序列,重构成对象后返回

        ois.close();
        oos.close();
    }
}

