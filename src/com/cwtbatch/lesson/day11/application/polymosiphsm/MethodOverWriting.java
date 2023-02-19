package com.cwtbatch.lesson.day11.application.polymosiphsm;

import com.cwtbatch.lesson.oop.method.Method;

public class MethodOverWriting {
    void dog(){
        System.out.println("4 legs");
    }

    void sound(){
        System.out.println("Something");
    }



    class ckn extends MethodOverWriting {
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

    public void main(String[] args) {
        ckn chicken = new ckn();
        chicken.dog();
        chicken.sound();
    }
}
