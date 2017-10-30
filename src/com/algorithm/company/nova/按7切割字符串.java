package com.algorithm.company.nova;

import java.util.Scanner;

/**
 * Created by mu on 2017/9/18.
 */
public class 按7切割字符串 {
    /**
     * 每7个长度截取并输出，如果不足7位补0
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = new String(sc.nextLine());
            if (s.length() % 7 != 0)
                s = s + "00000000";

            while (s.length() >= 7) {
                System.out.println(s.substring(0, 7));
                s = s.substring(7);
            }
        }
    }
}

