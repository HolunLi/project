package Knowledge.k24;

/*
时间: 2021-2-2 09:08:42
知识点: int,String,Integer之间的相互转换
*/

public class Test {
    public static void main(String[] args) {
        //int -> String
        int i1 = 10, i2;
        String s1 = i1 + "";  // or String s1 = String.valueOf(i);
        System.out.println(s1);
        //String -> int
        //使用parseInt方法将整数格式的字符串转换成int类型的数据
        i2 = Integer.parseInt(s1);
        //or i2 = Integer.valueOf(s1); 先将整数格式的字符串s1转换成Integer对象,在自动拆箱
        System.out.println(i2);

        //int -> Integer
        int i3 = 100, i4;
        Integer t1 = i3;  //自动装箱
        System.out.println(t1);
        //Integer -> int
        i4 = t1;  //自动拆箱
        System.out.println(i4);

        //String -> Integer
        String s2 = "9527", s3;
        Integer t2 = Integer.valueOf(s2); //使用Integer类中的valueOf类方法可以将整数格式的字符串转换成Integer类的对象
        System.out.println(t2); //输出:整数9527
        //Integer -> String
        s3 = String.valueOf(t2);
        System.out.println(s3); //输出字符串9527

        //拓展: 将int[] 转换成 Integer
        int[] array = {1,2,3,4};
        Integer[] in = new Integer[array.length];
        for (int i = 0; i < array.length; i++)
            in[i] = array[i];

        for (int i = 0; i < in.length; i++)
            System.out.print(in[i] + " ");

    }
}
