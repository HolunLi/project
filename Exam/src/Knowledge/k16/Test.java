package Knowledge.k16;

/*
时间: 2021-1-24 20:38:50
目的:使用数组作为实参，传递参数
*/

public class Test {
    public static void main(String[] args) {

        //这里创建了一个匿名数组，并将该匿名数组的首地址传递给disp方法中的形参数组array
        disp(new int[]{1,2,3,4});

        //int[] a = {7,8,9};
       // disp(a);

    }

    //输出数组中的元素
    public static void disp(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " "); //输出结果为:1 2 3 4
    }
}
