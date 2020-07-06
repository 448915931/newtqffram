package com.tqfframe.test;

import java.util.regex.Pattern;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/6 0006 9:18
 * @Version 1.0
 */
public class TestA {
    public static void main(String[] args) {

        System.out.println( Pattern.matches("[0-9]*", "1837asda8082631"));


        int arr[]={3,9,6,1,5,7,4,2,8};
        int len = arr.length;
        int[] result = new int[len];
        merge_sort_recursive(arr, result, 0, len - 1);
        for(int info:arr){
            System.out.println(info);
        }

    }
    // 归并排序（Java-递归版）
    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++]; //对每一轮左边比右边大的，把右边赋值给新的数组左边
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)          //把排好序的result赋值给arr
            arr[k] = result[k];
    }

}
