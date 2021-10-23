package Knowledge.k70;

/*
时间: 2021-3-27 15:25:51
知识点: 通过字节输入流读取配置文件中的数据,再加载到属性列表中
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("userinfo.properties");
        //userinfo.properties采用GBK编码,需要使用转换流
        InputStreamReader streamReader = new InputStreamReader(stream, "GBK");
        //创建一个属性列表(Properties对象)
        Properties properties = new Properties();

        //使用转换流InputStreamReader读取配置文件userinfo.properties中的数据,再加载到属性列表中
        properties.load(streamReader);
        //获取属性列表中所有的属性名key组成的Set集合
        Set<String> set = properties.stringPropertyNames();
        //遍历Set集合,获取属性名和属性值
        for (String s : set) {
            System.out.println(s + "=" + properties.getProperty(s));
        }
        streamReader.close(); //关闭包装流,底层的节点流也会随之关闭
    }
}


