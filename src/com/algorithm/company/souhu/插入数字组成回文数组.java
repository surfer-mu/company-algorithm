package com.algorithm.company.souhu;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by mu on 2017/9/17.
 */
//  1 2 3 4
//  1 2 3 4 5
public class 插入数字组成回文数组 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int [] arr=new int[n];
        int [] b=new int[n];
        int k=0;
        int left,right;
        int len;
        int min;
        LinkedList list=new LinkedList();
        len=arr.length;
        left=len/2-1;
        if(n%2==0){
            right=len/2;
        }
        else{
            right=len/2+1;
        }
        while(n--!=0){
            arr[k++]=s.nextInt();
        }
        for(;left>=0&&right<arr.length;left--,right++){
            if(arr[left]!=arr[right]){

                    if(arr[left]<arr[right]){
                        b[right]=arr[left];
                    }
                    else{
                        b[left]=arr[right];
                    }
                    min=arr[left-1]>arr[right+1]?arr[right+1]:arr[left-1];

            }
        }

    }
}
