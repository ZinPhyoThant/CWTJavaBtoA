package com.cwtzoom.lesson.lecture.oop;

class Student{
    int id;
    String name;
}

public class ObjectInit {
    static int b=54;
    public static void main(String[] args) {
        Student student= new Student();
        System.out.println(" id is "+student.id);
        System.out.println("name is "+ student.name);

        int number =0;
        System.out.println(number);

        System.out.println(b);

        Student student1 = new Student();
        student1.id=2;
        student1.name="Some One";

        System.out.println("Anyonumus");



        int a=4,b1=2,c=1;
//
//        System.out.println(new Student().id);
//        System.out.println(new Student().name);

        Student student2 = new Student(),student3=new Student();
    }
}
/**
 *
 * @ attributes => direct
 * @ method     =>
 * @Constructor =>
 *
 * new keyword
 * newInstance() method
 * clone()
 * deserialization
 * factory method
 *
 * ClassName obj = new Con();
 *
 **/