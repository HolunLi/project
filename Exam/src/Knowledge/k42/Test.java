package Knowledge.k42;

/*
时间: 2021-2-16 11:16:00
知识点: 取出集合中的元素时,涉及到的多态问题
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

abstract class Animals {
    public abstract void move();
}

class Cat extends Animals {
    //重写父类中的move方法
    public void move() {
        System.out.println("猫在奔跑");
    }

    //catchMouse方法是Cat类中新增的方法
    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}

class Bird extends Animals {
    //重写父类中的move方法
    public void move() {
        System.out.println("鸟在飞翔");
    }

    //eat方法是Bird类中新增的方法
    public void eat() {
        System.out.println("鸟在吃虫子");
    }
}

public class Test {
    public static void main(String[] args) {
        List<Animals> myList = new ArrayList<>();

        myList.add(new Cat());
        myList.add(new Bird());
        Iterator<Animals> it = myList.iterator();
        while (it.hasNext()) {
            //上转型
            Animals animals = it.next();
            //可直接调用被子类重写/继承的方法,即可直接调用父类Animals类型中有的方法
            animals.move();
            //catMouse方法和eat方法都是子类中独有的方法,必须强制类型转换(向下转型)
            if (animals instanceof Cat) {
                Cat cat = (Cat) animals;
                cat.catchMouse();
            }
            if (animals instanceof Bird) {
                Bird bird = (Bird) animals;
                bird.eat();
            }
        }
    }
}
