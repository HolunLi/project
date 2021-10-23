package HomeWork;

class Cylinder implements Volumef{
    private double h, r;
    String color;

    //定义该类的构造方法，并初始化成员变量h, r
    Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    //实例化接口Volume中的抽象方法getArea()
    public double getArea() {
        return 3.14*r*r;
    }

    //实例化接口Volume中的抽象方法setColor()
    public void setColor(String color) {
        this.color = color;
    }

    //实例化接口Volume中的抽象方法getVolume()
    public double getVolume() {
        return getArea()*h;  //this.getArea()*h  也行
    }
}

public class Test6 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(7, 3);
        c1.setColor("蓝色");
        System.out.printf("圆柱体c1的颜色为:%s\n底面积为:%.2f\n体积为:%.2f\n",
                           c1.color, c1.getArea(), c1.getVolume());

        Cylinder c2 = new Cylinder(5, 4);
        c2.setColor("黄色");
        System.out.printf("\n圆柱体c2的颜色为:%s%n底面积为:%.2f%n体积为:%.2f%n",
                           c2.color, c2.getArea(), c2.getVolume());
    }
}
