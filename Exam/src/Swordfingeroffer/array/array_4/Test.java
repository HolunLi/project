package Swordfingeroffer.array.array_4;

/*
时间: 2021-3-12 13:54:49
题目: 替换空格
题目描述: 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
示例:
输入：s = "We are happy."
输出："We%20are%20happy."
 */

class Solution {
    static public String replaceSpace(String s) {
        char[] chars = new char[s.length()*3]; //创建一个字符数组,确保该数组长度是字符串长度的3倍
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {  //charAt方法返回字符串指定下标上的字符
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            }
            else
                chars[j++] = s.charAt(i);
        }

        String newString = new String(chars,0, j); //取字符数组chars下标0到下标j上的字符，创建字符串
        return newString;
    }
}

public class Test {
    public static void main(String[] args) {
        String s = "We are happy.";

        s = Solution.replaceSpace(s);
        System.out.println(s);
    }
}
