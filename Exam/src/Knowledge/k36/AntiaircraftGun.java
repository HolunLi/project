package Knowledge.k36;

//高射炮类
public class AntiaircraftGun extends Weapon implements Shootable {
    public void shoot() {
        System.out.println("高射炮开炮!");
    }

    public String toString() {
        return "高射炮";
    }
}
