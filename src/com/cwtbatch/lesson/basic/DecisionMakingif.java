package com.cwtbatch.lesson.basic;

import java.util.Scanner;

public class DecisionMakingif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Number1: ");
        num1=sc.nextInt();
        System.out.print("Number2: ");
        num2=sc.nextInt();
        System.out.print("Number3: ");
        num3=sc.nextInt();
        if (num3==1){
            System.out.println("1 is + " + (num1+num2));
        } else if(num3==2){
            System.out.println("2 is -: "+(num1-num2));
        }else
            System.out.println("Nothing Happen!");

        //

        if(num1>num2){
            System.out.println("num1 is greter than num2");
            if(num1>num3){
                System.out.println("num1 is greter thant num3");
            }
        } else
            System.out.println("Nothing Happen");

    }
}
