package com.cwtbatch.lesson.oopinter.day12.abstration;

interface Parent1{
    void doItP1();
}

interface Parent2{
    void doItP2();
}

public class MultipleIn implements Parent1,Parent2{
    @Override
    public void doItP1() {
        System.out.println("forP1");
    }

    @Override
    public void doItP2() {
        System.out.println("forP2");
    }

    public static void main(String[] args) {
        MultipleIn obj = new MultipleIn();
        obj.doItP1();
        obj.doItP2();
    }
}
