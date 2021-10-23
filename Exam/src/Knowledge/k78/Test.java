package Knowledge.k78;

/*
时间: 2021-4-7 22:23:16
知识点: 调用join方法,让当前运行的线程暂停执行，等待另外一个线程执行结束后，再继续执行。
 */

class MyThread implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(name + "-->" + i);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.setName("A"); //为该线程设置名字A
        thread.start();

        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(name + "-->" + i);
            //当i累加到100时,调用join方法,让主线程暂停执行，等待线程A执行结束后，再继续执行。
            if (i==100) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
