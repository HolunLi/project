package Knowledge.k36;

//坦克类
public class Tank extends Weapon implements Moveable, Shootable{
    public void move() {
        System.out.println("坦克准备出发!");
    }

    public void shoot() {
        System.out.println("坦克开火!");
    }

    public String toString() {
        return "坦克";
    }
}
