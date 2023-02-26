package com.cwtbatch.lesson.oopinter.oop.method;

public class Method {

    void doSomething(){
        System.out.println("Do Something");
    }

    public static void main(String[] args) {
        Method obj = new Method(); //Constructor
        obj.doSomething(); //Synchronize

        A obj1= new A();
        obj1.eat(); //method ကိုခေါ်သုံးတာ


        A.recall();


    }
}


class A{
    void eat(){
        System.out.println("I'm Eating.");
    }

    static void recall(){
        System.out.println("This is recall");
    }
}