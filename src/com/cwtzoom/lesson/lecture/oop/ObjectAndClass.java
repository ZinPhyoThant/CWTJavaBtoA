package com.cwtzoom.lesson.lecture.oop;

public class ObjectAndClass {
    //global var

    //fields => variable
//    int number1 =21; //global instance varibale
//    static int number = 12;// global static var

    //static
    //instance

    int a = 45;
    static int b= 67;
    static String name ="Zin Phyo";

    public static void main(String[] args) {
//        int a = 45; // local variable

        //Syntax ClassName objName = new Constructor();
        ObjectAndClass object1 = new ObjectAndClass();
        System.out.println(object1.a);
        System.out.println(ObjectAndClass.name);


    }
}
/**
 * object -> we can see easily
 * State -> apple / color=red/ weight => 100g
 *
 * //car => wheel =>10/ windows=>2
 * //method / function = behavior => drive/run/walk/eat/drink
 *
 * Class => field and method
 *
 * group => 2
 * local var
 * global var
 * ->
 */