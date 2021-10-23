package Knowledge.k79;

/*
时间: 2021-6-6 11:50:55
知识点: 获取类路径下(src目录下)的文件的绝对路径
 */

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) throws IOException {
        //获取类路径下dbcpconfig.properties属性文件的绝对路径（可跨操作系统使用）,其它类型的文件也可通过此方式获取
        String path = Thread.currentThread().getContextClassLoader().getResource("dbcpconfig.properties").getPath();
        System.out.println(path.replace("/dbcpconfig.properties", ""));

        //获取类路径下dbcpconfig.properties属性文件的绝对路径,并以流的形式返回（可跨操作系统使用）,其它类型的文件也可通过此方式获取
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("dbcpconfig.properties");
        Properties properties = new Properties();
        //将dacpconfig.properties属性文件中的数据(key-value对)加载的properties集合中
        properties.load(input);
        //通过key获取value
        String value = properties.getProperty("password");
        System.out.println(value);
        //遍历properties集合
        properties.forEach((k, v)-> {  //使用lambda表达式遍历map
                System.out.println(k + "=" + v);
            }
        );

        //java.util提供了一个资源绑定器类(ResourceBundle),该类只能用于获取属性文件(.properties文件)中的数据,并且要求属性文件必须放在类路径下
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Knowledge/k79/test");//注意:test.properties属性文件
                                                                                       //的扩展名必须省略,否则运行将会出现异常
        //通过key获取value
        String v = resourceBundle.getString("user");
        System.out.println(v);

        String p = "D:\\Project\\Exam\\src\\Knowledge\\k77";
        File file = new File(p, "Test.java");
        System.out.println(file.getPath());
    }
}
