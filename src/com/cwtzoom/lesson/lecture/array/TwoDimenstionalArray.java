package com.cwtzoom.lesson.lecture.array;

public class TwoDimenstionalArray {
    public static void main(String[] args) {
        int numbers [] [] = new int [4] [5]; //declare

        int dNumbers[][] = {
                {1,2,3,4,5,1,2,3},
                {5,4,3,2,1},
                {1,1,1,1,100},
                {5,5,3,3,4}};

        System.out.println(dNumbers[2][4]);
        dNumbers[3][0]=1;
        System.out.println(dNumbers[3][0]);

        System.out.println(dNumbers.length);
        System.out.println(dNumbers[0].length);

        for (int i = 0; i < dNumbers[0].length; i++) {
            System.out.println(dNumbers[0][i]);
        }

        System.out.println("Next");

        for (int row=0;row<dNumbers.length;row++){
            for (int col=0;col<dNumbers[row].length;col++){
                System.out.print(dNumbers[row][col]+"\t");
            }
            System.out.println();
        }


    }
    /**
     * @Two Multi Sybtax
     * int numbers [][] = new int [row][col];
     */
}
/**
 *
 */