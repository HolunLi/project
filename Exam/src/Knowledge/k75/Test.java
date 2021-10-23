package Knowledge.k75;

import java.io.File;

/*
时间: 2021-3-28 11:28:47
知识点: 递归遍历文件夹下的所有文件
 */

public class Test {
    public static void main(String[] args) {
        File file=new File("D:/Project");
        Recursion(file);
    }

    public static void Recursion(File file){
        //判断传入的是否是目录
        if(!file.isDirectory()){
            //不是目录直接退出
            return;
        }

        //已经确保了传入的file是目录
        File[] files = file.listFiles();
        //遍历files
        for (File f: files) {
            //如果该目录下文件还是个文件夹就再进行递归遍历其子目录
            if(f.isDirectory()){
                //递归
                Recursion(f);
            }else {
                //如果该目录下文件是个文件，则打印对应的名字
                System.out.println(f.getName());
            }
        }
    }
}


