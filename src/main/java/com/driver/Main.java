package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.meth("First call"));
        System.out.println(obj.meth());
    }
}
