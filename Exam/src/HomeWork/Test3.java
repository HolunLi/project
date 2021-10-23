package HomeWork;

import java.util.Scanner;

class FangCheng
{
    static double a, b, c;
    double x1, x2, disc;

    FangCheng(double a, double b, double c)
    {
       this.a = a;
       this.b = b;
       this.c = c;
    }

    public void root()
    {
        disc = b*b - 4*a*c;

        System.out.printf("equation:%.2fx*x + %.2fx + %.2f = 0\n", a, b, c);
        System.out.println("root:");
        if (disc > 0)
        {
            x1 = (-b + Math.sqrt(disc)) / (2*a);
            x2 = (-b - Math.sqrt(disc)) / (2*a);
            System.out.println("该方程有两个不相等的实数根，分别是:");
            System.out.println("x1 = " + x1 + ",x2 = " + x2);
        }
        else if (disc == 0)
        {
           x1 = -b / (2*a);
           System.out.println("该方程有两个相等的实数根:");
           System.out.println("x1 = x2 = " + x1);
        }
        else
            System.out.println("该方程无解!");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x, y, z;
        char c;

        while (true) {
            System.out.print("请输入x, y, z:");
            x = reader.nextDouble();
            y = reader.nextDouble();
            z = reader.nextDouble();

            FangCheng f1 = new FangCheng(x, y, z);
            f1.root();
            System.out.print("continue or not(Y/N):");
            c = reader.next().charAt(0);
            if (c == 'Y' || c == 'y')
                continue;
            else
                break;
        }
    }
}


