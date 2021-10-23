package HomeWork;

import java.util.Scanner;

class Gys
{
    public int f(int n, int m)
    {
        int  t, r;

        while (n%m != 0)
        {
            r = n % m;
            n = m;
            m = r;
        }

        return m;
       /* if (n < m)
        {
            t = n;
            n = m;
            m = t;
        }
        if (n%m == 0)
            return m;
        else
            return f(m, n%m);*/
    }
}

class Gbs extends Gys
{
    public int f(int a, int b)
    {
        int m;

        m = super.f(a, b);
        return a*b/m;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
        Gys g1 = new Gys();
        Gbs g2 = new Gbs();
        int n, m;

        System.out.print("请输入两个整数:");
        n = reader.nextInt();
        m = reader.nextInt();
        System.out.printf("%d和%d的最大公约数为:%d\n", n, m, g1.f(n, m));
        System.out.printf("%d和%d的最小公倍数为:%d\n", n, m, g2.f(n, m));
    }
}
