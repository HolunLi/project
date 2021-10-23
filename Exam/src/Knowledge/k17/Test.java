package Knowledge.k17;

import java.util.Scanner;

/*
时间: 2021-1-25 19:29:49
目的: 使用数组实现顺序栈
知识点: 栈是一种先进后出的数据结构
*/

class MyStack {
    private int top;
    private int[] array;

    public MyStack() {
        array  = new int[10];  //栈的默认容量
        top = -1;
    }

    public MyStack(int top, int[] array) {
        this.top = top;
        this.array = array;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    //进栈
    public boolean pushStack(int element) {
        if (top == array.length - 1) {
            System.out.println("栈已满,无法进栈!");
            return false;
        }
        array[++top] = element;
        return true;
    }

    //出栈
    public boolean PopStack() {
        if (top == -1) {
            System.out.println("栈为空,出栈失败!");
            return false;
        }
        Test.e2 = array[top];
        top--;
        return true;
    }

    //取出栈顶元素
    public boolean getTopElement() {
        if (top == -1){
            System.out.println("栈为空,取栈顶元素失败!");
            return false;
        }
        Test.e1 = array[top];
        return true;
    }

    //输出栈中的元素
    public void disp() {
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class Test {
    public static int e1, e2;

    public static void main(String[] args) {
        MyStack stack1 = new MyStack(-1,new int[10]);
        Scanner reader = new Scanner(System.in);
        int n;

        System.out.print("请输入需要将几个元素进栈:");
        n = reader.nextInt();
        for (int i = 0; i < n; i++)
            stack1.pushStack(reader.nextInt());

       if (stack1.getTopElement())
           System.out.printf("此时的栈顶元素为:%d\n", e1);

        System.out.print("请输入需要将几个元素出栈:");
        n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
           if (stack1.PopStack())
               System.out.printf("第%d个出栈的元素为:%d\n", i, e2);
           else
               break;
        }
        stack1.disp();
        if (stack1.getTopElement())
            System.out.printf("此时的栈顶元素为:%d\n", e1);

        System.out.print("请输入需要将几个元素出栈:");
        n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            if (stack1.PopStack())
                System.out.printf("第%d个出栈的元素为:%d\n", i, e2);
            else
                break;
        }
        if (stack1.getTopElement())
            System.out.printf("此时的栈顶元素为:%d\n", e1);
    }
}





