package Knowledge.k6;
/*
2020-12-6 16:34:14
运行计算机上的可执行性文件
书本P170,例题:Runtime对象打开Windows平台上的记事本程序
知识点:
      通过runtime类的对象，可以运行计算机上的.exe文件
*/



import java.io.File;

public class K6 {
    public static void main(String[] args) {
        try {
            Runtime ec = Runtime.getRuntime();
            //对象变量file指向该目录下的KuGou.exe可执行性文件
            File file = new File("D:\\软件\\酷狗音乐\\KGMusic", "KuGou.exe");
            ec.exec(file.getAbsolutePath()); //调用方法exec，运行/执行KuGou.exe，注意调用该方法需要进行异常处理
        }
        catch (Exception e){}
    }
}
