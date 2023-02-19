package com.cwtbatch.lesson.oop.method;

public class Method2 {

    class B{
        static void age(int a,String b){ //parameter
            System.out.println(a);
            System.out.println(b);
        }

        public static void main(String[] args) {
            B.age(5,"Mg Mg"); //argument
            B.age(21,"Su Su");
        }
    }
}
