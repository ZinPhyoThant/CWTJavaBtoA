package com.cwtzoom.lesson.lecture.array;

public class JavaArray {
    public static void main(String[] args) {
        int a= 66; // variable initialize
        int b; // declare
        String name = "Zin Phyo";

        int numbers []  = {12,3432,3242,32}; //array initilaize
        String names [] = new String[7]; // array Declare

        System.out.println(numbers[2]);

        numbers[0] = 1;
        System.out.println(numbers[0]);

        String cars[] = new String[4];
        cars[0] = "marcedes";
        cars[2] = "toya";
        cars[3] = "lambo";

        System.out.println(cars[1]);

        System.out.println(names.length);

        System.out.println(numbers.length);

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

        for (String car : cars) {
            System.out.println(car);
        }

        for(String c: cars){
            System.out.print(c+"\t");
        }


        int [][] dNumbers = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11},
        };
        for (int [] number: dNumbers){
            for (int n: number){
                System.out.print(n + "\t");
            }
            System.out.println();
        }

    }
}

/**
 * array ဆိုတာ data type တူတာတွေစုပြီးသိမ်းထားလို့ရတဲ့ collection ကိုခေါ်တယ်.
 *
 * array elements 25 40 65 98 100
 * Array Index    0  1  2  3   4
 *
 * length က အခန်းအရေအတွက်ကိုစစ် တာ index ကိုစစ်တာs
 * length က အခန်းအရေအတွက်ကိုစစ် တာ index ကိုစစ်တာ
 */

/**
 * @One Dimensional Array
 * @Two Dimensional or Multidimentaional
 * @Jagged Array
 *
 * for each loop
 * အခန်းဘယ်လောက်ကစမယ် လုပ်လို့မရဘူး အကုန်ထုတ်လို့ပဲရမယ်
 */
