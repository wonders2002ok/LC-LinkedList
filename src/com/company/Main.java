/**
 * FileName: LinkedList
 * Author:   Wallace
 * Date:     2020/12/21 09:52
 * Description: LinkedList Template
 * History:
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        l1.addToTail(new LinkedList.Node(-1));
        l1.addToTail(new LinkedList.Node(0));
        l1.addToTail(new LinkedList.Node(3));
        l2.addToTail(new LinkedList.Node(0));
        l2.addToTail(new LinkedList.Node(1));
        l2.addToTail(new LinkedList.Node(5));

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