package Knowledge.k71;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

/*
时间: 2021-3-27 16:14:42
知识点: properties类中常用方法的使用
 */

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建属性列表(是一个对象)
        Properties properties = new Properties();

        /*添加3个属性到属性列表中
        注意:添加的一个属性由属性名和属性值组成,是一个键值对*/
        properties.setProperty("filename", "a.txt");
        properties.setProperty("length", "209385038");
        properties.setProperty("location", "D:\\a.txt");
        //打印属性列表对象
        System.out.println(properties);

        // 通过属性名key,获取属性值value
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));

        //获取属性列表中所有的属性名key组成的Set集合
        Set<String> strings = properties.stringPropertyNames();
        //遍历Set集合,获取属性名和属性值
        for (String key : strings ) {
            System.out.println(key + "=" + properties.getProperty(key));
        }
    }
}
