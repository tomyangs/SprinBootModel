package com.tomyang.utils;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);
    }
    public static void main(String[] args){
        int[] data = {23,123,12,424,42,232,12,32,1,2,23,123,123,34,23,4,454,56,34,23,5456,56,34,23,34,23,5,6523,23,53,2,3};
        quickSort(data,0,data.length-1);
        for (int i =0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
