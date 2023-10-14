package com.liuqiao.algorithm;

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义一个链表用来存储两条链表相加的结果，result和current为两个指针
        // current为头结点不进行移动，result为最后要输出的链表
        ListNode result = null, current = null;

        // 定义total变量为l1和l2两条链表相加后需要进位的数据
        int total = 0;
        // 如果l1和l2两条链表相加后需要进位，remainder变量为个位数的值
        // 如果l1和l2两条链表相加后不需要进位，remainder为两数相加后的值
        int remainder = 0;

        // 只要有一条链表不为空就继续进行遍历
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            // 定义sum为两数相加后再与进位数相加后的值
            int sum = num1 + num2 + total;

            // 对两数相加的结果进行整除，取出进位的值
            total = sum / 10;
            // 对两数相加的结果对10进行取余，取出不需要进位的值
            remainder = sum % 10;

            if (result == null) {
                result = current = new ListNode(remainder);
            } else {
                // 将当前不需要进位的值赋值给下一个节点要存储的值
                current.next = new ListNode(remainder);
                // 将current指针向后移动
                current = current.next;
            }

            // 将l1和l2节点同时向后移动
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (total > 0) {
            current.next = new ListNode(total);
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 9;
        ListNode l1Next = new ListNode();
        l1Next.val = 4;
        l1.next = l1Next;
        ListNode l2 = new ListNode();
        l2.val = 1;
        ListNode l2Next = new ListNode();
        l2Next.val = 4;
        l2.next = l2Next;
        addTwoNumbers(l1, l2);
    }
}
