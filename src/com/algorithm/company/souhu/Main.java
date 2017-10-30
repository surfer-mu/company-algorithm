package com.algorithm.company.souhu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lalala on 2017/9/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        for (int i=0;i<n;i++){
            int tmp = scanner.nextInt();
            sum+=tmp;
            arrayList.add(tmp);
        }

        for (int i= 0,j = arrayList.size()-1;i<j;){
            if(arrayList.get(i).equals(arrayList.get(j))){
                i++;
                j--;
            }else {
                sum+=arrayList.get(i)<arrayList.get(j)?arrayList.get(i++):arrayList.get(j--);
            }
        }
        System.out.println(sum);
    }
}
