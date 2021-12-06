package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Mouse extends Pet{
    public static ArrayList<String> mouseList = new ArrayList();
    public Mouse(String name) {
        super(name);

    }

    public Mouse() {
    }

    public void add(String mouse) {
        mouseList.add(mouse);
    }

    @Override
    public String speak() {
        return "squeak";
    }

}
