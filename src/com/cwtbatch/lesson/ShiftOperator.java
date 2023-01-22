package com.cwtbatch.lesson;

public class ShiftOperator {
    public static void main(String[] args) {
        //LeftShit(<<)
        System.out.println("LS (<<)");
        int operand = 3; // binary – 11
        // 1-bit left shift operation
        int output= operand << 1;
        System.out.println(output);    //2

        //Right Shift(>>)
        System.out.println("RS (>>");
        int operand2 = 2;
        int operand3 = -2;
        // 2 bit signed right shift
        System.out.println(operand2 >> 2);    // 1
        System.out.println(operand3 >> 2);    // -1

        //UNSIGNED RS (>>>)
        System.out.println("URS (>>>");
        int operand4  = 240; // binary number – 1111 0000
        // 2 bit unsigned right shift
        System.out.println(operand4 >>> 2);    //60
    }

}
