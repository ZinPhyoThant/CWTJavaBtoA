package com.cwtbatch.lesson.basic;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        char op;
        System.out.print("Enter 1st Num: ");
        num1=sc.nextInt();
        System.out.print("Enter 2st Num: ");
        num2=sc.nextInt();
        System.out.print("Enter Oprator: ");
        op=sc.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("Result:"+num1+op+num2+ "="+(num1+num2)); break;
            case '-':
                System.out.println("Result:" +num1+op+num2+ "="+(num1-num2)); break;
            case '*':
                System.out.println("Result:"+num1+op+num2+ "="+(num1*num2)); break;
            case '%':
                System.out.println("Result:"+num1+op+num2+ "="+(num1%num2)); break;
        }
    }
}
