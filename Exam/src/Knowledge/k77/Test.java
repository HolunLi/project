package Knowledge.k77;

/*
时间: 2021-3-30 20:24:09
知识点: 调用currentThread()方法，获取当前运行的线程对象
 */

public class Test {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(); //创建第一个分支线程
        MyThread thread2 = new MyThread(); //创建第二个分支线程

        thread1.setName("t1"); //设置该线程的名字为t1
        thread2.setName("t2"); //设置该线程的名字为t2
        thread1.start(); //开启线程t1
        thread2.start(); //开启线程t2

        /*在main方法中调用currentThread()方法
        我们知道main方法由主线程来执行,所以在这里调用该方法获取的当前线程对象是主线程*/
        Thread t = Thread.currentThread();
        //在控制台会输出主线程的名字: main
        System.out.println(t.getName());
    }
}

class MyThread extends Thread {

    public void run() {

        /*在run方法中调用currentThread()获取当前线程对象
        我们知道如果分支线程争夺到CPU时间片,就会自动执行该分支线程中的run方法
        当轮到分支线程t1执行,那么此时获取的当前线程对象就是t1
        当轮到分支线程t2执行,那么此时获取的当前线程对象就是t2*/
        Thread t = Thread.currentThread();
        //输出哪个分支线程的名字,取决于此时轮到哪个分支线程执行
        System.out.println(t.getName());
        for (int i = 0; i < 50; i++) {
            System.out.println("分支线程" + t.getName() + "->" + i);
        }
    }
}
