package com.ning.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Sort {
//    @Test
//    public void paopao() {
//        int[] arr = {9,5,2,7,6,445,32,115,15,66,0};
//        int tmp = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flag = true;
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j+1]) {
//                    tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

//    public static void main(String[] args) {
//        Sort sort = new Sort();
//        System.out.println(sort.binary());
//
//    }
//    public int binary() {
//        int[] arr = {9,5,2,7,6,445,32,115,15,66,0};
//        Arrays.sort(arr);
//        int val = 15;
//        int low = 0;
//        int high = arr.length-1;
//        while(low <= high) {
//            int mid = (low+high)/2;
//            if (val > arr[mid]) {
//                low = mid+1;
//            }
//            if (val < arr[mid]) {
//                high = mid-1;
//            }
//            if (val == arr[mid]) {
//                return mid;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
//        int[] arr = {9,5,2,7,6,445,32,115,15,66,0};
        int[] arr = {9,5,2,7,0,8,11};
        Sort sort = new Sort();
//        sort.bina(arr);
//        System.out.println(Arrays.toString(arr));
        sort.heap(arr);
        System.out.println(Arrays.toString(arr));
    }
//    public int partation(int[] arr,int low,int high) {
//        int i = low;
//        int j = high;
//        int x = arr[low];
//        while(i < j) {
//            while(i < j && arr[j] >= x) {
//                j--;
//            }
//            if (i < j) {
//                arr[i] = arr[j];
//                i++;
//            }
//            while(i < j && arr[i] < x) {
//                i++;
//            }
//            if (i < j) {
//                arr[j] = arr[i];
//                j--;
//            }
//        }
//        arr[i] = x;
//        return i;
//    }
//    public void quick(int[] arr,int low,int high) {
//        if (low < high) {
//            int index = partation(arr, low, high);
//            quick(arr,low,index-1);
//            quick(arr,index+1,high);
//        }
//    }
//    public void quick(int[] arr) {
//        int low = 0;
//        int high = arr.length-1;
//        quick(arr,low,high);
//    }

//    public void quickByStack(int[] arr) {
//        Deque<Integer> stack = new LinkedList<>();
//        int low = 0;
//        int high = arr.length-1;
//        int index = partation(arr,low,high);
//        if (index > low+1) {
//            stack.push(low);
//            stack.push(index-1);
//        }
//        if (index < high-1) {
//            stack.push(index+1);
//            stack.push(high);
//        }
//        while(!stack.isEmpty()) {
//            high = stack.poll();
//            low = stack.poll();
//            index = partation(arr,low,high);
//            if (index > low+1) {
//                stack.push(low);
//                stack.push(index-1);
//            }
//            if (index < high-1) {
//                stack.push(index+1);
//                stack.push(high);
//            }
//        }
//    }
//    public void insert(int[] arr) {
//        int tmp = 0;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            int j = 0;
//            for (j = i-1; j >= 0 ; j--) {
//                if (arr[j] > tmp) {
//                    arr[j+1] = arr[j];
//                }else {
//                    break;
//                }
//            }
//            arr[j+1] = tmp;
//        }
//    }

    public void shell(int[] arr,int tag) {
        int tmp = 0;
        for (int i = tag; i < arr.length; i++) {
            tmp = arr[i];
            int j = 0;
            for (j = i-tag; j >= 0 ; j = j-tag) {
                if (arr[j] > tmp) {
                    arr[j+tag] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+tag] = tmp;
        }
    }
    public void shell(int[] arr) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(arr,drr[i]);
        }
    }

    public void select(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    //堆排序
    public void heap(int[] arr,int start,int end) {
        int tmp = arr[start];
        for (int i = 2*start+1; i <= end ; i= 2*i+1) {
            if (i < end && arr[i] < arr[i+1]) {
                i++;
            }
            if (arr[i] > arr[start]) {
                arr[start] = arr[i];
                start = i;
            }
            if (arr[i] < arr[start]) {
                break;
            }
        }
        arr[start] = tmp;
    }
    public void heapSort(int[] arr) {
        for (int i = (arr.length-1-1)/2; i >= 0 ; i--) {
            heap(arr,i,arr.length-1);
        }
        for (int j = 0; j < arr.length-1; j++) {
            int tmp = arr[arr.length-1-j];
            arr[arr.length-1-j] = arr[0];
            arr[0] = tmp;
            heap(arr,0,arr.length-1-1-j);
        }

    }
    public void paopao(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
    public int bina(int[] arr) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        int val = 5;
        while(low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] > val) {
                high = mid-1;
            }
            if (arr[mid] < val) {
                low = mid+1;
            }
            if (arr[mid] == val) {
                return mid;
            }
        }
        return -1;
    }
    public int par(int[] arr,int low,int high) {
        int i = low;
        int j = high;
        int x = arr[low];
        while(i < j) {
            while(i< j && arr[j] >= x) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while(i < j && arr[i] < x) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = x;
        return i;
    }
    public  void qui(int[] arr,int low,int high){
        if (low < high) {
            int index = par(arr,low,high);
            qui(arr,low,index-1);
            qui(arr,index+1,high);
        }
    }
    public  void qui(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        qui(arr,low,high);
    }
    public void ins(int[] arr) {
        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            int j = 0;
            for (j = i-1; j >= 0 ; j--) {
                if (arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
    public void she(int[] arr,int tag) {
        int tmp = 0;
        for (int i = tag; i < arr.length; i++) {
            tmp = arr[i];
            int j = 0;
            for (j = i-tag; j >= 0 ; j-=tag) {
                if (arr[j] > tmp) {
                    arr[j+tag] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+tag] = tmp;
        }
    }
    public void shel(int[] arr) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            she(arr,drr[i]);
        }
    }

    public void sel(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = 0;
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
    public void adjust(int[] arr,int start,int end) {
        int tmp =arr[start];
        for (int i = 2*start+1; i <= end ; i=i*2+1) {
            if (i < end && arr[i] < arr[i+1]) {
                i++;
            }
            if (arr[i] > tmp) {
                arr[start] = arr[i];
                start = i;
            }
            if (arr[i] < tmp) {
                break;
            }
        }
        arr[start] =tmp;
    }
    public void heap(int[] arr) {
        for (int i = (arr.length-1-1)/2; i >= 0 ; i--) {
            adjust(arr,i,arr.length-1);
        }
        for (int j = 0; j < arr.length-1; j++) {
            int tmp = arr[arr.length-1-j];
            arr[arr.length-1-j] = arr[0];
            arr[0] =tmp;
            adjust(arr,0,arr.length-1-1-j);
        }
    }
}
