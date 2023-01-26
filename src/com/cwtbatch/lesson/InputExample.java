package com.cwtbatch.lesson;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        int age;
        float point;

        System.out.print("UserName: ");
        name=sc.nextLine();
        System.out.println(name);

        System.out.print("Age: ");
        age=sc.nextInt();
        System.out.println(age);

        System.out.print("Point: ");
        point=sc.nextFloat();
        System.out.println(point);
    }
}
