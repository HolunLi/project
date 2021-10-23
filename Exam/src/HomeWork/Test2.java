package HomeWork;

interface Person1
{
    void f(int x);
    void g(int x, int y);
    double h(double x);
}

class P1 implements Person1
{
    public void f(int x)
    {
        System.out.printf("我叫小明，是爸爸的第%d个儿子!\n", x);
    }

    public void g(int x, int y)
    {
        System.out.printf("我%d年%d月出生!\n", x, y);
    }

    public double h(double y)
    {
        return y;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Person1 p;

        p = new P1();
        p.f(1);
        p.g(2010, 9);
        System.out.printf("今年已经%.0f岁了!", p.h(10));
    }
}


