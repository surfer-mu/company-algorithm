package com.algorithm.company.东方财富;

/**
 * Created by mu on 2017/9/22.
 */
public class Base {
    static Base a=new Base();
    {
        System.out.println("C");
    }
    static{
        System.out.println("s");
    }

    public Base() {
    }

    public static void main(String[] args) {
    new Base();
    }
}
