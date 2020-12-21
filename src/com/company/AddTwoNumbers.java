package com.company;

/**
 * @author wanghaiming
 */
public class AddTwoNumbers {
    public static LinkedList.Node addTwoNumbers(LinkedList.Node l1, LinkedList.Node l2) {
        LinkedList.Node pre = new LinkedList.Node(-1);
        LinkedList.Node cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 == null) ? 0 : l1.data;
            int y = (l2 == null) ? 0 : l2.data;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new LinkedList.Node(sum);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new LinkedList.Node(carry);
        }
        return pre.next;
    }
}
