package HomeWork;

import java.util.Scanner;

class A
{
    public int gys(int n, int m)  //通过两数辗转相除，求最大公因数
    {
        int r, t;

        if (n < m)
        {
            t = n;
            n = m;
            m = t;
        }

        while (n % m != 0)
        {
            r = n % m;
            n = m;
            m = r;
        }

        return m;
    }
}


class B
{
    A a;

    public int gbs(int n, int m)
    {
        return n*m/a.gys(n, m);  //最小公倍数等于两数相乘除以它们的最大公因数
    }
}

public class Test4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        B b = new B();
        b.a = new A();
        int x, y;

        System.out.print("请输入两个整数:");
        x = reader.nextInt();
        y = reader.nextInt();
        System.out.printf("%d和%d的最大公因数为:%d\n", x, y, b.a.gys(x, y));
        System.out.printf("%d和%d的最小公倍数为:%d\n", x, y, b.gbs(x, y));
    }
}

