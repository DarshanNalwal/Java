package com.hello.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {2,6,3,6,9,3,2,8,54,267,3,4};

        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    private static void mergeSort(int[] a, int startIndex, int endIndex) {
        // base condition
        if(startIndex >= endIndex) {
            return;
        }

        // Need to know mid to split array
        int mid = startIndex + (endIndex -startIndex)/2;

        // Recursive call on both the halves of array
        mergeSort(a,startIndex,mid);
        mergeSort(a,mid+1,endIndex);

        // Second phase of sort and update array recursively
        merge(a, startIndex, endIndex, mid);
    }

    private static void merge(int[] a, int startIndex, int endIndex, int mid) {
        // new array to hold sorted elements
        int[] merged = new int[endIndex - startIndex + 1];

        // declare variables that we will use to iterate and add elements in sorted order to new array
        int index1 = startIndex;
        int index2 = mid + 1;
        int mergedIndex = 0;

        // iterate until either halves are exhausted and add smaller element to new array
        while (index1 <= mid && index2 <= endIndex){
            if(a[index1] <= a[index2]) {
                merged[mergedIndex++] = a[index1++];

            } else {
                merged[mergedIndex++] = a[index2++];
            }
        }

        // add remaining elements to new array, if any
        while (index1 <= mid) {
            merged[mergedIndex++] = a[index1++];
        }

        while (index2 <= endIndex) {
            merged[mergedIndex++] = a[index2++];
        }

        // copy sorted elements of array to original array
        for(int i = 0, j = startIndex; i < merged.length; i++, j++) {
            a[j] = merged[i];
        }

    }
}
