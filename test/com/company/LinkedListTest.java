package com.company;

import org.junit.jupiter.api.*;

class LinkedListTest {
    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        System.out.println("@BeforeClass");
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("Test begins");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("Test ends");
    }

    @Test
    void testSortedMerge() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        l1.addToTail(new LinkedList.Node(-1));
        l1.addToTail(new LinkedList.Node(0));
        l1.addToTail(new LinkedList.Node(1));
        l2.addToTail(new LinkedList.Node(2));
        l2.addToTail(new LinkedList.Node(4));
        l2.addToTail(new LinkedList.Node(7));

        mergedList.head = LinkedList.sortedMerge(l1.head,l2.head);
        mergedList.printList();
    }

    @Test
    void testSortedMergeAllEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        mergedList.head = LinkedList.sortedMerge(l1.head,l2.head);
        mergedList.printList();
    }

    @Test
    void testSortedMergeOneEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        l1.addToTail(new LinkedList.Node(-1));
        l1.addToTail(new LinkedList.Node(9));

        mergedList.head = LinkedList.sortedMerge(l1.head, l2.head);
        mergedList.printList();

    }

    @Test
    void testReverse() {
    }
}