package Knowledge.k36;

//军队类
public class Army {
    private Weapon[] weapons; //军队拥有武器库,武器库用数组来实现

    public Army() {
        weapons = new Weapon[4]; //军队默认拥有4中武器
    }

    public Army(int len) {
        weapons = new Weapon[len];
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }

    //向军队武器库中加入武器
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for (int i = 0; i <weapons.length; i++) {
            if (null == weapons[i]) {
                weapons[i] = weapon;
                System.out.println(weapon + "成功加入武器库!");
                return;
            }
        }
        throw new AddWeaponException("武器库已满," + weapon + "加入失败!");
    }

    //开始战斗
    public void startFighting() {
        Moveable moveable;
        Shootable shootable;

        for (int i = 0; i < weapons.length; i++) {
            //如果引用型变量weapon[i]指向的对象同时实现了接口Moveable和Shootable
            if (weapons[i] instanceof Moveable && weapons[i] instanceof Shootable) {
                moveable = (Moveable) weapons[i];
                moveable.move();
                shootable = (Shootable) weapons[i];
                shootable.shoot();
            }
            else if (weapons[i] instanceof Moveable){
                moveable = (Moveable) weapons[i];
                /*
                这里存在一个疑问:为什么可以将Weapon类型的变量(weapons[i])强制转换成Moveable接口类型的变量
                解析:
                在本程序中自定义的Weapon类和Moveable接口之间也没有任何关系,是两种不同的引用数据类型
                但因为Weapon类型的变量(weapons[i])指向的对象即继承Weapon类有又实现Moveable接口,让这两种类型之间
                产生了某种关系,所以在满足这种条件下可以将Weapon类型的变量强制转换成Moveable接口类型的变量
                */
                moveable.move();
            }
            else {
                shootable = (Shootable) weapons[i];
                shootable.shoot();
            }
        }
    }
}
