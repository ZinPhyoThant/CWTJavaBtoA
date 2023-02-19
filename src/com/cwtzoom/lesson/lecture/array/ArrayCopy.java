package com.cwtzoom.lesson.lecture.array;

public class ArrayCopy {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,9,8,7,5,4,3};
        System.out.println(numbers.getClass().getName());

        int other[] = new int [9];

        System.arraycopy(numbers,3,other,1,4);//arguments

        for (int i = 0; i < other.length; i++) {
            System.out.println(other[i]);
        }

        int another[] = other.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.print(another[i]+"\t");
        }
    }
}
//array => object