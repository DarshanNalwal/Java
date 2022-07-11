package com.hello.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {2,6,3,6,9,3,2,8,54,267,3,4};

        quicksort(a, 0, a.length - 1);

        for (int i: a){
            System.out.println(i + " ");
        }
    }

    private static void quicksort(int[] a, int low, int high) {

        if(low < high) {

            // find pivot
            int pivot = partition(a, low, high);

            //left part recursive call
            quicksort(a, low, pivot-1);

            //right part recursive call
            quicksort(a, pivot+1, high);
        }


    }

    private static int partition(int[] a, int low, int high) {

        //choose right most element as pivot
        int pivot = a[high];

        //pointer for placing elements
        int i = low-1;

        //traverse through entire array
        for(int j = low; j<high; j++){

            //compare your pivot element with each element of an array
            if(a[j] <= pivot){

                //increment by 1
                i++;

                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }

        //swap pivot with i+1
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        //return pivot element index
        return i+1;
    }
}
