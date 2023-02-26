package com.cwtbatch.lesson.basic;

public class LogicalOperator {
    public static void main(String[] args) {
    int num1=10;
    int num2=5;
    int num3=1;

    System.out.println((num1<num2)&&(num1>num2));
    System.out.println((num1<num2)||(num1>num2));
    System.out.println(!(num1<num2)||(num1>num2));
    }
}

/**
 * && And T&&T=T / T&&F=F
 * || Or T//F=T F//T=T
 * ! Not
 */
