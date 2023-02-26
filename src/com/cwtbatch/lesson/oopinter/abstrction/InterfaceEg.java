package com.cwtbatch.lesson.oopinter.abstrction;

interface AD{
    void add();
}



public class InterfaceEg {

    public static void main(String[] args) {
        AD obj = new AD() {
            @Override
            public void add() {
                System.out.println("Thi is add");
            }
        };



    }
}
