package Knowledge.k26;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
时间: 2021-2-2 13:36:25
知识点: SimpleDateFormat类用于日期格式化
*/

public class Test {
    public static void main(String[] args) {
        Date date = new Date(); //date是一个日期对象(Date类创建的对象)
        System.out.println(date); //输出:Tue Feb 02 13:36:00 GMT+08:00 202

        /*在创建SimpleDateFormat类的对象时,需要指定日期的格式
        常用的日期格式有: y 代表年, M代表月, d代表日, h代表时, m代表分, s代表秒, S代表微秒*/
        SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        //调用SimpleDateFormat类中的format方法,将日期对象格式化成指定的日期格式
        //即将日期(对象)转换成字符串(对象)
        String datetime = dd.format(date);
        System.out.println(datetime); //输出:2021-02-02 01:55:04


        String s = "2021/02/03 10:34:12"; //这是一个日期格式的字符串
        //这里指定的日期格式要与"日期字符串"的格式相同,否则运行时会报错
        SimpleDateFormat ss = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        try {
            //调用parse方法将日期格式的字符串转换成日期对象并返回
            Date date2 = ss.parse(s); //调用该方法需要抛出ParseException异常
            System.out.println(date2); //输出:Wed Feb 03 10:34:12 GMT+08:00 2021
        }catch (ParseException e) {
            System.out.println("转换失败!");
        }
    }
}
