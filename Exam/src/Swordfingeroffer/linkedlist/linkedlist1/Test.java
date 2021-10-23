package Swordfingeroffer.linkedlist.linkedlist1;

/*
时间: 2021-3-12 14:35:35
题目:
题目描述: 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
示例:
输入：head = [1,3,2]
输出：[2,3,1]
 */

import java.util.Stack;

//单链表
class ListNode {
    int val;
    ListNode next;

    public ListNode(int i) {
        val = i;
    }

    //尾插法创建单链表
    static public ListNode CreateList(int[] array) {
        ListNode l = null, r = null;

        for (int i = 0; i < array.length; i++) {
            ListNode s = new ListNode(array[i]);
            if (l == null) {
                l = s;
                r = s;
            }
            else {
                r.next = s;
                r = s;
            }
        }
        return l;
    }
}

class Solution {
    //借助栈
    static public int[] reversePrintA(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while (temp != null) { //链表中结点不为空,进栈
            stack.push(temp);
            temp = temp.next;
         }

        int[] array = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) { //栈不空,一直出栈
            array[i++] = stack.pop().val;
        }
        return array;
    }

    //将链表中结点的值,倒序存放在数组中
    static public int[] reversePrintB(ListNode head) {
        ListNode l = head;
        int length = 0;
        while (l != null) { //遍历单链表求其长度
            length++;
            l = l.next;
        }

        int[] array = new int[length];
        l = head;
        for (int i = 1; l != null; i++) { //再次遍历,将单链表中结点的值,倒序存放在数组中
           array[length-i] = l.val;
            l = l.next;
        }
        return array;
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 5};
        ListNode head = ListNode.CreateList(array); //head指向一个单链表

        //int[] newArray = Solution.reversePrintA(head);
        int[] newArray = Solution.reversePrintB(head);
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
