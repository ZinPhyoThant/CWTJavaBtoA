package com.cwtbatch.lesson.basic;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
    int [] a = {1,2,3,4,5};
    a [0] = 6;
    System.out.println("a:" +Arrays.toString(a));

    int [] b =new int[5];

    b[0] = 1;
    b[1] = 2;
    b[2] = 3;
    b[3] = 4;
    b[4] = 5;
        System.out.println(b.length);
    System.out.println("b: "+ Arrays.toString(b));

    int [] c= {6,7,8,9,10,11};
    for (int i=0; i<c.length;i++)
        System.out.println(c[i]);

        int [] d ={1,2,3,4,5,6};
        for (int i1=d.length-1; i1>=0;i1--) {
            System.out.println("d: " + d[i1]);
        }

        int [] [] e = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        System.out.println("e: "+ e[0][2]);

        //    int [] [] f = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//
//    for(int i=0;i<f){
//        for(){
//             }

        for (int i1:d) {
            System.out.println(i1);
        }
    }
}

/**
 * Array
 * -Collection of the same data
 * -5 length - RoomQuantity
 * -0 index - RoomNo
 * int a [][] = {{1,2,3,4,5},{3,4,5,6,7},{4,5,6,7,8}}
 *
 * two diemension array
 * multi dimension
 * jagged array dimension
 * for each is only use for array
 *
 */
