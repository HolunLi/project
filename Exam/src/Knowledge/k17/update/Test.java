package Knowledge.k17.update;

/*
时间: 2021-1-25 19:29:49
目的: 使用数组实现顺序栈(使用自定义异常类进行改进)
知识点: 栈是一种先进后出的数据结构
*/

import java.util.Scanner;

class MyStackOperationException extends Exception {
    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}

class MyStack {
    private int top;
    private Object[] array;

    public MyStack() {
        array  = new Object[10];  //栈的默认容量
        top = -1;
    }

    public MyStack(int top, Object[] array) {
        this.top = top;
        this.array = array;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    //进栈
    public void pushStack(Object element) throws MyStackOperationException {
        if (top == array.length - 1)
            throw  new MyStackOperationException("栈满,无法进栈!");

        array[++top] = element;
    }

    //出栈
    public void PopStack() throws MyStackOperationException {
        if (top == -1)
            throw new MyStackOperationException("栈为空,出栈失败!");

        Test.e2 = array[top--];
    }

    //取出栈顶元素
    public void getTopElement() throws MyStackOperationException {
        if (top == -1)
            throw new MyStackOperationException("栈为空,无法去栈顶元素!");

        Test.e1 = array[top];
    }

    //输出栈中的元素
    public void disp() {
        for (int i = 0; i <= top; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }
}

public class Test {
    public static Object e1, e2;

    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        Scanner reader = new Scanner(System.in);
        int n;

        System.out.print("请输入需要将几个元素进栈:");
        n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                stack1.pushStack(reader.nextInt());
            } catch (MyStackOperationException e) {
                e.printStackTrace();
            }
        }

        try {
            stack1.getTopElement();
            System.out.printf("此时的栈顶元素为:%d\n", e1);
        } catch (MyStackOperationException e) {
            e.printStackTrace();
        }

        System.out.print("请输入需要将几个元素出栈:");
        n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            try {
                stack1.PopStack();
                System.out.printf("第%d个出栈的元素为:%d\n", i, e2);
            } catch (MyStackOperationException e) {
                e.printStackTrace();
            }
        }
        stack1.disp();

        try {
            stack1.getTopElement();
            System.out.printf("此时的栈顶元素为:%d\n", e1);
        } catch (MyStackOperationException e) {
            e.printStackTrace();
        }

        System.out.print("请输入需要将几个元素出栈:");
        n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            try {
                stack1.PopStack();
                System.out.printf("第%d个出栈的元素为:%d\n", i, e2);
            } catch (MyStackOperationException e) {
                e.printStackTrace();
            }
        }

        try {
            stack1.getTopElement();
            System.out.printf("此时的栈顶元素为:%d\n", e1);
        } catch (MyStackOperationException e) {
            e.printStackTrace();
        }
    }
}

