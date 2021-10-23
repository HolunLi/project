package Test.com.holun.www.computer;
import Test.com.holun.www.jiekou.*;
import Test.com.holun.www.keyboard.Keyboard;
import Test.com.holun.www.monitor.Monitor;
import Test.com.holun.www.mouse.Mouse;
import Test.com.holun.www.printer.Printer;


public class Computer {
    private InsertDrawable[] in;

    public Computer(){}

    public Computer(InsertDrawable[] in) {
        this.in = in;
    }

    public InsertDrawable[] getIn() {
        return in;
    }

    public void setIn(InsertDrawable[] in) {
        this.in = in;
    }

    public void 组装() {
        in[0] = new Mouse();
        in[1] = new Keyboard();
        in[2] = new Monitor();
        in[3] = new Printer();

        for (int i = 0; i < 4; i++) {
            in[i].chaRu();
        }

        System.out.println("电脑组装完毕!");
    }
}













