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
    Node testSortedMerge() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        l1.addToLast(new Node(-1));
        l1.addToLast(new Node(0));
        l1.addToLast(new Node(3));
        l2.addToLast(new Node(0));
        l2.addToLast(new Node(1));
        l2.addToLast(new Node(5));

        mergedList.head = LinkedList.sortedMerge(l1.head,l2.head);
        return mergedList.head;
    }

    @Test
    Node testSortedMergeAllEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        mergedList.head = LinkedList.sortedMerge(l1.head,l2.head);
        return mergedList.head;
    }

    @Test
    Node testSortedMergeOneEmpty() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList mergedList = new LinkedList();

        l1.addToLast(new Node(-1));
        l1.addToLast(new Node(0));

        mergedList.head = LinkedList.sortedMerge(l1.head, l2.head);
        return mergedList.head;

    }

    @Test
    void testReverse() {
    }
}