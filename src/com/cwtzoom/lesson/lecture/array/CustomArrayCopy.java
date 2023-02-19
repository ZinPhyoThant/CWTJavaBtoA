package com.cwtzoom.lesson.lecture.array;

import com.cwtzoom.lesson.lecture.controlflow.ForLoopStatement;

public class CustomArrayCopy {
    public static void main(String[] args) {

        //initialize an array
        int numbers[] = {1,2,3,4,5,6,7,8,};


        int copy[] = new int [numbers.length];//{0,0,0,0,0,0,0,0}

        //before copy
        for (int i : copy) {
            System.out.print(i+"\t");
        }

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }

        System.out.println("");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }

        //Find Largest Number
        int largestNumber =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largestNumber){
                largestNumber = numbers[i];
            }

        }
        System.out.println(largestNumber);

        //Next
        int num[] = {1,4,3,2,6,5,8,9,7};
        int valueNow = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j=i+1;j<num.length;j++){
                if (num[i]>num[j]){
                    valueNow = num[i];
                    num[i] = num[j];
                    num[j] = valueNow;
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        System.out.println(num[num.length-1]);

    }
}
