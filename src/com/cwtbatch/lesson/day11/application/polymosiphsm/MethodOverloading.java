package com.cwtbatch.lesson.day11.application.polymosiphsm;

public class MethodOverloading {
    static void show(int a){
        System.out.println(a);
    }

    static void show(int a, int b){
        System.out.println(a + b);
    }

    static void show(int a, int b, int c){
        System.out.println(a + b + c);
    }

    static void show(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        show(1);
        show("Hak");
        show(1,2);
        show(1,2,3);

    }
}
