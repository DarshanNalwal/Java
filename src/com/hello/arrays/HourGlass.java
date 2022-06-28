package com.hello.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourGlass {
    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> a2 = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> a3 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> a4 = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> a5 = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> a6 = Arrays.asList(0, 0, 1, 2, 4, 0);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        arr.add(a5);
        arr.add(a6);

        System.out.println(hourGlassSum(arr));
    }

    static int hourGlassSum(List<List<Integer>> arr) {
        int iteration = (arr.size() / 2);
        int fr = 0, fc = 0;
        int br = arr.size() - 1, bc = arr.size() - 1;
        int currDir = 0;
        int[][] resultArr = new int[iteration+1][iteration+1];
        int sum = 0;
        while(fr <= br && fc <= bc - iteration+1 ){
            switch(currDir) {
                case 0: {
                    for(int row = fr + currDir, col = fc; col < fc + iteration; col++){
                        sum+=arr.get(row).get(col);
                    }
//                    fr++;
                    currDir = (currDir + 1) % 3;
                    break;
                }
                case 1: {
                    sum+=arr.get(fr+currDir).get(fc+1);
//                    fr++;
                    currDir = (currDir + 1) % 3;
                    break;
                }
                case 2: {
                    for(int row = fr+currDir, col = fc; col < fc + iteration; col++){
                        sum+=arr.get(row).get(col);

                    }
                    resultArr[fr][fc] = sum;
                    sum = 0;
                    fr++;
                    if(fr > (br - iteration + 1)) {
                        fr = 0;
                        fc++;
                    }
                    currDir = (currDir + 1) % 3;
                    break;
                }
            }

        }

        int maxValue = resultArr[0][0];
        for(int i = 0; i < resultArr.length; i++){
            for(int j = 0; j < resultArr.length; j++) {
                if(maxValue < resultArr[i][j]) {
                    maxValue = resultArr[i][j];
                }
            }
        }
        return maxValue;
    }
}
