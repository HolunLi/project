package jdbc;

import java.sql.*;

/*
时间: 2021-4-11 16:55:36
知识点: 使用PrepareStatement对象调用方法执行sql语句(在实际开发中推荐使用)
 */

public class Demo2 {
    //数据库地址
    public static final String URL = "jdbc:mysql://localhost:3306/mydatabase?useSSL=false&serverTimezone=GMT%2B8";
    //用户名
    public static final String USER = "root";
    //密码
    public static final String PWD = "haolun";

    //增删改查
    public static void update() {
        Connection connection = null;
        PreparedStatement pst = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, USER, PWD);

            //在对sql语句进行预编译前,使用占位符?,代替要插入的数据(这样可以防止sql注入)
            String sql = "insert into student values(?,?,?,?)";
            pst = connection.prepareStatement(sql);
            //预编译后,在调用setXXX方法,在根据占位符?的编号,设置具体要插入的数据
            pst.setString(1, "17176");
            pst.setString(2, "小明");
            pst.setInt(3,34);
            pst.setString(4, "男");
            int rows = pst.executeUpdate();
            if (rows > 0)
                System.out.println("操作成功!!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if ( connection != null && pst != null) {
                try {
                    pst.close();
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
        PreparedStatement pst = null;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, USER, PWD);

            String sql = "select * from student where name like ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, "张%");
            result = pst.executeQuery();

            while (result.next()) {
                String id =  result.getString("id"); //根据字段名获取字段值
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
            if ( connection != null && pst != null && result != null) {
                try {
                    result.close();
                    pst.close();
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
