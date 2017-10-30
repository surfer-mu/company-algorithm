package com.algorithm.剑指offer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mu on 2017/9/26.
 */
public class 替换空格 {
    /**
     * 面试题5 将字符串中空格替换为  %20
     * java因为下标，故无法实现,,C语言代码如下
     */
    /*
#include<stdio.h>
#include<string.h>
void fun(char chars[]) {
		int len=strlen(chars);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ')
                count++;
        }
        chars[len + count * 2 ]=0;
        for (int j = len + count * 2 - 1, i =len - 1; i >= 0 && j != i; j--, i--) {
            if (chars[i] == ' ') {
                chars[j] = '0';
                chars[--j] = '2';
                chars[--j] = '%';
            } else {
                chars[j] = chars[i];
            }
        }
    }
int main(void)
{
		char chars[100];
		gets(chars);
		fun(chars);
		printf("%s",chars);
}

    * */


}
