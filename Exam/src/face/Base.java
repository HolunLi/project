package face;

/*
时间: 2021-4-9 18:00:10
问题: 以下程序的运行结果是什么?
答: 会在控制台输出null
解析:
静态内部类Sub继承包含它的的外部类Base,因此继承了Base类除private修饰的成员变量和方法外的所有成员变量和方法(构造方法不能继承)
所以在该程序中Sub不仅是Base的内部类,还是其子类。
该程序,Sub类中没有显式的为该类的提供构造方法,系统会为其提供一个无参数的构造方法,如下所示
pub Sub() {
}

我们知道子类的构造方法中的第一语句就是调用父类的构造方法,如果子类的构造方法中没有显式的调用其父类构造方法,默认会调用父类无参数的
构造方法,所以在Sub类中的构造方法的第一行,默认会有一条调用父类无参数构造方法的语句,如下所示:
pub Sub() {
   super(); //调用父类无参数构造方法,默认提供,这条语句是看不见的(隐式的)
}

原因:
在main方法中创建的是Sub类的对象,会先调用其无参数的构造方法"public Sub() {}",然后执行其中的第一条语句"super()",紧接着就调用了
父类的构造方法"public Base() {}",接着继续执行构造方法Base中的语句"printName();"。问题就出在这,printName方法在父类中存在,并且子类Sub
也重写了printName,那这里调用的是父类的,还是子类的。这里要遵循一条原则"父引子实",即父类里有printName方法,如果子类中重写了printName方法
就会调用子类里重写的printName方法，如果子类里没有重写printName方法,就会调用父类的printName。所以该程序中调用的是子类Sub中的printName
方法,随后在这个方法中将Sub类的成员变量baseName输出,但因为此时Sub类的成员变量baseName还没来得及初始化,所以最后输出null(我们知道String类型
的成员变量在定义时,如果未初始化,默认赋值null)。如下所示:
pub Sub() {
   super();   //调用父类无参数构造方法,默认提供,这条语句是看不见的(隐式的)
   baseName = "sub"; //初始化Sub类的成员变量baseName,该语句是看不见的(隐式的)
}
从子类Sub的构造方法可以看出,调用父类无参数构造方法的语句,在初始化Sub类的成员变量baseName的语句之前执行。

 */

public class Base {
    public static void main(String[] args) {
        Base b = new Sub();
    }

    private String baseName = "base"; //同理

    public Base() {
        printName();
    }

    public void printName() {
        System.out.println(baseName);
    }

    static class Sub extends Base {
        private String baseName = "sub";
        //定义成员变量baseName,并初始化。这里注意,此条语句看上去好像是定义baseName的同时就初始化了
        //然而实际上是在构造方法中初始化的,即在构造方法中,再将"sub"赋予String类型变量baseName,所下所示:
        //  pub Sub() {
        //    super(); //默认提供,该语句是看不见的
        //    baseName = "sub"; //该语句是看不见的
        //  }


        //如果子类Sub中不重写该方法,控制台会输出base
        public void printName() {
            System.out.println(baseName);
        }
    }
}
