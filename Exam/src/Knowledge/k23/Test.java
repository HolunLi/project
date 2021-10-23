package Knowledge.k23;

/*
时间: 2021-2-1 15:00:49
知识点:
     每个包装类都有MAX_VALUE和MIN_VALUE这两个类常量，这两个类常
     量用来记录包装类对应的基本数据类型的取值范围，MAX_VALUE记录最大值，
     MIN_VALUE记录最小值。
*/


public class Test {
    public static void main(String[] args) {
        System.out.printf("int类型的取值范围为:%d - %d\n",
                          Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("short类型的取值范围为:%d - %d\n",
                Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("char类型的取值范围为:%d - %d\n",
                (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);
    }
}

