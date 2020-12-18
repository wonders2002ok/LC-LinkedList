package com.company;

import com.company.Node;

public class MergeLists {
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
        Node dummyhead = new Node(0);
        Node cur = dummyhead;

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
        if (headA == null) {
            cur.next = headB;
        }
        if (headB == null) {
            cur.next = headA;
        }

        return dummyhead.next;
    }
}
