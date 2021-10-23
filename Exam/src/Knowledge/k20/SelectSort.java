package Knowledge.k20;

import java.util.Scanner;

/*
时间: 2021-1-27 21:14:23
知识点: 选择排序之简单选择排序
       先比较找到最大/元素后，再交换(每一趟都是这样)
       时间复杂度为O(n^2),空间复杂度为O(n)
       每一趟归位的元素再后面的排序过程中，元素位置不再发生变化，所以选择排序是稳定的排序
       较冒泡排序而言，元素的比较次数基本相同，但选择排序元素交换的次数大大减少，所以选择排序较快
*/

public class SelectSort {

    //从待排序的序列前端开始，每一趟将最小的元素归位,每一趟归位的元素，无需再参加下一趟的排序
    public static void sort1(int[] array) {
        int min, tmp;

        for (int i = 0; i < array.length - 1; i++) { //n个元素执行n-1趟排序即可
            min = i;
            for (int j = i + 1; j < array.length; j++) {  //内部的for循环每执行一次，就是执行“一趟排序”,记录每趟中最小元素的位置
                if (array[j] < array[min]) { //如果此语句中小于号改成大于号,就变成每趟将最大的元素归位,排序后的序列会是一个递减的序列
                    min = j;
                }
            }
            if (min != i) { //如果每趟排序找到的最小元素不是该趟第一个元素，则与第一个元素交换位置
                tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }

            System.out.printf("\n第%d趟:", i+1);
            for (int j = 0; j < array.length; j++)
                System.out.print(array[j] + " ");   //输出每一趟排序后的序列
        }
    }

    //从待排序的序列后端开始，每一趟将最大的元素归位,每一趟归位的元素，无需再参加下一趟的排序
    public static void sort2(int[] array) {
        int max, tmp;

        for (int i = array.length-1; i > 0; i--) { //n个元素执行n-1趟排序即可
            max = i;
            for (int j = i - 1; j >= 0; j--) {  //内部的for循环每执行一次，就是执行“一趟排序”,记录每趟中最大元素的位置
                if (array[j] > array[max]) { //如果将此语句中大于号改成小于号,就变成每趟将最小的元素归位,排序后的序列会是一个递减的序列
                    max = j;
                }
            }
            if (max != i) { //如果每趟排序找到的最大元素不是该趟最后一个元素，则与最后一个元素交换位置
                tmp = array[max];
                array[max] = array[i];
                array[i] = tmp;
            }

            System.out.printf("\n第%d趟:", array.length-i);
            for (int j = 0; j < array.length; j++)
                System.out.print(array[j] + " ");   //输出每一趟排序后的序列
        }
    }
}

class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner reader = new Scanner(System.in);

        System.out.println("请向数组中输入十个元素:");
        for (int i = 0; i < array.length; i++)
            array[i] = reader.nextInt();

        SelectSort.sort2(array);
        System.out.printf("\n\n排序后结果:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
