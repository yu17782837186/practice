package com.ning.collection;


public class MyArrayList<E> {
//    private Object[] elementDate;
//    private int size;
//    private static final int DEFAULT_CAPACITY = 10;
//    public MyArrayList() {
//        elementDate = new Object[DEFAULT_CAPACITY];
//    }
//
//    public MyArrayList(int capacity) {
//        if(capacity < 0) {
//            throw new RuntimeException("不能为负数");
//        }else if(capacity == 0){
//            elementDate = new Object[DEFAULT_CAPACITY];
//        }else {
//            elementDate = new Object[capacity];
//        }
//    }
//    public int size() {
//        return size;
//    }
//    public boolean isEmpty() {
//        return size == 0 ? true : false;
//    }
//    public void add(Object element) {
//        if(size == elementDate.length) {
//            Object[] newArr = new Object[elementDate.length+elementDate.length>>1];
//            System.arraycopy(elementDate,0,newArr,0,elementDate.length);
//            elementDate = newArr;
//        }
//        elementDate[size++] = element;
//    }
//
//    public Object get(int index) {
//        checkIndex(index);
//        return elementDate[index];
//    }
//    public void checkIndex(int index) {
//        if(index < 0 || index > size-1) {
//            throw new RuntimeException("下标位置不合法");
//        }
//    }
//    public void set(int index,Object ele) {
//        checkIndex(index);
//        elementDate[index] = ele;
//    }
//    public void remove(Object ele) {
//        for(int i = 0;i < size;i++) {
//            if(ele.equals(get(i))) {
//                remove(i);
//            }
//        }
//    }
//    public void remove(int index) {
//        int number = elementDate.length-index-1;
//        if(number > 0) {
//            System.arraycopy(elementDate,index+1,elementDate,index,number);
//        }
//        elementDate[--size] = null;
//    }
//    public void tostring() {
//       for(int i = 0;i < size;i++) {
//           System.out.print(elementDate[i]+" ");
//       }
//    }
    private Object[] elementDate;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public MyArrayList() {
        elementDate = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity) {
        if(capacity < 0 ) {
            throw new RuntimeException("下标不能为负数");
        }else if(capacity == 0) {
            elementDate = new Object[DEFAULT_CAPACITY];
        }else {
            elementDate = new Object[capacity];
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }
    public void add(E ele) {
        if(elementDate.length == size) {
            Object[] newArr = new Object[elementDate.length+(elementDate.length >>1)];
            System.arraycopy(elementDate,0,newArr,0,elementDate.length);
            elementDate = newArr;
        }
        elementDate[size++] = ele;
    }
    public E get(int index) {
        checkIndex(index);
        return (E)elementDate[index];
    }
    public void set(int index,Object val) {
        checkIndex(index);
        elementDate[index] = val;
    }
    public void remove(E ele) {
        for(int i = 0;i < size;i++) {
            if(ele.equals(get(i))) {
                remove(i);
            }
        }
    }
    public void remove(int index) {
        int number = elementDate.length-index-1;
        if(number > 0) {
            System.arraycopy(elementDate,index+1,elementDate,index,number);
        }
        elementDate[--size] = null;
    }
    public void checkIndex(int index) {
        if(index < 0 || index > elementDate.length-1) {
            throw new RuntimeException("不合法异常");
        }
    }
    public void tostring() {
        for(int i = 0;i < size;i++) {
            System.out.print(elementDate[i]+" ");
        }
    }
    public static void main(String[] args) {
        MyArrayList<Object> list = new MyArrayList<>();
        list.add(12);
        list.add(121);
        list.add(128);
        list.add("126");
        list.tostring();
//        System.out.println();
//        System.out.println(list.get(0));
//        list.set(3,66);
//        list.tostring();
        System.out.println();
        list.remove("126");
        list.tostring();
    }
}
