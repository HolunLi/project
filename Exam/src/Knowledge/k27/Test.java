package Knowledge.k27;

import java.text.DecimalFormat;

/*
时间: 2021-2-2 19:28:28
知识点: DecimalFormat类用于数字格式化
*/

public class Test {
    public static void main(String[] args) {

        /*在创建DecimalFormat类的对象时，需要指定数字的格式
         常用的数字格式有: ‘#’代表任意数字, ‘,’代表千分位 , '.'代表小数点, '0'代表小数位数不够时补0
         ###,###.0000 表示在原数字的基础上加入千分位,并保留4位小数,位数不够补0*/
        DecimalFormat df = new DecimalFormat("###,###.0000");
        int i1 = 19876;
        double d1 = 9527.233, d2 = 43992.12347;

        //调用DecimalFormat类中的format方法将原数字的格式转换成指定的数字格式
        String s1 = df.format(i1);
        System.out.println(s1); //输出:19,876.0000

        String s2 = df.format(d1);
        System.out.println(s2); //输出:9,527.2330

        String s3 = df.format(d2);
        System.out.println(s3); //输出:43,992.1235
        //43992.12347 的小数位数超出指定的格式,要逢6进1
    }
}

