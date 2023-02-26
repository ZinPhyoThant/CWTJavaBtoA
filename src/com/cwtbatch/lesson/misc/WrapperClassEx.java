package com.cwtbatch.lesson.misc;

public class WrapperClassEx {

    public static void main(String[] args) {
        int a=678;
        String str ="Zin";

        Integer integer = 342342;
        Float float1=3.0f;

        Integer integer1 =a; //Autoboxing
        int num1 = integer1; //unboxing

        String str2 = integer.toString();
        //String str1 = String.copyValueOf();

        Integer intenger2 = Integer.valueOf(str);
        String str1;
//        int integer3= Integer.parseInt(str1);

        String str4 = "abc";
        int res = Integer.parseInt(str4);
    }
}
