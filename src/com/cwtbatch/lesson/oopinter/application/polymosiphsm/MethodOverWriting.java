package com.cwtbatch.lesson.oopinter.application.polymosiphsm;

public class MethodOverWriting {
    void dog(){
        System.out.println("4 legs");
    }

    void sound(){
        System.out.println("Something");
    }



    static class ckn extends MethodOverWriting {
        @Override
         void dog() {
            System.out.println("ckn has 2 legs");
            super.dog();
        }

        @Override
        void sound() {
            System.out.println("Something");
            super.sound();
        }
    }

    public static void main(String[] args) {
        ckn chicken = new ckn();
        chicken.dog();
        chicken.sound();
    }
}
