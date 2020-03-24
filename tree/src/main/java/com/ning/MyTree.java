package com.ning;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
//    private Node root;
//
//    public MyTree(Node root) {
//        this.root = root;
//    }
//    public boolean isEmpty(){
//        return root == null;
//    }
//    public int size(Node root) {
//        if (root == null) {
//            return 0;
//        }else {
//            int nl = size(root.getLeftChild());
//            int nr = size(root.getRightChild());
//            return nl+nr+1;
//        }
//    }
//    private int getHight(Node root){
//        if (root == null) {
//            return 0;
//        }else {
//            int nl = getHight(root.getLeftChild());
//            int nr = getHight(root.getRightChild());
//            return nl>nr ? nl+1:nr+1;
//        }
//    }
//    public int getHeight(){
//        return getHight(root);
//    }
//    public Node findKey(int key,Node root){
//        if (root == null) {
//            return null;
//        }else if(root != null && root.getData() == key){
//            return root;
//        }else {
//            Node node1 = findKey(key,root.getLeftChild());
//            Node node2 = findKey(key,root.getRightChild());
//            if (node1 != null && node1.getData() == key) {
//                return node1;
//            }
//            if (node2 != null && node2.getData() == key) {
//                return node2;
//            }
//        }
//        return null;
//    }
//    private void pre(Node root){
//        if (root != null) {
//            System.out.print(root.getData()+"");
//            pre(root.getLeftChild());
//            pre(root.getRightChild());
//        }
//    }
//    public void pre(){
//        System.out.println("前序遍历");
//        pre(root);
//        System.out.println();
//    }
//    private void ord(Node root) {
//        if (root != null) {
//            ord(root.getLeftChild());
//            System.out.print(root.getData()+"");
//            ord(root.getRightChild());
//        }
//    }
//    public void ord() {
//        System.out.println("中序遍历：");
//        ord(root);
//        System.out.println();
//    }
//    private void in(Node root) {
//        if (root != null) {
//            in(root.getLeftChild());
//            in(root.getRightChild());
//            System.out.print(root.getData()+"");
//        }
//    }
//    public void in() {
//        System.out.println("后序遍历：");
//        in(root);
//        System.out.println();
//    }
//    //前序遍历非递归
//    public void preStack() {
//        System.out.println("前夕遍历非递归：");
//        Deque<Node> stack = new LinkedList<>();
//        Node current = root;
//        stack.push(current);
//        while(current != null && !stack.isEmpty()) {
//            current = stack.pop();
//            System.out.print(current.getData()+"");
//            if(current.getRightChild() != null) {
//                stack.push(current.getRightChild());
//            }
//            if (current.getLeftChild() != null) {
//                stack.push(current.getLeftChild());
//            }
//        }
//        System.out.println();
//    }
//    //中序遍历非递归
//    public void ordStack() {
//        System.out.println("中序遍历非递归：");
//        Deque<Node> stack = new LinkedList<>();
//        Node current = root;
//        while(current != null || !stack.isEmpty()) {
//            while(current != null) {
//                stack.push(current);
//                current = current.getLeftChild();
//            }
//            if (!stack.isEmpty()) {
//                current = stack.pop();
//                System.out.print(current.getData()+"");
//                current = current.getRightChild();
//            }
//        }
//        System.out.println();
//    }
//    //后续遍历非递归
//    public void inStack() {
//        System.out.println("后序遍历非递归：");
//        Deque<Node> stack = new LinkedList<>();
//        Deque<Node> out = new LinkedList<>();
//        Node current = root;
//        while(current != null || !stack.isEmpty()) {
//            if (current != null) {
//                stack.push(current);
//                out.push(current);
//                current = current.getRightChild();
//            }else {
//                current = stack.pop();
//                current = current.getLeftChild();
//            }
//        }
//        while(!out.isEmpty()) {
//            Node tmp = out.pop();
//            System.out.print(tmp.getData()+"");
//        }
//        System.out.println();
//    }
//    //使用队列层序遍历
//    public void queuq() {
//        System.out.println("层序遍历：");
//        if (root == null) {
//            return;
//        }
//        Queue<Node> queuq = new LinkedList<>();
//        queuq.add(root);
//        while(queuq.size() != 0) {
//            int len = queuq.size();
//            for (int i = 0;i < len;i++) {
//                Node tmp = queuq.poll();
//                System.out.print(tmp.getData()+"");
//                if (tmp.getLeftChild() != null) {
//                    queuq.add(tmp.getLeftChild());
//                }
//                if (tmp.getRightChild() != null) {
//                    queuq.add(tmp.getRightChild());
//                }
//            }
//        }
//    }
    private Node root;

    public MyTree(Node root) {
        this.root = root;
    }
    public boolean isEmpty() {
        return root == null;
    }
    private int size(Node root) {
        if (root ==null) {
            return 0;
        }else {
            int nl = size(root.getLeftChild());
            int nr = size(root.getRightChild());
            return nl+nr+1;
        }
    }
    public int size() {
        System.out.println("节点个数：");
        return size(root);
    }
    private int getHight(Node root) {
        if (root == null) {
            return 0;
        }else {
            int nl = getHight(root.getLeftChild());
            int nr= getHight(root.getRightChild());
            return nl > nr ? nl+1:nr+1;
        }
    }
    public int getHight() {
        System.out.println("返回树的高度");
        return getHight(root);
    }
    public Node findKey(int key,Node root) {
        if (root == null) {
            return null;
        }else if (root != null && root.getDada() == key) {
            return root;
        }else {
            Node node1 = root.getLeftChild();
            Node node2 = root.getRightChild();
            if (node1 != null && node1.getLeftChild() != null) {
                findKey(key,node1);
            }
            if (node2 != null && node2.getRightChild() != null) {
                findKey(key,node2);
            }
        }
        return  null;
    }
    private void pre(Node root) {
        if (root != null) {
            System.out.print(root.getDada()+"");
            pre(root.getLeftChild());
            pre(root.getRightChild());
        }
    }
    public void pre() {
        System.out.println("前序遍历：");
        pre(root);
        System.out.println();
    }
    private void ord(Node root) {
        if (root != null) {
            ord(root.getLeftChild());
            System.out.print(root.getDada()+"");
            ord(root.getRightChild());
        }
    }
    public void ord() {
        System.out.println("中序遍历：");
        ord(root);
        System.out.println();
    }
    private void in(Node root) {
        if (root != null) {
            in(root.getLeftChild());
            in(root.getRightChild());
            System.out.print(root.getDada()+"");
        }
    }
    public void in() {
        System.out.println("后序遍历：");
        in(root);
        System.out.println();
    }
    //非递归
    public void preStack() {
        System.out.println("前序遍历非递归：");
        Deque<Node> stack = new LinkedList<>();
        Node current = root;
        stack.push(current);
        while(current != null && !stack.isEmpty()) {
            current = stack.pop();
            System.out.print(current.getDada()+"");
            if (current.getRightChild() != null) {
                stack.push(current.getRightChild());
            }
            if (current.getLeftChild() != null) {
                stack.push(current.getLeftChild());
            }
        }
        System.out.println();
    }
    public void ordStack() {
        System.out.println("中序遍历非递归：");
        Deque<Node> stack = new LinkedList<>();
        Node current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.getLeftChild();
            }
            if (!stack.isEmpty()) {
                current = stack.pop();
                System.out.print(current.getDada()+"");
                current = current.getRightChild();
            }
        }
        System.out.println();
    }
    public void inStack() {
        System.out.println("后序遍历非递归：");
        Deque<Node> stack = new LinkedList<>();
        Deque<Node> out = new LinkedList<>();
        Node current = root;
        while(current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                out.push(current);
                current = current.getRightChild();
            }else {
                current = stack.pop();
                current = current.getLeftChild();
            }
        }
        while(!out.isEmpty()) {
            Node tmp = out.pop();
            System.out.print(tmp.getDada()+"");
        }
        System.out.println();
    }

    public void queue() {
        System.out.println("层序遍历：");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() != 0) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node tmp = queue.poll();
                System.out.print(tmp.getDada()+"");
                if (tmp.getLeftChild() != null) {
                    queue.add(tmp.getLeftChild());
                }
                if (tmp.getRightChild() != null) {
                    queue.add(tmp.getRightChild());
                }
            }
        }
    }
}
