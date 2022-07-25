package com.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {
    public static void main(String[] args) {
        List<Integer> a = Stream.of(1,4,3,2).collect(Collectors.toList());
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int[] arr1 = new int[arr.length/3];
        System.out.println(findRepeatedNumber(arr));
//        sortArray(arr);

//        sortArray(a);

//        String repeated = "hfhf";
//        System.out.println(repeated.matches(".*([A-z])\\1\\1*.*"));

//        System.out.println(reverseArray(a));

//        Scanner in = new Scanner(System.in);
//        int n = Integer.parseInt(in.next());
//        int q = Integer.parseInt(in.next());
//        List<Integer> l1;
//        List<List<Integer>> queries = new ArrayList<>(n);
//        for(int i = 0; i < q; i++) {
//            l1 = new ArrayList<>(n);
//            l1.add(Integer.parseInt(in.next()));
//            l1.add(Integer.parseInt(in.next()));
//            l1.add(Integer.parseInt(in.next()));
//            queries.add(l1);
//        }
//
//        l1 = dynamicArray(n, queries);
//        for(Integer ans : l1){
////            System.out.println(ans);
//        }

//        fun(4);
//        reverseInteger(-12345);
//        System.out.println(numberOfWays(6));
    }

    public static void merge(int[] arr, int[] arr1, int k){
        int j = 0;
        int val = 0;
        for(int i = 0; i < arr.length; i++){
            val *= 10;
            val += arr[i];
            if((i+1)%k == 0){
                arr1[j++] = val;
                val = 0;
            }
        }
        for(int x : arr1){
            System.out.println(x);
        }
    }

    public static int findRepeatedNumber(int[] arr){
        for(int i =0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    private static void sortArray(int[] a) {
//      0, 1, 2, 2, 1, 0, 0, 2, 1, 1, 2, 0
//        0,0,0,0,1,1,1,1,2,2,2,2
        int[] b = new int[a.length];
        int back = a.length-1;
        int count = 0;
        for(int index = 0; index < a.length; index++){
            switch (a[index]) {
                case 1: {
                    count++;
                    break;
                }
                case 2:{
                    b[back--] = a[index];
                    break;
                }
            }
        }
        for(int index = back - count + 1; index <= back; index++){
            b[index] = 1;
        }
        System.out.println(Arrays.toString(b));

    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        Integer lastAnswer = 0;
        List<Integer> listInteger;
        List<List<Integer>> arr = new ArrayList<>(n);

        for(int i = 0; i < n; i++) {
            listInteger = new ArrayList<>(n);
            arr.add(listInteger);
        }

        List<Integer> answers = new ArrayList<>(n);
        for(List<Integer> query : queries) {
            if(query.size() == 3) {
                switch (query.get(0)) {
                    case 1 : {
                        int idx = ((query.get(1)^lastAnswer)%n);
                        arr.get(idx).add(query.get(2));
                        break;
                    }
                    case 2 : {
                        int idx = ((query.get(1)^lastAnswer)%n);
                        int idy = query.get(2) % arr.get(idx).size();
                        lastAnswer = arr.get(idx).get(idy);
                        answers.add(lastAnswer);
                        break;
                    }
                    default:{
                        break;
                    }

                }
            }

        }
        return answers;
    }



    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        for(int i = 0; i < a.size() / 2; i++){
            Integer temp = a.remove(a.size() - 1 - i);
            a.add(a.size() - 1 - i,a.remove(i));
            a.add(i, temp);
            System.out.println(a);
        }
        return a;
    }

    static void reverseInteger(int n) {
        // Write your code here
        if(n == 0) {
            return;
        }
        int res = ((n%10));
        if(res != 0) {
            System.out.print(res);
        }
        reverseInteger(n/10);
    }
    public static int atoi(String s, int length) {
        //Add code here
        if(length <= 0)
            return 0;
        if(!s.matches("^[0-9]*$"))
            return -1;

        return (int) (Integer.parseInt(String.valueOf(s.charAt(length - 1))) * Math.pow(10, length - 1) + atoi(s.substring(1),length-1));
    }

    public static String removeAdjacent(String str) {
        //Write your code here
        if(str.length() <= 1){
            return str;
        }
        if(str.length() >= 2) {
            if(!(str.charAt(0) == str.charAt(1))){
                return str.substring(0,1) + removeAdjacent(str.substring(1,str.length()));
            } else if(str.length() > 2){
                return removeAdjacent(str.substring(2,str.length()));
            }
        }
        return "";
    }

}