package Swordfingeroffer.array.array_2;

/*
时间: 2021-3-10 18:39:45
题目: 找出数组中重复的数字
题目描述: 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
示例:
输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    //暴力枚举法(遍历数组找元素)找出数组中重复的那个数字
    static public int findRepeatNumberA(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    /*
    由于只需要找出数组中任意一个重复的数字，因此遍历数组，遇到重复的数字即返回。
    为了判断一个数字是否重复遇到，使用HashSet集合存储已经遇到的数字，如果遇到的一个数字已经在集合中，则当前的数字是重复数字。
    */
    static public int  findRepeatNumberB(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (!set.add(nums[i])) { //若add方法添加是当前集合中不存在的元素,则添加成功返回true,
                                     // 若添加的元素存在,覆盖后,返回faslse
                return nums[i];
            }
        }
        return 0;
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 0, 76, 2, 76};

        int k = Solution.findRepeatNumberB(array);
        //int k = Solution.findRepeatNumberA(array);
        System.out.println("数组中重复的数是:" + k);
    }
}
