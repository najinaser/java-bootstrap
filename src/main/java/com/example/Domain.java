package com.example;

import java.security.PublicKey;

public class Domain {

    public String firstName;

    public String lastName;
    Domain(String ln){
        this.lastName = ln;
    }

    public void printName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}
