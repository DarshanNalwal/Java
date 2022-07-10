package com.hello.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {2,6,3,6,9,3,2,8,54,267,3,4};
//        insertionSort(a);
        insertionSortRec(a);
        System.out.println(Arrays.toString(a));

    }

    private static void insertionSortRec(int[] a) {

        if(a.length == 1) {
            return;
        }

        for(int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;

            while (j>=0 && a[j] > current) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = current;
        }

    }

    private static void insertionSort(int[] a) {

        if(a.length == 1) {
            return;
        }

        for(int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;

            while (j>=0 && a[j] > current) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = current;
        }
    }
}
