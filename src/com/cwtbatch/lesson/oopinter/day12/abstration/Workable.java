package com.cwtbatch.lesson.oopinter.day12.abstration;

public interface Workable {
//    final int a=2;
     void doIT();
}

class ExampleInterface implements Workable{

    @Override
    public void doIT() {
        System.out.println("Doing Homework");
    }

    public static void main(String[] args) {
        ExampleInterface obj=new ExampleInterface();
        obj.doIT();
    }
}


