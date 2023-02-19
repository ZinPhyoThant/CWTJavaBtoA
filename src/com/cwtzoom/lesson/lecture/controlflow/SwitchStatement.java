package com.cwtzoom.lesson.lecture.controlflow;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int a = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        switch (name){
            case "Kyi":
                System.out.println(name + "is Kyi"); break;
            case "Khin":
                System.out.println(name+ "is Khin"); break;
            case "Than":
                System.out.println(name+ " is Than"); break;
            default:
                System.out.println("Nothing");
        }

        //Input String 3

        switch (a){
            case 1:
                System.out.println(a + "is equal to 1"); break;
            case 2:
                System.out.println(a+ "is greater than 1"); break;
            case 5:
                System.out.println(a+ " is equal to 5"); break;
            default:
                System.out.println("Nothing");
        }



    }
}

/**
 * Syntax
 * switch (expression){
 *  case x: //code block break;
 *  case y: //code block break;
 *  default : //code block
 *  }
 *
 * if နဲ့ switch ကအခြေအနေတစ်ခုပေါ်မူတည်ပြီးပဲစစ်လို့ရတယ်
 *
 *
 *
 */

// 1 Khin Myat
//*
//**
//***
//****
//*****

//2.Kyi Saint
//     *
//    **
//   ***
//  ****
// *****

//3.Than Sin
//*****
//****
//***
//**
//*
