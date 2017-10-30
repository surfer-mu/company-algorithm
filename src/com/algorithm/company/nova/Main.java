package com.algorithm.company.nova;

import java.util.Scanner;

/**
 * Created by mu on 2017/9/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len = s.nextInt();
        int sl=s.nextInt();
        for(int i=0;i<3;i++){
            int count=0,k=0;
            for(int j=0;j<len;j++){
               if (sl*j<len){
                   count++;
               }
            }
            if(i==0)
            System.out.println("第一次提取的数据长度为"+count);
            if(i==1)
                System.out.println("第二次提取的数据长度为"+count);
            if(i==2)
                System.out.println("第三次提取的数据长度为"+count);
        }
    }
}
