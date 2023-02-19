package com.cwtbatch.lesson.Method.accessmodifier;

public class AccessmodifierEg {

    int a=10;

    public static void main(String[] args) {

    }
}

class A{
    public static void main(String[] args) {
        AccessmodifierEg obj = new AccessmodifierEg();
        System.out.println(obj.a);
    }
}

