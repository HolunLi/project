package Knowledge.k43;

/*
时间: 2021-2-16 12:42:12
知识点: 如何自定义泛型类/接口/方法
 */

//声明泛型类MyList
class MyList<E> {
    //泛型E可以是成员变量的类型
    private E key;

    //泛型E可以是方法中形参的类型
    //public boolean add(E e) {}

    //泛型E可以是方法的类型(返回值类型)
    //public E get(int index) {}
    /*
    注: get方法并不是泛型方法,这里的get方法只是使用
    泛型类MyList声明的泛型E作为返回值类型而已。
    泛型方法必须使用 <泛型> 来声明。
     */

    //声明泛型方法fx,并使用泛型M作为形参m的类型
    public <M> void fx(M m) {
        System.out.println(m);
    }
    //注: 泛型方法必须要使用 <泛型> 来声明
}

//声明泛型接口NewList
interface NewList<E> {
    //泛型E可以是抽象方法中形参的类型
    boolean add(E e);

    //泛型E可以是抽象方法的类型(返回值类型)
    E get(int index);
}

//声明泛型类/接口/方法时，可以同时定义多个泛型
class MyNewList<E,F,V> {
    //泛型V作为成员变量的类型
    private V key;

    //泛型E作为方法中形参的类型
    //public boolean add(E e) {}

    //泛型F作为方法的类型
    //public F get(int index) {}
}

public class Test {
    public static void main(String[] args) {

    }
}