package com.hello;

public class upGradHomeWork {

    public static void main(String[] args) {
//        Arrays : segregate even and odd, 1 and 0, negative and positive, alternate positive and negative
//        n Dimensional Arrays : 1  2   3
//                             : 4  5   6
//                             : 7  8   9
//        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};
//        int k = 1;
//        for(int i= 0; i < arr.length; i += k) {
//            int count = 0;
//            while(count <= k &&  i+k < arr.length - 1) {
//                System.out.print(arr[i+count]);
//                count++;
//            }
//            System.out.println();
//        }

        int[] arr = {1,2,1,4,2,6,7,8,9};
//        System.out.println(probelm(arr));
        int[] arr2 = {1,2,4,5,7,9,12,14,18, 20};
//        System.out.println(findElement(arr2, 18));
        System.out.println(fun(3));
    }

    static int probelm(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=0;j<arr.length;j++){

                if(flag && i!=j && arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return arr[i];
            }
        }
        return 0;
    }

    static int findElement(int[] arr, int target) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while(leftIndex <= rightIndex){
            int mid = (leftIndex + rightIndex) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid - 1;
            }
        }
        return -1;
    }

    public static int fun(int n){
        if(n==0){
            return 3;
        }
        return 2*fun(n-1)+ (int) Math.pow(n,2);
    }
}
