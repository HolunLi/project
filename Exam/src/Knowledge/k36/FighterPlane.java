package Knowledge.k36;

//战斗机类
public class FighterPlane extends Weapon implements Moveable, Shootable{
    public void move() {
        System.out.println("战斗机起飞!");
    }

    public void shoot() {
        System.out.println("战斗机开火");
    }

    public String toString() {
        return "战斗机";
    }
}
