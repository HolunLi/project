package Knowledge.k25;

/*
时间: 2021-2-2 15:26:05
知识点: 统计执行一个方法所耗费的时间
*/

public class Test {
    public static void main(String[] args) {
        //统计执行sum(),所耗费的时间
        //在调用sum()方法前,记录一个毫秒数
        long begin = System.currentTimeMillis();
        sum();
        //在执行完sum()方法后,记录一个毫秒数
        long end = System.currentTimeMillis();
        System.out.printf("执行sum方法共耗时%d毫秒\n", end-begin);
    }

    public static void sum() {
        long sum = 0;

        for (int i = 1; i <= 10000000; i++) {
            sum = sum + i;
        }
    }
}


