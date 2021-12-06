package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet {

    public String name;

    public Pet() {

    }


//    public String getPetById(int id) {
//        for(String pet : list) {
//            if(pet. == id) {
//                return pet;
//            }
//        }
//        return null;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }
    public String speak() {
        return "speak";
    }


}
