package com.cwtbatch.lesson.oopinter.application;

class Engine{
    void status(){
        System.out.println("Engine is working");
    }
}

public class car {
    public void start(Engine engine){
        engine.status();
    }

    public static void main(String[] args) {
        Engine engine = new Engine();
        car car = new car();
        car.start(engine);
    }
}
