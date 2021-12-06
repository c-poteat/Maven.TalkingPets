package io.zipcoder.polymorphism;

public class Mouse extends Pet{
    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
    }

    @Override
    public String speak() {
        return "squeak";
    }

}
