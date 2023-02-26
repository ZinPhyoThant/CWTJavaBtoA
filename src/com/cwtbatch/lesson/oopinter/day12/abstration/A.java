package com.cwtbatch.lesson.oopinter.day12.abstration;


abstract class B{
    abstract void b();
    abstract void c();
}

public class A extends B{
    @Override
    void b() {
        System.out.println("This is Something");
    }

    @Override
    void c() {
        System.out.println("This is c");
    }

    public static void main(String[] args) {
        A a = new A();
        a.b();
        a.c();
    }
}



