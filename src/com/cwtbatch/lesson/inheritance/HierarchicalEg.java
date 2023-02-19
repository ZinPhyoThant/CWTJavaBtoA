package com.cwtbatch.lesson.inheritance;

public class HierarchicalEg {
    int a=11;
}

class Aone extends HierarchicalEg{
    public static void main(String[] args) {
        Aone obj= new Aone();
        System.out.println(obj.a);
    }

}

class Bone extends HierarchicalEg{
    public static void main(String[] args) {
        Bone obj = new Bone();
        System.out.println(obj.a);
    }

}
