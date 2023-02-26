package com.cwtbatch.lesson.oopinter.abstrction;

public class Casting {
    class aaa{};
    class aa{};
    public void main(String[] args) {

        byte num1 = 1;
        int num2 = num1;

        int num3 =4;
        byte num4 = (byte)num3;

        aaa AAA = new aaa();
        aaa AA = AAA;
    }
}
