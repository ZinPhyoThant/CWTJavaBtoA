package com.cwtbatch.lesson.Method;

public class ConstructorEg {
    int a;
    int b;

    ConstructorEg(int a, int b){
    this.a=a;
    this.b=b;
    }
    public static void main(String[] args) {
//        System.out.println(new ConstructorEg(10,12).a);
        ConstructorEg obj = new ConstructorEg(10,12);
        System.out.println(obj.a);
        System.out.println(obj.b);

    }
}
