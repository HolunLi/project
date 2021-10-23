package Knowledge.k10;

/*
* 时间: 2021-1-20 14:40:39
* 面向接口编程的实例
* 在实际的开发中，强调面向接口或面向抽象编程
* 面向接口编程同面向抽象编程一样，可以降低程序的耦合度，提高程序的扩展性
* 扩展: 面向抽象编程的实例在K1
* */

interface FoodMenu {
   void 西红柿炒鸡蛋();
   void 红烧鲫鱼();
}

abstract class Cooler implements FoodMenu{}

class ChinaCooker extends Cooler {
    public void 西红柿炒鸡蛋() {
        System.out.println("中国厨师做的西红柿炒鸡蛋！");
    }

    public void 红烧鲫鱼() {
        System.out.println("中国厨师做的红烧鲫鱼！");
    }
}

class AmercianCooker extends Cooler {
    public void 西红柿炒鸡蛋() {
        System.out.println("美国厨师做的西红柿炒鸡蛋！");
    }

    public void 红烧鲫鱼() {
        System.out.println("美国厨师做的红烧鲫鱼！");
    }
}

class Customer {
    private FoodMenu f;

    public Customer() {}

    public Customer(FoodMenu f) {
        this.f = f;
    }

    public void setFoodMenu(FoodMenu f) {
        this.f = f;
    }

    public FoodMenu getFoodMenu() {
        return this.f;
    }

    public void Order() {
        f.红烧鲫鱼();
        f.西红柿炒鸡蛋();
    }
}

public class K10 {
    public static void main(String[] args) {
        Customer c1 = new Customer(new ChinaCooker());
        c1.Order();
        c1.setFoodMenu(new AmercianCooker());
        c1.Order();
    }
}








