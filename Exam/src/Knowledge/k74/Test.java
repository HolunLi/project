package Knowledge.k74;

import java.io.File;

/*
时间: 2021-3-27 22:40:51
知识点: 使用list或listFiles对目录进行遍历
 */

public class Test {
    public static void main(String[] args) {
        //指向目录
        File dir = new File("G:\\数据结构资料");

        //获取目录"G:\\数据结构资料" 下的所有文件以及文件夹的名称。
        String[] names = dir.list();
        for(String name : names){
            System.out.println(name);
        }
        System.out.println();

        //获取目录"G:\\数据结构资料" 下的所有文件以及文件夹对象,只要拿到了文件/文件夹对象,那么就可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            //直接输出File对象,会默认调用该对象的getPath()方法,获取指向的文件/目录的构造路径
            System.out.println(); //等价于 System.out.println(file.getPath());
        }
    }
}

