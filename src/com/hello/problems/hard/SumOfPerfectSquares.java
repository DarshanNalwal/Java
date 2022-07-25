package com.hello.problems.hard;

public class SumOfPerfectSquares {

    public static void main(String[] args) {
        System.out.println(f(5));
    }

    private static int f(int n) {

        int a[] = new int[n+1];
        a[0] = 0;
        a[1] = 1;

        for(int i=2;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int rem = i - j*j;
                if(a[rem] < min)
                    min = a[rem];
            }
            a[i] = min+1;
        }

        for(int x:a){
            System.out.print(x+" ");
        }

        return a[n];
    }
}
