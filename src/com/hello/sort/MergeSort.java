package com.hello.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {2,6,3,6,9,3,2,8,54,267,3,4};

        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    private static void mergeSort(int[] a, int startIndex, int endIndex) {

        if(startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex -startIndex)/2;
        mergeSort(a,startIndex,mid);
        mergeSort(a,mid+1,endIndex);

        merge(a, startIndex, endIndex, mid);
    }

    private static void merge(int[] a, int startIndex, int endIndex, int mid) {

        int[] merged = new int[endIndex - startIndex + 1];

        int index1 = startIndex;
        int index2 = mid + 1;
        int mergedIndex = 0;

        while (index1 <= mid && index2 <= endIndex){
            if(a[index1] <= a[index2]) {
                merged[mergedIndex++] = a[index1++];

            } else {
                merged[mergedIndex++] = a[index2++];
            }
        }

        while (index1 <= mid) {
            merged[mergedIndex++] = a[index1++];
        }

        while (index2 <= endIndex) {
            merged[mergedIndex++] = a[index2++];
        }

        for(int i = 0, j = startIndex; i < merged.length; i++, j++) {
            a[j] = merged[i];
        }

    }
}
