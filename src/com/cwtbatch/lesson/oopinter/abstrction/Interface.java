package com.cwtbatch.lesson.oopinter.abstrction;

interface AB{
    void add(int a,int b);
}

interface cd{
    void cdcd(int g);
}


class  CD {
    void sum(int a, int b, AB ab){
        ab.add(a,b);
    }
}

class One implements AB{


    @Override
    public void add(int a, int b) {
        System.out.println(a-b);
    }
}
public class Interface extends CD{

    public static void main(String[] args) {
        Interface in = new Interface();
//        in.sum(1, 4, new AB() {
//            @Override
//            public void add(int a, int b) {
//                System.out.println(a+b);
//            }
//        });
//        in.sum(4, 2, new AB() {
//            @Override
//            public void add(int a, int b) {
//                System.out.println(a-b);
//            }
//        });
        
        in.sum(1,2,new One());

        cd cdcdd = g -> {};
    }
}
