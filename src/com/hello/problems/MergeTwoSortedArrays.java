package com.hello.problems;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,0,0,0,0};
        int[] arr2 = {2,4,6,8};

        if(arr1[0] > arr2[0]) {
            int temp = arr1[0];
            arr1[0] = arr2[0];
            arr2[0] = temp;
        }

        for(int i = 1, j = 0; i < arr1.length; i++, j++){
            if(j < arr2.length - 1 && arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
        }

        for(int k = 0; k < arr2.length - 1; k++){
            int index = arr1.length - arr2.length - k;
            arr1[index] = arr2[k];
        }

        for(int x : arr1) {
            System.out.println(x + " ");
        }
    }
}
