package com.cwtbatch.lesson.day12.abstration;

public class D {

}

abstract class P{
    abstract void p();
}

class child extends P {
    @Override
    void p() {
        System.out.println("Washing");
    }


}

class child2 extends P{
    @Override
    void p() {
        System.out.println("Hashing");
    }

    public static void main(String[] args) {
        child2 c2= new child2();
        c2.p();
        child c1 = new child();
        c1.p();
    }
}



