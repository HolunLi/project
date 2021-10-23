package Knowledge.k31;

/*
时间: 2021-2-3 12:19:34
知识点: 枚举类用法二:在switch中使用枚举类型
*/

//Color是一个枚举类型
enum Color {
    RED, GREEN, BLANK, YELLOW; //这里定义了4个枚举值,都为常量
}

public class Test {
    public static void main(String[] args) {
        Color c = Color.RED;
        System.out.println(c); //输出:RED

        switch (c) {   //括号()中的是枚举值
            case RED:  //跟在case标号后的也是枚举值
                c = Color.GREEN;
                break;
            case YELLOW:
                c = Color.RED;
                break;
            case GREEN:
                c = Color.YELLOW;
                break;
        }

        System.out.println(c); //输出:GREEN
    }
}

