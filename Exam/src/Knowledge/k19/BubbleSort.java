package Knowledge.k19;

/*
时间: 2021-1-27 19:15:03
知识点: 交换排序之冒泡排序
       边比较，边交换(每一趟都是这样)
       时间复杂度为O(n^2),空间复杂度为O(n)
       每一趟归位的元素再后面的排序过程中，元素位置不再发生变化，所以冒泡排序是稳定的排序
       时间复杂度和空间复杂度是衡量一个算法好坏的标准
*/

import java.util.Scanner;

public class BubbleSort {

    //从待排序的序列前端开始，每一趟将最大的元素上浮(归位),每一趟归位的元素，无需再参加下一趟的排序
    public static void sort1(int[] array) {
        int tmp;

        //n个元素总共要进行n-1趟排序(实际上可能不需要n-1趟,可能在某一趟就已排序完成，就不需要后面几趟排序,所以该算法可以改进)
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {  //内部的for循环每执行一次，就是执行“一趟排序”
                if (array[j] > array[j+1]) { //将此语句中大于号改成小于号,排序后的序列会是一个递减的序列
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }

            System.out.printf("\n第%d趟:", i+1);
            for (int j = 0; j < array.length; j++)
                System.out.print(array[j] + " ");   //输出每一趟排序后的序列
        }
    }

    //从待排序的序列末尾开始，每一趟将最小的元素上浮(归位),每一趟归位的元素，无需再参加下一趟的排序
    public static void sort2(int[] array) {
        int tmp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {  //该for循环执行的是“一趟排序”
                if (array[j] < array[j - 1]) { //将此语句中小于号改成大于号,排序后的序列会是一个递减的序列
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }

    //改进后的冒泡排序(当某一趟排序进行比较时不出现任何元素交换,说明已经排序好,就可以提前结束,不需要再执行后面的几趟排序)
    public static void sort3(int[] array) {
        int tmp;
        boolean exchange;

        for (int i = 0; i < array.length-1; i++) {
            exchange = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    exchange = true; //每趟排序中一旦有元素进行交换,将exchange置为真
                }
            }
            if (!exchange)  //若本趟没有发生元素交换,说明已排序好,就可以中途结束算法
                return;
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

        BubbleSort.sort1(array);
        System.out.printf("\n\n排序后结果:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}