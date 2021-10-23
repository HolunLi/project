package Book;

public class Circle {
    private double radius;

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void outPutArea()
    {
        System.out.println("圆的面积为:" + (3.14*radius*radius));
    }
}
