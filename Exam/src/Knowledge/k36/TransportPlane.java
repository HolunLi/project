package Knowledge.k36;

//运输机类
public class TransportPlane extends Weapon implements Moveable {
    public void move() {
        System.out.println("运输机起飞!");
    }

    public String toString() {
        return "运输机";
    }
}
