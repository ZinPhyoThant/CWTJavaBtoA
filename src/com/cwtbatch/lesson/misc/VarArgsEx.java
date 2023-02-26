package com.cwtbatch.lesson.misc;

public class VarArgsEx {
    static void fullName(String fullname){}
    static void flName(String fName,String lName){}

    static void name(String... names){
        String fflName = " ";
        for (String s: names
             ) {
            fflName+=s;
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        fullName("Zin Phyo Thant");
        flName("Zin","Phyo");

        name("Zin Phyo Thant");
        name("Zin","Phyo");
        name("Mg","Zin","Phyo");


    }
}
