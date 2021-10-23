package Knowledge.k73;

import java.io.File;

/*
时间: 2021-3-27 20:56:12
知识点: File类中常用方法的使用
 */

public class Test {
    public static void main(String[] args) {
        File f = new File("xxx.txt");
        System.out.println("文件的绝对路径:" + f.getAbsolutePath());
        System.out.println("文件的构造路径:" + f.getPath());
        System.out.println("文件的名称:" + f.getName());
        System.out.println("文件的长度:" + f.length()+"个字节");
        System.out.println(f.canRead());
        System.out.println();


        File f2 = new File("d:/lihaolun/a");
        System.out.println("目录的绝对路径:" + f2.getAbsolutePath());
        System.out.println("目录的构造路径:" + f2.getPath());
        System.out.println("目录的名称:" + f2.getName());
        System.out.println("目录的长度:" + f2.length());
        System.out.println(f2.canRead());
        System.out.println(f2.mkdir());
    }
}
