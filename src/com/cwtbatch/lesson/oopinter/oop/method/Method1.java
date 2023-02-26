package com.cwtbatch.lesson.oopinter.oop.method;

public class Method1 {
//    String name(){
//
//    }
//
//    void eat(){}




    static String name(){
        System.out.println("Testing/");
        return "Name";
    }

    static int age(){
        return 0;
    }

    static void eat(){
        System.out.println("I'm eating");
    }
    public static void main(String[] args) {
        System.out.println(Method1.age());
        System.out.println(Method1.name());
        Method1.eat();

        int var= Method1.age();

    }


}
