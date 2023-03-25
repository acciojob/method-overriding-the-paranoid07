package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.meth("Initial call"));
        System.out.println(obj.meth());
    }
}
class A{
    public String meth(String str){
        return "Invoking method from class A";
    }
}
class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}