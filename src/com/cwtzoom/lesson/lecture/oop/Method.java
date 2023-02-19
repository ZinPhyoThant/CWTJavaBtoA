package com.cwtzoom.lesson.lecture.oop;

public class Method {

    void add(int num1, int b){
        System.out.println(num1+b);
    }
    static void eat(){
        System.out.println("Eat method is waking");
        System.out.println("second sentese");
        System.out.println("eat method is working");
        System.out.println("Eat method is working");
    }

    public static void main(String[] args) { //Main Method
        Method method= new Method();
        eat();
        eat();
        eat();;
        eat();
        eat();

        method.add(45,40);
        method.add(1,2);
        method.add(100,600);


    }
}

/**
 *
 * syntax
 *
 * create
 *
 * returnType methodName(){
 *
 * @ predefine method
 * @ user defined method
 * }
 */

//access modifer {non-access modifier return type methodName(parameter) => method header}
// {implementation} => method body