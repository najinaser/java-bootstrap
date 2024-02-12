package com.example;

public class Application {
    private Domain localDomain;
    Application(Domain d){
        this.localDomain = d;
    }

    public void doSomething() {
        System.out.println("Application layer");
        this.localDomain.printName();
    }
}
