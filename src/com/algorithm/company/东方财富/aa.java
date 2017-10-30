package com.algorithm.company.东方财富;


public class Main{
    public static String ReverseSentence(String str) {
        if(str.trim().equals("")) {
            return null;
        }
        String[] split = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i=split.length-1;i>=1;i--){
            builder.append(split[i]).append(" ");
        }
        builder.append(split[0]);
        return  builder.toString();
    }

    public static void main(String[] args) {
        String str="! word the hello";
        String s = ReverseSentence(str);
        String s1 = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(s1);
    }
}