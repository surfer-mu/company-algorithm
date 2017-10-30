package com.algorithm.company.goodFuture;

import java.util.concurrent.Callable;

/**
 * Created by mu on 2017/9/15.
 */
public class Main {
    public static int n=3;
    public static int x[]={1,1,1};
    public static int a[][]={{1,1,1},{1,1,1},{1,1,1}};
    public static int k=0;

    static class  MyThread implements Callable<Integer>{

        @Override
        public Integer call()throws Exception  {
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=(x[i]*a[i][k]);
            }
            return sum;
        }
    }
    public static void main(String[] args) throws Exception {

        int sum=0;
        for(int i=0;i<n;i++)
        {
            Integer tmp = new MyThread().call();
            k++;
            sum+=tmp;
        }
        System.out.println(sum);
    }
}
