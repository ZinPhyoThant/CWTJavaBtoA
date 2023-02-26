package com.cwtbatch.lesson.basic;

import java.util.Scanner;

public class EvenOff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter Number: ");
        num=sc.nextInt();

        if ((num%2)==0){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }

}
