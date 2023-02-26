package com.cwtbatch.lesson.basic;

public class forloop {
    public static void main(String[] args) {
        int i;
        for (i=0;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("Do While");
        int i1=5;
        do{
            System.out.println(i1);
            i1++;
        }while(i1<5);

        System.out.println("While");
        int i2=9;
        while(i2>1){
            System.out.println(i2);
        }
    }


}
/**
 * for (starting,condition,in/decrease){
 *     34567890-=
 * }
 */