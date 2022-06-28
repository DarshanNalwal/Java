package com.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {
    public static void main(String[] args) {
        List<Integer> a = Stream.of(1,4,3,2).collect(Collectors.toList());
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
        reverseInteger(-12345);

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
}