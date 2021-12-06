package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dog extends Pet {
    public static ArrayList<String> dogList = new ArrayList();
    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    public void add(String dog) {
        dogList.add(dog);
    }
    @Override
    public String speak() {
        return "woof";
    }
}
