package com.algorithm.剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mu on 2017/9/22.
 */
public class 找出重复的数字 {
    public static void main(String[] args) {
        int arr[]=new int[]{3,3, 8,5,7,3, 2, 5, 9, 8, 4, 7, 2, 6, 9, 7, 7, 10, 14, 18, 15, 14, 16, 3,9};
        System.out.println( findRepeat(arr));
    }

    /**
     * 任意找出一个数组中重复的数字
     * @param arr
     * @return
     */
    private static List<Integer> findRepeat(int[] arr) {
        List<Integer> list=new ArrayList<Integer>();
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]){
                if(arr[i]!=arr[arr[i]]){
                    int temp=arr[i];
                    arr[i]=arr[temp];
                    arr[temp]=temp;
                }
                else{
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}
