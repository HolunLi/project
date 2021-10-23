package Knowledge.k22;

/*
时间: 2021-2-1 15:00:49
知识点:包装类之装箱和拆箱
*/

public class Test {
    public static void main(String[] args) {

        //将基本数据类型转换成包装类型,这个过程被称为装箱
        Integer i = new Integer(1000);  //该构造方法从JDK9开始就已过时
        System.out.println(i); //输出:1000
        /*
        解析:理论上int类型的常量1000是不能直接赋予引用型变量i
        但这里实际是先将int类型的常量1000包装成Integer类的对象(Integer类创建的对象),1000作为该对象中成员变量的值
        再将该对象的地址赋予前面的引用型变量i
        */

        //将包装类型转换成基本数据类型,这个过程被称为拆箱
        //包装类的对象调用方法xxxValue()进行拆箱,xxx表示某种数据类型
        //integer对象调用该方法可以返回指定类型的数据
        //这里以intValue()和floatValue()方法为例.
        //实际还有byteValue,shortValue,doubleValue,longValue等方法
        int a1 = i.intValue();
        System.out.println(a1); //输出:1000
        float a2 = i.floatValue();
        System.out.println(a2); //输出:1000.0

        //从JDK1.5开始，支持自动装箱和拆箱
        Integer i2 = 1999;  //自动装箱
        System.out.println(i2);  //输出:1999
        int b1 = i2;  //自动拆箱
        System.out.println(b1);  //输出:1999
        double b2 = i2;  //自动拆箱
        System.out.println(b2);  //输出:1999.0
    }
}

