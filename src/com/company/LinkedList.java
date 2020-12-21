package com.company;

/**
 * @author Wallace
 */
public class LinkedList {
    /**
     * Head node of the list
     */
    public Node head;

    /**
     * Node of linked list
     */
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * Add new node to the head
     * @param node new node
     */
    public void addToHead(Node node) {
        if(head == null) {
            head = node;
            return;
        }
        //add new node to the head
        node.next = head;
        head = node;
    }

    /**
     * Add new node to the tail of current linked list
     * @param node new node
     **/
    public void addToTail(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        // find the tail node
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        // add new node to the tail
        tail.next = node;
    }

    /**
     * Print current linked list
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * Merge 2 sorted list
     * @param l1 linked list 1
     * @param l2 linked list 2
     * @return node
     */
    public static Node sortedMerge(Node l1, Node l2) {
        // if all equals null, return null.
        if (l1 == null && l2 == null) {
            return null;
        }

        Node dummyHead = new Node(-1);
        Node cur = dummyHead;
        while (l1 != null && l2 != null) {
            if(l1.data <= l2.data) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        // l1 or l2 has nodes that have greater val than the sorted list, put them to the tail.
        cur.next = (l1 == null) ? l2 : l1;
        return dummyHead.next;
    }

    /**
     * Reverse linked list
     * @param head linked list
     * @return return linked list
     */
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
