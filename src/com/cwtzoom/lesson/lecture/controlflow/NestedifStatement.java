package com.cwtzoom.lesson.lecture.controlflow;

public class NestedifStatement {
    public static void main(String[] args) {
        int a = 45;
        if (a < 40) {
            int b = 10;
            if (b == 1) {
                System.out.println("b is equal 1");
            } else if (b == 2) {
                System.out.println("b is equal 2");
            } else {
                System.out.println("no equal 1 and 2");
             }
            }else {
            System.out.println("a is greater than 40");
        }
    }
}

//Nested => အတွင်းထဲမှာထပ်ထပ်ပြီးရှိတာ