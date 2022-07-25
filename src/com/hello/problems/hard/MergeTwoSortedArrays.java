package com.hello.problems.hard;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0, j = 0, k =0;

        while ( i < nums1.length - 1 && j < nums2.length) {

        }

        int medianIndex = 0;
        boolean isOddLength = false;
        medianIndex = (nums1.length + nums2.length - 1) / 2;

        if((nums1.length + nums2.length - 2) %2 == 0) {
            isOddLength = true;
        }

        if(isOddLength){
            if(medianIndex > (nums1.length - 1)){
                return (nums2[medianIndex - nums1.length - 1]+nums2[medianIndex - nums1.length])/2.0f;
            } else if(medianIndex + 1 <= nums1.length - 1) {
                return (nums1[medianIndex]+nums1[medianIndex+1])/2.0f;
            } else {
                return (nums1[medianIndex]+nums2[medianIndex - nums1.length])/2.0f;
            }

        } else {
            if(medianIndex > (nums1.length - 1))
                return (nums2[medianIndex - nums1.length - 1]);
            else
                return (nums1[medianIndex]);
        }
    }
}
