package Knowledge.k28;

import java.math.BigDecimal;

/*
时间: 2021-2-2 20:56:16
知识点: 使用BigDecimal类求大阶乘
*/

public class Test {
    public static void main(String[] args) {
        //求大阶乘应使用BigDecimal类
        BigDecimal k = new BigDecimal(1);
        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= 1000; i++) {
            k = k.multiply(new BigDecimal(i));
            sum = sum.add(k);
        }
        System.out.println("1!+2!+3!+...+1000! = " + sum);
    }
}
