package jdbc;

import java.sql.*;

/*
时间: 2021-4-10 19:27:15
知识点: JDBC连接mysql数据库的步骤
 */

public class Demo {
    //数据库地址
    public static final String URL = "jdbc:mysql://localhost:3306/mydatabase?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8";
    //用户名
    public static final String USER = "root";
    //密码
    public static final String PWD = "haolun";

    //增删改查
    public static void update() {
        Connection connection = null;
        Statement statement = null;

        try {
            //加载驱动类(在加载驱动类之前,必须先导入驱动包(驱动mysql数据库的jar包))
            Class.forName("com.mysql.cj.jdbc.Driver");

            //通过DriverManager与数据库进行连接(连接某个数据库需要3个参数:数据库地址,用户名,密码)
            connection = DriverManager.getConnection(URL, USER, PWD);

            //发送sql,执行sql语句
            statement = connection.createStatement();
            String sql1 = "insert into student values('17173','张欣',22,'男')";
            int rows = statement.executeUpdate(sql1); //executeUpdate方法用于和增删改有关的sql语句,该方法返回值是个int类型数据
            //执行增删改sql语句时,如果执行成功,DDMS中会显示几行受影响，该方法返回的int类型数据就是用于记录几行受了影响

            //处理结果集
            if (rows > 0)
                System.out.println("操作成功!!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if ( connection != null && statement != null) {
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    //查询
    public static void query() {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        try {
            //加载驱动类(在加载驱动类之前,必须先导入驱动包(驱动mysql数据库的jar包))
            Class.forName("com.mysql.cj.jdbc.Driver");

            //通过DriverManager与数据库进行连接(连接某个数据库需要3个参数:数据库地址,用户名,密码)
            connection = DriverManager.getConnection(URL, USER, PWD);

            //发送sql,执行sql语句
            statement = connection.createStatement();
            //String sql1 = "select * from student where name like '张%'";
            String sql2 = "select * from student";
            result = statement.executeQuery(sql2); //executeQuery方法用于和查询有关的sql语句,该方法返回值是个ResuleSet(一个Set集合)
            //执行查询sql语句时,如果执行成功,DDMS中会显示一行行的查询结果，每一行的查询结果都作为一个对象,添加到ResuleSet中

            //处理结果集
            while (result.next()) { //优点类似于集合的遍历
               String id =  result.getString("id");
               String name =  result.getString("name");
               int age =  result.getInt("age");
               String sex =  result.getString("sex");

               System.out.println(id + "," + name + "," + age + "," + sex);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if ( connection != null && statement != null && result != null) {
                try {
                    result.close();
                    statement.close();
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        //update();
        query();
    }
}
