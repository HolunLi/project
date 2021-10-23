package Swordfingeroffer.array.array_1;

import java.util.Hashtable;
import java.util.Map;

/*
时间: 2021-3-10 09:08:27
题目:求两数之和
题目描述:给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
你可以按任意顺序返回答案。
实例:
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */

class Solution {
    //暴力枚举法(遍历数组找元素)找出数组中找出和为目标值的那两个整数及其下标
    static public int[] twoSumA(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /*注意到方法一的时间复杂度较高的原因是寻找 target - x 的时间复杂度过高。
    因此，我们需要一种更优秀的方法，能够快速寻找数组中是否存在目标元素。如果存在，我们需要找出它的索引。
    使用哈希表，可以将寻找 target - x 的时间复杂度降低到从 O(N) 降低到 O(1)。
    这样我们创建一个哈希表，对于每一个 x，我们首先查询哈希表中是否存在 target - x，
    然后将 x 插入到哈希表中，即可保证不会让 x 和自己匹配。*/
    static public int[] twoSumB(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new Hashtable<>(); //使用HashMap也行
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i); //将当前数组元素,及其下标添加到HashTable中
        }
        return new int[0];
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 11, 10};
        //int[] a = Solution.twoSumA(array, 21);
        int[] a = Solution.twoSumB(array, 21);
        int k = 0;
        for (int i : a) {
            System.out.println(i);
        }
    }
}

