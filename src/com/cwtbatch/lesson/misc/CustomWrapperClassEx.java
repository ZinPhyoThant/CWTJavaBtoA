package com.cwtbatch.lesson.misc;

class Interger1 extends Object{
    int a;

    public Interger1(int a) {
        this.a = a;
    }

    public String toString(){
        return String.valueOf(a);
    }

}
public class CustomWrapperClassEx {
    public static void main(String[] args) {
    String name = "Zin Phyo";
    String name1= new String("Zin Phyo Thant");

//    Integer integer = 1;
//    Integer integer1 = new Integer(1);

    Interger1 obj = new Interger1(4);
        System.out.println(obj);

    }
}
