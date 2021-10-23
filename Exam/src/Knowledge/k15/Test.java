package Knowledge.k15;

/*
时间: 2021-1-24 15:13:49
目的: 如何创建数组并初始化数组中的元素
*/

public class Test {
    public static void main(String[] args) {
        //方法一:
        int[] array1;   //int array1[];
        array1 = new int[4];
        //方法二:
        //int[] array1 = new int[4];

        //如何初始化数组中的元素
        //创建数组时，并初始化数组中的元素
        //int[] array2 = {1, 2, 3, 4};

        //先创建数组，再初始化数组中的元素
        int[] array2 = new int[4];
        array2[0] = 1;array2[1] = 2;array2[2] = 3;array2[3] = 4;
        //array2[0] = 1, array2[1] = 2, array2[2] = 3, array2[3] = 4; 这种方法会错误
    }
}
