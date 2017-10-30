package com.algorithm.剑指offer;

/**
 * Created by mu on 2017/9/25.
 */

import java.util.Scanner;

/**
 * 面试题4  在一个二维数组中，从左到右依次增大，从上到下依次增大，寻找KEY的位置
 */
public class 二维数组找数 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("输入数组横纵");
        int [][] arr=new int[s.nextInt()][s.nextInt()];
        System.out.println("输入数组元素值");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("输入key");
        int key=s.nextInt();


        fun(arr,key);
    }

    public static void fun(int[][] arr, int key) {
        for(int i=0;i<arr.length;){
            for(int j=arr[i].length-1;j>=0;){
                if(arr[i][j]>key){
                    j--;
                }
                else if(arr[i][j]<key){
                    i++;
                }
                else{
                    System.out.println("i="+i+",j="+j);
                    return ;
                }
            }
        }
    }
}
