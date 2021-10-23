package Knowledge.k21;

/*
时间: 2021-1-28 13:36:21
知识点: 顺序查找(不要求待查找的元素序列是否有序)
       折半查找(前提条件是，待查找的元素序列必须是有序的)
*/

import java.util.Scanner;

public class Search {

    //顺序查找
    public static int seqSearch(int[] array, int e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e)
                return i;
        }
        return -1;
    }

    //折半查找
    public static int binSearch(int[] array, int e) {
        int low, high;

        low = 0;
        high = array.length -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (e == array[mid])
            return mid;
            else if (e < array[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array1 = {12, 2, 1, 1, 56, 100, 0, 14};
        int[] array2 = {1, 2, 3, 12, 32, 44, 50, 52};
        int e;

        System.out.print("请输入需要查找的元素(顺序查找):");
        e = reader.nextInt();
        int e1 = Search.seqSearch(array1, e);
        if (e1 != -1)
            System.out.println("该元素的下标为:" + e1);
        else
            System.out.println("不存在该元素!");

        System.out.print("请输入需要查找的元素(折半查找):");
        e = reader.nextInt();
        int e2 = Search.binSearch(array2, e);
        if (e2 != -1)
            System.out.println("该元素的下标为:" + e2);
        else
            System.out.println("不存在该元素!");
    }
}







