package com.hello.arrays;

import java.util.Arrays;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}
        };

        spiralTraverse(arr);
    }

    static void spiralTraverse(int[][] arr){
        int currDir = 0;
        int fr = 0, fc = 0; int br = arr.length - 1, bc = arr[0].length - 1;
        int[] a = new int[arr.length * arr[0].length];
        int k = 0;
        while(fc <= bc && fr <= br) {
            switch(currDir){
                case 0 : {
                    for(int row = fr, col = fc; col <= bc; col++) {
                        System.out.print(arr[row][col]+" ");
                        a[k++] = arr[row][col];
                    }
                    fr++;
                    currDir = (currDir + 1) % 4;
                    break;
                }
                case 1: {
                    for(int row = fr, col = bc; row <= br; row++){
                        System.out.print(arr[row][col]+" ");
                        a[k++] = arr[row][col];
                    }
                    bc--;
                    currDir = (currDir + 1) % 4;
                    break;
                } case 2: {
                    for(int row = br, col = bc; col >= fc; col--){
                        System.out.print(arr[row][col]+" ");
                        a[k++] = arr[row][col];
                    }
                    br--;
                    currDir = (currDir + 1) % 4;
                    break;
                }
                case 3: {
                    for(int row = br, col = fc; row >= fr; row--){
                        System.out.print(arr[row][col]+" ");
                        a[k++] = arr[row][col];
                    }
                    fc++;
                    currDir = (currDir + 1) % 4;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(a));

    }
}
