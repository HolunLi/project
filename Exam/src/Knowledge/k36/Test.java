package Knowledge.k36;

public class Test {
    public static void main(String[] args) {
        Army army = new Army();

        FighterPlane fighterPlane = new FighterPlane();
        Tank tank = new Tank();
        AntiaircraftGun antiaircraftGun = new AntiaircraftGun();
        TransportPlane transportPlane = new TransportPlane();

        try {
            army.addWeapon(fighterPlane);
            army.addWeapon(tank);
            army.addWeapon(antiaircraftGun);
            army.addWeapon(transportPlane);
            army.addWeapon(new FighterPlane());
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }

        army.startFighting();
    }
}
