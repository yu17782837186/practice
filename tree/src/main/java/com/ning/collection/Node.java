package com.ning.collection;

public class Node {
//    Node previous;
//    Node next;
//    Object val;
//
//    public Node(Node previous, Node next, Object val) {
//        this.previous = previous;
//        this.next = next;
//        this.val = val;
//    }
//
//    public Node(Object val) {
//        this.val = val;
//    }
    Node previous;
    Node next;
    Object val;

    public Node(Object val) {
        this.val = val;
    }

    public Node(Node previous, Node next, Object val) {
        this.previous = previous;
        this.next = next;
        this.val = val;
    }
}
