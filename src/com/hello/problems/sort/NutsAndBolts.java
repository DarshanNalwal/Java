package com.hello.problems.sort;

import java.util.Arrays;
import java.util.Random;

public class NutsAndBolts {

    public static void main(String[] args) {

        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};

        matchNutsAndBolts(nuts,bolts,0,nuts.length-1);

        System.out.println(Arrays.toString(nuts));
        System.out.println(Arrays.toString(bolts));
    }



    //reference for random generation
    private static void swapRandomElement(int[] arr, int low, int high) {

        Random random = new Random();
        int pivot = random.nextInt(high - low) + low;

        int temp = arr[high];
        arr[high] = arr[pivot];
        arr[pivot] = temp;
    }


    private static void matchNutsAndBolts(char[] nuts, char[] bolts, int start, int end) {

        if(start < end){
            int pivot = partition(nuts,start,end,bolts[end]);
            partition(bolts,start,end,nuts[pivot]);

            matchNutsAndBolts(nuts,bolts,start,pivot-1);
            matchNutsAndBolts(nuts,bolts,pivot+1,end);
        }
    }

    private static int partition(char[] arr, int start, int end, char pivot) {

        int i = start;

        for(int j=start;j<end;j++){

            if(arr[j]<pivot){
                //swap a[i] and a[j]
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }else if(arr[j]==pivot){
                //swap jth elem with end
                char temp = arr[j];
                arr[j] = arr[end];
                arr[end] = temp;
                j--;
            }
        }

        //swap ith element with end
        char temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
