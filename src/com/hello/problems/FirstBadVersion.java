package com.hello.problems;

public class FirstBadVersion {

    public static void main(String[] args) {
        int n = 100;
        System.out.println(firstBadVersion(n));
    }

    //Leetcode 278
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = start + (end - start)/2;

        while(start!=end) {
            if(isBadVersion(mid)){
                end = mid;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return mid;

    }

    private static boolean isBadVersion(int mid) {
        if(mid >= 27) {
            return true;
        }
        return false;
    }
}
