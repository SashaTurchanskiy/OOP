package com.company;

public class Person {
    public String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

class MyClass {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "John";  // error
        System.out.println(myObj.name); // error
    }
}