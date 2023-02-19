package com.cwtbatch.lesson.oop;

import com.cwtzoom.lesson.lecture.oop.ObjectAndClass;

public class OOPOne {

    int a=3;//Global Variable

    int b=3;//Instance Variable(Non-Static)

    static int c=4; //static variable

    public static void main(String[] args) {
        int a=3;//local variable
        System.out.println(a);

        System.out.println(OOPOne.c);

        System.out.println(c);

        OOPOne obj = new OOPOne();
        System.out.println(obj.b);

        System.out.println(new OOPOne().a);//any
    }
}

/**
 * Types of variable
 *
 * Create Obj Synx
 * classname obj = new className();
 *                  constructor
 *
 * static ko obj ma lo pae ton los ya p
 * non-static ko obj pr ma ya ml
 */
