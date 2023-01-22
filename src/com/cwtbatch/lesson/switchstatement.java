package com.cwtbatch.lesson;

import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num3;
        System.out.println("Number 3: ");
        num3 =sc.nextInt();
        switch (num3){
            case 1:
                System.out.println("This is One");break;
            case 2:
                System.out.println("This is Two");break;
            case 3:
                System.out.println("This is Three");break;
            default:
                System.out.println("Nothing");
        }
    }
}
