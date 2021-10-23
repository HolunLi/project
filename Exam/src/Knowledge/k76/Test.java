package Knowledge.k76;

/*
时间: 2021-3-30 19:12:37
知识点: 调用start方法,开启线程
 */

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread(); //创建一个分支线程

        thread.setName("t1"); //设置该分支线程的名字为t1
        //开启分支线程t1,为该线程在JVM中分配(开辟)一个独立的栈空间(分支栈),作为其工作空间。
        thread.start();
        /*需要注意的是,start()方法的任务就是开启分支线程,并为其开辟一个独立的栈空间。
          只要该方法的任务一完成,就会瞬间结束该方法。开启后的分支线程只要争夺到CPU时
          间片,就会自动执行其run方法,即将run方法压入其对应的分支栈(进栈)。并且同main
          方法一样,run方法压栈后,也处于栈的底部,所以分支线程中的run方法就相当于主线程
          中的main方法,这两个方法是平级的*/

        for (int i = 1; i <= 50; i++) {
            System.out.println("主线程"+ Thread.currentThread().getName() + "->" + i);
        }
    }
}

class MyThread extends Thread {
    public void fun() {
        String name = this.getName(); //获取当前线程的名字

        for (int i = 1; i <= 50; i++) {
            System.out.println("分支线程" + name + "->" + i );
        }
    }

    public void run() {
        fun();
    }
}

