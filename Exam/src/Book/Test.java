package Book;

public class Test {
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle();
       Circle c1 = new Circle();
       Geometry G1 = new Geometry(r1, c1);

       //G1.c1.setRadius(2.0);
       G1.r1.setLengthAndWidth(5.0, 7.0);
       G1.c1.outPutArea();
       G1.r1.outPutArea();

       byte[] a = "欢饮wecfg".getBytes();
        System.out.println(a.length);
    }
}
