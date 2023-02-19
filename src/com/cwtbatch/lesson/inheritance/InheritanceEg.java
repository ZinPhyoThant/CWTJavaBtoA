package com.cwtbatch.lesson.inheritance;

public class InheritanceEg {

}

class A{
    int a=10;
    int b=11;
    int c=12;
}

class B extends A{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a);
    }
}

class C extends B{
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.c);
    }
}

/**
 * Super Class | Parent Class
 * Child Class | SubClass
 * This is called single inheritance
 *
 * 5 Types Of Inheritance
 * - Single Inheritance
 * - Multi Level
 * - Hierarohical
 * - Multiple
 * - Hybird
 *
 *  + Single Inheritance +
 *   extends | child -> parent
 *
 *   + MultiLevel Inheritance +
 *    | child->child(parent)-> parent
 *
 *   + Hierarchical
 *    | P -> -> child child
 */
