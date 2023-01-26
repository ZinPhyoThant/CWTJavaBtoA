package com.cwtbatch.lesson;

public class ArrayLargest {
    public static void main(String[] args) {
        int a=0;
        int [] num = {1,2,3,4,5};
        for (int i=0;i<num.length;i++){
            if(num[i]>a){
                a=num[i];
            }
        }
        System.out.println("Largest Number"+a);
    }
}
