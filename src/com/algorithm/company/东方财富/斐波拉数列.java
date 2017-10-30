package com.algorithm.company.东方财富;

import java.util.Scanner;

/**
 * Created by mu on 2017/9/22.
 */
public class 斐波拉数列 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fiSum(n));;
    }
    /**
     * 斐波拉数列前n项和
     * @param n
     */
    private static int fiSum(int n) {
        int sum=0;
        int x;
        int a=1,b=1;
        for(int i=3;i<=n;i++){
            x=a+b;
            a=b;
            b=x;
            sum+=x;
        }
        return sum+2;
    }

    /**
     * 斐波拉数列第n项值
     * @param n
     * @return
     */
    private static int fun(int n) {
        if(n < 1)
            return 0;

        if(n==1||n==2)
            return 1;
        else
            return fun(n-1)+fun(n-2);
    }
}
