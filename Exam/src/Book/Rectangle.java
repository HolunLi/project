package Book;

class Rectangle {
    private double length, width;

    void setLengthAndWidth(double x, double y)
    {
        length = x;
        width = y;
    }

    void outPutArea()
    {
        System.out.println("长方形的面积为:" + (length*width));
    }
}
