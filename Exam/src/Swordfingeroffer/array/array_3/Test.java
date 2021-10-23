package Swordfingeroffer.array.array_3;

import java.util.Scanner;

/*
2021-3-12 11:14:18:
题目: 二维数组中的查找
题目描述: 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
示例:
现有矩阵 matrix 如下：

  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]

给定 target=5，返回true。
给定target=20，返回false。
 */

class Solution {
    static public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //二维数组不存在，或二维数组为空返回fasle
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        //从数组右上角的元素开始找
        int row = 0, col = matrix[0].length-1;
        while (row <= matrix.length-1 && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target)
                col--; //列变,行不变
            else
                row++; //行变,列不变
        }
        return false;
    }
}

public class Test {
    public static void main(String[] args) {
        int[][] array = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Scanner reader = new Scanner(System.in);

        System.out.println("遍历数组:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }

        System.out.print("请输入要查找的元素:");
        int k = reader.nextInt();
        if (Solution.findNumberIn2DArray(array, k))
            System.out.println("存在该元素!");
        else
            System.out.println("不存在该元素!");
    }
}
