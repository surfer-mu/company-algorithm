package com.algorithm.company.CVTE;

/**
 * Created by mu on 2017/9/17.
 */
public class 字符串最长回文子串 {
    public static void main(String[] args) {
        String str="abbfffccd";
        int maxLong=0;
        String maxStr="";
        for(int i=0;i<str.length();i++){
            for(int start=i,end=str.length();start<=end;end--){
                if(str.substring(start, end).equals("反转的字符串")){
                    if(str.length()>maxLong){
                        maxLong=str.length();
                        maxStr=str;
                    }
                }

            }
        }

        System.out.println(maxStr);

    }
}
