package com.company;

public class Main {

    public static void main(String[] args) {
        MergeLists l1 = new MergeLists();
        MergeLists l2 = new MergeLists();
        MergeLists mergedList = new MergeLists();

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

        mergedList.head = MergeLists.sortedMerge(l1.head, l2.head);
        System.out.print("Merged List is ");
        mergedList.printList();

    }
}