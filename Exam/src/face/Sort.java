package face;

/**
 * 排序的本质是：在当前待排序的序列中，逐渐扩大有序区的过程
 * 扩大有序区的方法各有不同，就造就了各种排序方法
 */
public class Sort {

    /**
     * 直接插入排序：每趟排序，将当前无序区中的第一个元素，插入到有序区
     * 最好情况下的时间复杂度是O(n)
     * 最坏情况下的时间复杂度是O(n^2)
     * 平均时间复杂度是O(n^2)
     * 空间复杂为O(1)
     * 直接插入排序是一个稳定的排序
     */
    public static void insertSortAsc(int[] array) { //升序
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                int temp = array[i], j = i-1;
                do {
                    array[j+1] = array[j];
                    j--;
                } while (j>=0 && array[j] > temp);  //指针j在循环结束后，会指向有序区中小于等于待插入元素的元素
                array[j+1] = temp;
            }
        }
    }

    public static void insertSortDesc(int[] array) {  //降序
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] < array[i]) {
                int temp = array[i], j = i-1;
                do {  //通过循环在有序区中找到要插入的位置
                    array[j+1] = array[j];
                    j--;
                } while (j>=0 && array[j] < temp);  //指针j在循环结束后，会指向有序区中大于等于待插入元素的元素
                array[j+1] = temp;
            }
        }
    }

    /**
     * 因为有序区中的元素是有序的，所以可以使用折半查找在有序区中找到插入的位置，在集中的将插入位置后的元素往后移
     * 折半插入排序（二分插入排序）
     * 折半插入排序较直接插入排序而言，只是减少了元素的比较次数，元素的移动次数并没有减少，所以时间复杂度相同，
     */
    public static void binInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                int temp = array[i], low = 0, high = i-1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (temp < array[mid])
                        high = mid - 1;
                    else
                        low = mid + 1;
                }  //循环结束后，high指针要么指向小于待插入元素的元素，要么执行小于等于待插入元素的元素

                for (int j = i-1; j >= high+1; j--)
                    array[j+1] = array[j];
                array[high+1] = temp;
            }
        }
    }

    /**
     * 冒泡排序: 每趟排序，都是从当前无序区的一端开始，让相邻的元素进行两两比较并交换，找出当前无序区中最大或最小的元素归位，归位的元素不参与后面的排序
     * 最好情况下的时间复杂度是O(n)
     * 最坏情况下的时间复杂度是O(n^2)
     * 平均时间复杂度是O(n^2)
     * 空间复杂为O(1)
     * 冒泡排序是一个稳定的排序
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
                if (!flag)  //如果没有比较并交换，说明已排序结束，可以提前终止
                    return;
            }
        }
    }

    /**
     * 快速排序：每趟排序，都要从当前无序中找一个元素作为基准，并将这个元素归位，归位后的基准元素将无序区划分为两个区间
     * 左区间中的元素均小于基准元素，右区间中的元素均大于基准元素，在按相同的方法对左右子区间进行递归。
     * 最好情况下的时间复杂度是O(nlog2n)
     * 最坏情况下的时间复杂度是O(n^2)
     * 平均时间复杂度是O(nlog2n)
     * 可以看出，快速排序的平均时间复杂度接近最好的情况，是一个非常出色的排序算法
     * 空间复杂为O(log2n)
     * 快速排序是一个不稳定的排序
     */
    public static void quickSort(int[] array, int s, int t) {
        int i;
        if (s < t) {  //当无序区中最少存在两个元素时，才进行区间化分
            i = partition(array, s, t);  //每趟排序，都要找一个基准元素（一般将当前无序区中的第一个元素作为基准元素），并将其归位
            quickSort(array, s, i-1);
            quickSort(array, i+1, t);
        }
    }

    public static int partition(int[] array, int s, int t) {
        int i = s, j = t;
        int temp = array[i];  //以无序区的第一个元素作为基准元素

        while (i < j) {
            while (j>i && array[j] >= temp)  //指针j从无序区右端，往前找小于基准的元素
                j--;
            array[i] = array[j];

            while (i<j && array[i] <= temp)  //指针i从无序区左端，往后找大于基准的元素
                i++;
            array[j] = array[i];
        }  //循环结束后，指针i和指针j会指向同一个位置，这个位置就是基准元素存放的位置（归位）
        array[i] = temp;

        return i;
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = {9, 6, 8, 2, 1, 4, 7, 0, 3, 5};

        Sort.insertSortAsc(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Sort.insertSortDesc(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Sort.binInsertSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Sort.bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Sort.quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

