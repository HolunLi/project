package Test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
      Child child = new Child();
      child.s();
      
      Father father = new Child();
      int i = Integer.parseInt("1.2");
        System.out.println(i);

    }
}

class Father {
    public void s() {
        System.out.println("ss");
    }
}

class Child extends Father {
    public void m() {
        System.out.println("m");
    }
}
