package com.cwtzoom.lesson.lecture.array;

public class DuplicateElement {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,4,3,5,6,7,8,9,9};
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = i+1; i1 < numbers.length; i1++) {
                if (numbers[i]==numbers[i1]) {
                    System.out.println(numbers[i1]);
                }
            }
        }
    }
}
