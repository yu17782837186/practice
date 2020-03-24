package com.ning;

public class Node {
//    private int data;
//    private Node leftChild;
//    private Node rightChild;
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public Node getLeftChild() {
//        return leftChild;
//    }
//
//    public void setLeftChild(Node leftChild) {
//        this.leftChild = leftChild;
//    }
//
//    public Node getRightChild() {
//        return rightChild;
//    }
//
//    public void setRightChild(Node rightChild) {
//        this.rightChild = rightChild;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Node{" +
//                "data=" + data +
//                ", leftChild=" + leftChild +
//                ", rightChild=" + rightChild +
//                '}';
//    }
//
//    public Node(int data, Node leftChild, Node rightChild) {
//        this.data = data;
//        this.leftChild = leftChild;
//        this.rightChild = rightChild;
//    }
   private int dada;
   private Node leftChild;
   private Node rightChild;

    public Node() {
    }

    public Node(int dada, Node leftChild, Node rightChild) {
        this.dada = dada;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getDada() {
        return dada;
    }

    public void setDada(int dada) {
        this.dada = dada;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "dada=" + dada +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
