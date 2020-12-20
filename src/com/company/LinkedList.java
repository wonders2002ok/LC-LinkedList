package com.company;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

/**
 * @author wanghaiming
 */
public class LinkedList {
    Node head;

    public void addToLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node sortedMerge(Node headA, Node headB) {
        //Deal with case that both headA and headB == null
        if (headA == null && headB == null) {
            return null;
        }

        Node dummyhead = new Node(0);
        Node cur = dummyhead;

        if (headA == null) {
            cur.next = headB;
        }
        if (headB == null) {
            cur.next = headA;
        }

        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                cur.next = headA;
                headA = headA.next;
            }
            else {
                cur.next = headB;
                headB = headB.next;
            }
            cur = cur.next;
        }
        return dummyhead.next;
    }

    public static Node reverse(Node head) {
        //Deal with empty list
        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = null;
        Node cur = head;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = dummy;
            dummy = cur;
            cur = temp;
        }
        return dummy;
    }
}
