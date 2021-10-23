package Knowledge.k3;

/*时间: 2020-11-30 16:14:28*/



class Vehicle {
    private String vName;
    private double speed;

    public Vehicle(String vName, double speed) {
        this.vName = vName;
        this.speed = speed;
    }

    //获取交通工具的速度
    public double getSpeed() {
        return speed;
    }

    //设置交通工具的速度
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //返回交通工具的名字
    public String getvName() {
        return vName;
    }

    //设置交通工具的名字
    public void setvName(String vName) {
        this.vName = vName;
    }

    //加速
    public void speedUp(double speed) {
        //在当前速度的基础上加速
        double s = this.getSpeed() + speed;

        if (this.speed == 500)
            System.out.println("当前速度已达极限速递，无法加速!");
        else if (s > 500)
        {
            System.out.printf("+%.2fm/s，实际只加了%.2fm/s\n",
                    speed, (speed - (this.getSpeed()+speed-500)));
            System.out.printf("无法加速到%.2fm/s，速度为500m/s固定不变，无法再加速\n", s);  //直接用speed也行
            this.speed = 500;
        }
        else
        {
            System.out.printf("+%.2fm/s\n", speed);
            this.speed = s;
        }
    }

    //减速
    public void speedDown(double speed) {
        //在当前速度的基础上减速
        double s = this.getSpeed() - speed;

        if ((this.speed == 0))
            System.out.println("速度已为0m/s，无法再减速!");
        else if ((this.getSpeed() - speed) < 0)
        {
            System.out.printf("-%.2fm/s，实际只减了%.2fm/s\n",
                    speed, (speed - Math.abs(s)));
            System.out.printf("无法减速到%.2fm/s，速度为0m/s固定不变，停车熄火!\n", s);  //直接用speed也行
            this.speed = 0;
        }
        else
        {
            System.out.printf("-%.2fm/s\n", speed);
            this.speed = s;
        }
    }

    //交通工具的移动方法
    public void move() {
        System.out.printf("交通工具:%s，起始速度:%.2fm/s，开始起步\n",
                           this.vName, this.speed);  //直接用vName,speed也行
    }

    //输出交通工具的速度
    public void 当前速度() {
        System.out.printf("当前速度为:%.2fm/s\n", this.getSpeed()); ////直接用speed也行
    }
}

public class K3 {
    public static void main(String[] args) {
        Vehicle v_1 = new Vehicle("公交车", 30);
        v_1.move();
        v_1.speedUp(100);
        v_1.当前速度();
        v_1.speedUp(370);
        v_1.当前速度();
        v_1.speedUp(30);
        v_1.当前速度();
        System.out.println();

        Vehicle v_2 = new Vehicle("跑车", 200);
        v_2.move();
        v_2.speedDown(100);
        v_2.当前速度();
        v_2.speedDown(120);
        v_2.当前速度();
        /*v_2.speedDown(12);
        v_2.当前速度();*/
    }
}
