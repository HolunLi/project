package Knowledge.k45;

import java.util.ArrayList;

/*
时间: 2021-2-19 14:40:17
知识点: 将两个长度不等的有序的数组进行排序(归并排序)
 */

public class Test {
    public static void main(String[] args) {
        int[] a1 = {1, 4, 8, 17, 23, 24, 25};
        int[] a2 = {2, 7, 23, 34, 100};
        int i = 0, j = 0;
        ArrayList<Integer> myList = new ArrayList<>();

        while (i<a1.length && j<a2.length) {
            if (a1[i] <= a2[j]) {
                myList.add(a1[i]);
                i++;
            }
            else {
                myList.add(a2[j]);
                j++;
            }
        }
        while (i<a1.length) {
            myList.add(a1[i]);
            i++;
        }
        while (j<a2.length) {
            myList.add(a2[j]);
            j++;
        }

        for (Integer integer : myList)
            System.out.print(integer + " ");
    }
}

