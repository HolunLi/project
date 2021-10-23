package Knowledge.k72;

import java.io.File;

/*
时间: 2021-3-27 20:04:50
知识点: 使用构造方法创建File对象
 */

public class Test {
    public static void main(String[] args) {

        /*//通过父路径和子路径字符串
        String parent = "D:/Project";
        String child = "Hello.txt";
        File file2 = new File(parent, child); //相当于 D:/Project/Hello.txt*/

        //通过父级File对象和子路径字符串
        File parentDir = new File("D:/Project");
        String child = "Hello.txt";
        File file3 = new File(parentDir, child); //相当于 D:/Project/Hello.txt*/

    }
}
