package com.ning.collection;

public class MyLinkedList {
    //    private Node first;
//    private Node last;
//    private int size;
//
////    public void add(Object ele) {
////        Node node = new Node(ele);
////        if(first == null) {
////            first = node;
////            last = node;
////        }
////        node.previous = last;
////        node.next = null;
////        last.next = node;
////        last = node;
////
////        size++;
////
////    }
//public void add(Object object) {
//    Node node = new Node(object);
//    if (first == null) {
//        first = node;
//        last = node;
//    }
//    node.previous = last;
//    last.next = node;
//    node.next = null;
//    last = node;
//    size++;
//}
//    public void add(int index,Object val) {
//        checkIndex(index);
////        Node node = new Node(val);
////        Node tmp = getNode(index);
////        if(tmp != null) {
////            if(index == 0) {
////                node.next = tmp;
////                tmp.previous = node;
////                node.previous = null;
////                first = node;
////            }
////            if(index == size) {
////                add(val);
////            }
////            if(index > 0 || index < size) {
////                Node up = tmp.previous;
////                Node down = tmp.next;
////                node.next = down;
////                down.previous = node;
////                up.next = node;
////                node.previous = up;
////            }
////        }
////        size++;
//        Node newNode = new Node(val);
//        Node temp = getNode(index);
//        if (temp != null) {
//            if (index == 0 ) {
//                //第一个节点
//                newNode.next = temp;
//                temp.previous = newNode;
//                newNode.previous = null;
//                first = newNode;
//                size++;
//            }
//            if (index == size  ) {
//                //最后一个节点
//                newNode.previous = temp;
//                temp.next = newNode;
//                newNode.next = null;
//                last = newNode;
//                size++;
//            }
//            if (index> 0 && index < size) {
//                Node up = temp.previous;
//                Node down = temp.next;
//
//                up.next = newNode;
//                newNode.previous = up;
//
//
//                newNode.next = temp;
//                temp.previous = newNode;
//                size++;
//            }
//        }
//    }
//    public void remove(int index) {
//        checkIndex(index);
//        Node tmp = getNode(index);
//        if(tmp != null) {
//            Node up = tmp.previous;
//            Node down = tmp.next;
//            if(up != null) {
//                up.next = down;
//            }
//            if(down != null) {
//                down.previous = up;
//            }
//            if(index == 0) {
//                first = down;
//            }
//            if(index == size-1) {
//                last = up;
//            }
//        }
//        size--;
//    }
//    public Object get(int index) {
//        checkIndex(index);
//        Node tmp = getNode(index);
//        return tmp != null ?  tmp.val : null;
//    }
//    public Node getNode(int index) {
//        checkIndex(index);
//        //9 5 2 7 8 6
//        Node tmp = first;
//        for(int i = 0;i < index;i++) {
//            tmp = tmp.next;
//        }
//        return tmp;
//    }
//    public void checkIndex(int index) {
//        if(index < 0 || index > size) {
//            throw new RuntimeException("不合法错误");
//        }
//    }
//    public void tostring() {
//        Node tmp = first;
//        while(tmp != null) {
//            System.out.print(tmp.val+" ");
//            tmp = tmp.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList();
//        list.add("z");
//        list.add("x");
//        list.add("c");
//        list.add("v");
//        list.add("b");
////        System.out.println(list.size);
////        list.tostring();
////        System.out.println();
////        list.add(4,"66");
////        list.tostring();
//        System.out.println(list.size);
//        list.tostring();
//        System.out.println();
//        System.out.println(list.get(0));
//        list.add(4,1);
//        list.tostring();
//    }
    private Node first;
    private Node last;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public void add(Object ele) {
        Node newNode = new Node(ele);
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        last.next = newNode;
        newNode.previous = last;
        newNode.next = null;
        last = newNode;
        size++;
    }

    public Object get(int index) {
        checkIndex(index);
        return getNode(index).val;
    }

    public Node getNode(int index) {
        checkIndex(index);
        Node tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public void add(int index, Object val) {
        checkIndex(index);
        Node tmp = getNode(index);
        Node newNode = new Node(val);
        if (tmp != null) {
            if (index == 0) {
                newNode.next = tmp;
                tmp.previous = newNode;
                newNode.previous = null;
                first = newNode;
            }
            if (index == size) {
                //最后一个节点
                newNode.previous = tmp;
                tmp.next = newNode;
                newNode.next = null;
                last = newNode;
            }
            if (index > 0 && index < size) {
                Node up = tmp.previous;
                Node down = tmp.next;

                up.next = newNode;
                newNode.previous = up;


                newNode.next = tmp;
                tmp.previous = newNode;
            }
        }
        size++;
    }

    public void remove(int index) {
        checkIndex(index);
        Node tmp = getNode(index);
        if (tmp != null) {
            Node up = tmp.previous;
            Node down = tmp.next;
            if (index == 0) {
                first = down;
            }
            if (index == size - 1) {
                last = up;
            }
            if (index > 0 && index < size - 1) {
                up.next = down;
                down.previous = up;
            }
        }
        size--;
    }

    public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("不合法");
        }
    }

    public void tostring() {
        Node tmp = first;
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("z");
        list.add("x");
        list.add("c");
        list.add("v");
        list.add("b");
        list.tostring();
        list.add(5, 15);
        list.tostring();
    }
}
