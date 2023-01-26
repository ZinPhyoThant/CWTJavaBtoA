package com.cwtbatch.lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 = 0;
        System.out.println("Enter Number Array: ");
        num1=sc.nextInt();
        int [] num = new int [num1];
        for (int i=0;i<num.length;i++){
            System.out.println("Enter Number Array Index: ");
            num1 = sc.nextInt();
//            num = num[i];
            num[i]=num1;
        }
        System.out.println(Arrays.toString(num));
    }
}
