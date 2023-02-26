package com.cwtbatch.lesson.oopinter.abstrction;

abstract class A{
    abstract void a();
    abstract void b();
}
public class Abstract_Ex extends A{

    @Override
    void a() {
        System.out.println("This is a");
    }

    void b(){
        System.out.println("This is b");
    }

    public static void main(String[] args) {
    Abstract_Ex ab = new Abstract_Ex();
    ab.a();
    ab.b();
    }
}
