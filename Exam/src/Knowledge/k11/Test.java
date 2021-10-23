package Knowledge.k11;

public class Test {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(2021,1,22);
        MyTime t2 = new MyTime(2021,1,22);
        //MyTime t2 = null;

        try {
            System.out.println(t1.toString());
            System.out.println(t2.toString());
        }
        catch (Exception e) {
            System.out.println(e);
        }

        //判断对象t1和t2是否相等(这里指的是对象的内容是否相等，而不是对象的地址)
        System.out.println(t1.equals(t2));
    }
}
