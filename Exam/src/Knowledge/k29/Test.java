package Knowledge.k29;

import java.util.Random;

/*
时间: 2021-2-2 21:27:27
知识点: 使用Random类生成随机数
*/

public class Test {
    public static void main(String[] args) {
        Random r1 = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = -1;

        //生成10个不重复的随机数
        for (int i = 0; i < array.length; ) {
            int num = r1.nextInt(10); //随机生成[0,10]之间的随机数
            if (!contains(array, num))
                array[i++] = num;
        }

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    //该方法用于判断数组array中是否包含生成的随机数
    public static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return true;
        }
        return false;
    }
}
