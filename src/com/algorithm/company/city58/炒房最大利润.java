package com.algorithm.company.city58;

import java.util.Scanner;

/**
 * Created by mu on 2017/9/15.
 */
public class 炒房最大利润 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<arr.length; i++) {
            arr[i] = s.nextInt();
        }
        test1(arr,n);
    }


    /**
     * 穷举法
     * 从某个价格买入再从某个价格卖出，得到的最大利润
     * @param arr
     * @param n
     */
    private static void test1(int arr[],int n) {

        int max = 0, start = 0, end = 0, i, j = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (max < arr[j] - arr[i]) {
                    max = arr[j] - arr[i];
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(max + "," + (start+1)+ "-" + (end+1));
    }
}
