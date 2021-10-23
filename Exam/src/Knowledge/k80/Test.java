package Knowledge.k80;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 时间 : 2021-6-13 13:11:26
 * 知识点: 通过反射创建对象，通过反射创建对象;
 */


public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * 通过反射创建对象的两种方法
         */
        //先获取User类的Class对象。Class对象对应的就是User类编译后得到的.class文件
        Class c1 = Class.forName("Knowledge.k80.User");

        //直接使用Class类的newInstance方法创建对象(newInstance方法默认使用无参数的构造方法来创建对象，
        // 所以在User类中必须包含一个无参数的构造方法。并且newInstance方法从JDK11开始已过时,不推荐使用)
        User user_1 = (User) c1.newInstance();
        System.out.println(user_1.getUsername());  //输出: null

        //通过构造器创建对象(推荐使用)
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class);
        User user_2 = (User) constructor.newInstance("李豪伦", 22);
        System.out.println(user_2); //输出: 李豪伦,22

        /**
         * 通过反射操作方法
         */
        //先获取User类中的setAge()方法。
        Method method = c1.getDeclaredMethod("setAge", int.class);
        //invoke是激活的意思
        method.invoke(user_2,100);
        System.out.println(user_2); //输出: 李豪伦,100

        /**
         * 通过反射操作私有属性
         */
        //先获取User类中的私有属性username
        Field username = c1.getDeclaredField("username");
        //要操作私有属性必须设置可访问权限。public属性不需要设置
        username.setAccessible(true);
        //将user_2的username属性重新赋值为"伦哥"
        username.set(user_2, "伦哥");
        System.out.println(user_2);  //输出: 伦哥,100
    }
}
