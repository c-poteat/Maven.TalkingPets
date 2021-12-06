package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Cat extends Pet {
    public static ArrayList<String> catList = new ArrayList();

    public Cat(String name) {
        super(name);
    }

    public Cat() {

    }

    public void add(String cat) {
        catList.add(cat);
    }

        @Override
    public String speak() {
        return "meow";
    }

}
