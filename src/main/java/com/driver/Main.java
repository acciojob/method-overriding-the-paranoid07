package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        B obj =new B();

        System.out.println(obj.meth());

        B obj1 =new B();

        System.out.println(obj1.meth());
    }
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}
