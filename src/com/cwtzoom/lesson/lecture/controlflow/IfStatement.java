package com.cwtzoom.lesson.lecture.controlflow;

public class IfStatement {
    public static void main(String[] args) {
        //syntax => dataType variableName = value;


        //decision-making statement
        /*
        - if
            if(condition){} =>true, do something
         */

        int a=10;
        if(a>11){
            System.out.println(a+ " is greater than 11");
        } else
            System.out.println(a+ "is less than 11");

        int mark =40;
        if(mark<40){
            System.out.println("Fail");
        } else if(mark>=40 && mark<80)
            System.out.println("Pass");
        else
            System.out.println("D");
    }
}

/**
 * decision making statement
 * loop statement
 * jump statement
 *
 * @decisionMaking
 * if(condition){
 *     statement
 * }
 * if(condition){
 *     statement
 * } else
 *     statement
 *
 * if(condition){} else if(){} else
 *
 */
