package com.driver;
import java.util.*;
class A {
    String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main (String[] args) {
        A obj = new B();
        obj.meth();
        B obj1 = new B();
        obj.meth();
    }
}