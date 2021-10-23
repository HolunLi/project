package Book;

/*
* 2020-12-5 22:58:02
* 书本P169的例题,列出某个目录下的所有Java源文件的名字及其大小
* 知识点：
*       通过 FILE 创建的对象指向一个文件或者目录，可以对其操作
* */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

class FileAccpt implements FilenameFilter {
    String str;

    FileAccpt(String s) {
        str = "." + s;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(str);
    }
}

public class Example9_1 {
    public static void main(String[] args) {
        File dir = new File("D:/Test");  //这里的对象变量dir指向一个目录
        FileAccpt accptCondition = new FileAccpt("java");
        /*filename是一个文件类型的对象数组，数组中的每个元素都是一个FILE类型的对象变量
        每个对象变量又分别指向目录 D:/Test 中的一个文件*/
        //File filename[] = dir.listFiles(accptCondition);  //返回目录 D:/Test下 指定类型的文件
        File filename[] = dir.listFiles(); //返回目录 D:/Test下 的全部问价
        for (int i=0; i<filename.length; i++) {
            System.out.printf("文件名称:%s, 大小:%d个字节。\n",
                               filename[i].getName(), filename[i].length());
        }

       //删除 目录D:/Test下指定的一个文件
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入要删除的文件:");
        String name = reader.nextLine();
        for (int i=0; i<filename.length; i++)
            if (filename[i].getName().equals(name)) {
                filename[i].delete();
                System.out.printf("被删除的文件是:%s\n", filename[i].getName());
                filename[i] = null;
                break;
            }
        for (int i=0; i<filename.length; i++) {
            if (filename[i] != null) {
                System.out.printf("文件名称:%s, 大小:%d个字节。\n",
                        filename[i].getName(), filename[i].length());
            }
        }

        /*通过FILE对象调用mkdir方法创建一个目录
        File dir1 = new File("D:/Exam"); //如果没有 D:/Exam 这个目录，可以用方法mkdir创建
        dir1.mkdir();*/

        /*
        try {
            File f1 = new File("D:/Test", "y.java"); //这里的对象变量f1指向目录 D:/Test中名为 y.java的这个文件
            f1.createNewFile(); //如果目录 D:/Test中没有 y.java的这个文件，可以调用该方法创建该文件，注意调用该方法需要执行异常处理
            System.out.println(f1.getName() + "," + f1.length());
        }
        catch (Exception e) {}
        */
    }
}
