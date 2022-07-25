package com.hello.problems.xor;

import java.util.Arrays;

public class EquilibriumOfArray {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2, 8};

        int ans = 0;
        for(int i : arr){
            ans = ans^i;
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {3,1,3};
        findRepeatingAndMissing(arr2, arr2.length);
    }

    public static void findRepeatingAndMissing(int[] arr, int size){
        int ans = 0;
        int sum = 0;
        int repeated = 0;
        for(int i = 0; i< arr.length; i++){
            int temp = ans;
            ans = ans^arr[i];
            if(ans < temp)
                repeated = arr[i];
            sum+=(i+1);
        }
        System.out.println("Repeating no is : ["+repeated+"]");
        System.out.println("Missing number is : ["+(sum-(ans+repeated))+"]");
        System.out.println("Missing = "+(sum-(ans+repeated))+", Repeating = "+repeated+" ");
    }
}
