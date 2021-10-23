package Knowledge.k81;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 时间： 2021-6-13 15:10:36
 * 知识点: 通过反射获取注解信息
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("Knowledge.k81.User");

        //通过反射获取类上所有的注解
        Annotation[] annotations = c1.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //通过反射获取属性上的所有的注解
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations1 = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations1) {
                System.out.print(annotation + " ");
            }
            System.out.println();
        }

        //通过反射获取类上的指定注解并获取指定注解中的属性值
        tableAnnotation tableAnnotation = (tableAnnotation) c1.getDeclaredAnnotation(Knowledge.k81.tableAnnotation.class);
        System.out.println(tableAnnotation.tableName());

        //通过反射获取属性上的指定注解并获取指定注解中的属性值
        Field[] fields1 = c1.getDeclaredFields();
        for (Field field : fields1) {
            columnAnnotation annotation =  field.getDeclaredAnnotation(columnAnnotation.class);
            System.out.print(annotation.columnName() + " ");
            System.out.print(annotation.type() + " ");
            System.out.println(annotation.length());
        }


    }
}
