package com.company;

import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        l1.addToLast(new Node(-1));
        l1.addToLast(new Node(0));
        l1.addToLast(new Node(3));
        l2.addToLast(new Node(0));
        l2.addToLast(new Node(1));
        l2.addToLast(new Node(5));

        System.out.print("LinkedList 1 is ");
        l1.printList();

        System.out.print("LinkedList 2 is ");
        l2.printList();

        mergedList.head = LinkedList.sortedMerge(l1.head, l2.head);
        System.out.print("Merged List is ");
        mergedList.printList();

        mergedList.head = LinkedList.reverse(mergedList.head);
        System.out.print("Reversed Merge List is ");
        mergedList.printList();
    }
}