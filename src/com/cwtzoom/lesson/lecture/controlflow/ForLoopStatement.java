package com.cwtzoom.lesson.lecture.controlflow;

public class ForLoopStatement {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.print(i+ "\t");
        }
        System.out.println(" ");

        for (int i=0;i<5;i++){

            for (int j=0;j<3;j++){
                System.out.print(j);
            }

            System.out.print("#" + "\t");
        }

        for (int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print("$" + "\t");
            }
            System.out.println(" ");
        }

    }
}
/**
 * for (1statement;2statement;3statement){
 *
 * }
 * 1 -> initialize statement;   int i =0;
 * 2 -> condition statement;    10<1;
 * 3 -> count ++ --             i++
 *
 * syntax for (; ; ) {}
 */
