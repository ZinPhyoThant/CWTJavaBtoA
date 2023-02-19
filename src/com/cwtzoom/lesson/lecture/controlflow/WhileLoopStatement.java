package com.cwtzoom.lesson.lecture.controlflow;

public class WhileLoopStatement {
    public static void main(String[] args) {
        //while
        int a = 5;
        while (a<10){
            System.out.println(a);
            a++;
        }
        System.out.println("Next");
        //do while
        do{
            System.out.print(a+ "\t");
            a+=2;
        } while (a<20);

    }
}

/**
 * while loop syntax
 * while (condition မှန်နေမှလုပ်တာ){
 *     statement
 *     prefix,postfix
 * }
 *
 * do while loop syntax
 * do{
 *     statement
 * } while (condition)
 * မှားနေလည်းတစ်ကြိမ်အလုပ်လုပ်တယ်
 */
