package com.denggeniubi.www;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//        示例：
//        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//        输出：7 -> 0 -> 8
//        原因：342 + 465 = 807
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//    }
//}

public class AddTwoNumbers {
      public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null && l2 ==null){return null;}
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int addone = 0;
        while (p!=null || q!=null || addone!=0)//分析可知，进一 不是0的情况下也不能终止
        {
            int x = (p == null)? 0 :p.val;
            int y = (q == null)? 0 :q.val;
            int sum = x + y + addone;
            head.next = new ListNode(sum%10);
            head = head.next;
            addone = sum/10;
            if (p != null) {//这里不能用p.next，因为如果只有一个元素，那么p.next就是null，那么就不会进入条件，然后，p就不会指向后一个
                //导致死循环，while的p!=null一直成立
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        return dummy.next;
    }
}
