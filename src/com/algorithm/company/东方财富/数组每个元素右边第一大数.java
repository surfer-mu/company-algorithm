package com.algorithm.company.东方财富;

import java.util.Scanner;

/**
 * Created by mu on 2017/10/2.
 */
public class 数组每个元素右边第一大数 {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        fun(arr);
    }

    private static void fun(int[] arr) {
        int b[]=new int [arr.length];
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length&&arr[j]<arr[i];j++);
            if(j!=arr.length){
                b[i]=arr[j];
            }
            else{
                b[i]=-1;
            }
        }

        for(i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
