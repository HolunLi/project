package Knowledge.k1;

/*
* 多态
* 多态降低了程序的耦合性，提高了扩展性
* 多态强调面向抽象或面向接口编程
* */

/*
   master主人类面向抽象的pet，而不是具体的宠物
   提倡面向抽象编程，不要面向具体编程
   面向抽象编程的好处是，耦合度低，扩展力强
   下面是面向抽象编程的实例
*/
class Master
{
    public void feed(Pet pet)
    {
        pet.eat();
    }
}

abstract class Pet
{
    public abstract void eat();
}

class Dog extends Pet
{
    public void eat()
    {
        System.out.println("狗在啃骨头!");
    }
}

class Cat extends Pet
{
    public void eat()
    {
        System.out.println("猫在吃鱼!");
    }
}


public class K1
{
    public static void main(String[] args)
    {
        Master m = new Master();

        Pet p = new Dog();
        m.feed(p);
        p = new Cat();
        m.feed(p);
    }
}
