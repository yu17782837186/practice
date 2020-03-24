package com.ning.collection;

public class MyHashMap {
//    Node2[] table;
//    int size;
//
//    public MyHashMap() {
//        table = new Node2[16];
//    }
//    public Object get(Object key) {
//        int hash = myHash(key.hashCode(),table.length);
//        Object value = null;
//        if(table[hash] != null) {
//            Node2 tmp = table[hash];
//            while(tmp != null) {
//                if(tmp.key.equals(key)) {
//                    value = tmp.value;
//                    break;
//                }else {
//                    tmp = tmp.next;
//                }
//            }
//        }
//        return value;
//    }
//    public void put(Object key,Object value) {
//        Node2 newNode = new Node2();
//
//        newNode.hash = myHash(key.hashCode(),table.length);
//        newNode.key = key;
//        newNode.value = value;
//
//        Node2 tmp = table[newNode.hash];
//
//        Node2 last = null;
//
//        boolean isRepat = false;
//
//        if(tmp == null) {
//            table[newNode.hash] = newNode;
//            size++;
//        }else {
//            while(tmp != null) {
//                if(tmp.key.equals(key)) {
//                    isRepat = true;
//                    tmp.value = value;
//                    break;
//                }else {
//                    last = tmp;
//                    tmp = tmp.next;
//                }
//            }
//            if(!isRepat) {
//                last.next = newNode;
//                size++;
//            }
//        }
//    }
//    public int myHash(int v,int length) {
//        return v&(length-1);
//    }
//    public void tostring() {
//        for(int i = 0;i < table.length;i++) {
//            Node2 tmp = table[i];
//            while(tmp != null) {
//                System.out.print(tmp.value+" ");
//                tmp = tmp.next;
//            }
//        }
//        System.out.println();
//    }
    Node2[] table;
    int size;
    public MyHashMap() {
        table = new Node2[16];
    }
    public void put(Object key,Object value) {
        Node2 newNode = new Node2();
        newNode.key = key;
        newNode.value = value;
        int hash = myhash(key.hashCode(),table.length);
        Node2 tmp = table[hash];
        Node2 last = null;
        boolean isRepat = false;
        if(tmp == null) {
            table[hash] = newNode;
            size++;
        }else {
            while(tmp != null) {
                if(tmp.key.equals(key)) {
                    isRepat = true;
                    tmp.value = value;
                    break;
                }else {
                    last = tmp;
                    tmp = tmp.next;
                }
            }
            if(!isRepat) {
                last.next = newNode;
                size++;
            }
        }
    }
    public Object get(Object key) {
        int hash = myhash(key.hashCode(),table.length);
        Object val = null;
        if(table[hash] != null) {
            Node2 tmp = table[hash];
            while(tmp != null) {
                if(tmp.key.equals(key)) {
                    val = tmp.value;
                    break;
                }else {
                    tmp = tmp.next;
                }
            }
        }
        return val;
    }
    public void tostring() {
        for(int i = 0;i < table.length;i++) {
            Node2 tmp = table[i];
            while(tmp != null) {
                System.out.print(tmp.value+" ");
                tmp = tmp.next;
            }
        }
        System.out.println();
    }
    public int myhash(int key,int length) {
        return key&(length-1);
    }
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,"小红");
        map.put(2,"小黑");
        map.put(3,"小人");
        map.put(3,"小亮");
        map.tostring();
        System.out.println(map.get(1));
    }
}
