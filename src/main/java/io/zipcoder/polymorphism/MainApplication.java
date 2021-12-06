package io.zipcoder.polymorphism;

import static io.zipcoder.polymorphism.Dog.dogList;
import static io.zipcoder.polymorphism.Cat.catList;
import static io.zipcoder.polymorphism.Mouse.mouseList;

public class MainApplication {
    static Cat cat = new Cat();
    static Dog dog = new Dog();
    static Mouse mouse = new Mouse();
    private static String nameOfPetInput;
    private static IOConsole console = new IOConsole(AnsiColor.RED);
    private static String numberOfPetInput;
    private static String typeOfPetInput;

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.getWelcomeScreen();
        MainApplication.run();
    }

    public static void run() {
        numberOfPetInput = console.getStringInput("\nHow many pets do you have from 1 - 3?");
        typeOfPetInput = console.getStringInput("Please select between Pets: | Cat | or | Dog | or | Mouse | ");
        nameOfPetInput = console.getStringInput("What are the names of your pet or pets?");
        System.out.println("You have " + numberOfPetInput + " pet(s)." + " The types of pet(s) you have are "
                + typeOfPetInput + "." + " The name of your pet(s) are ");
        petType();
    }

    private String getWelcomeScreen() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to Talking Pets!\n")
                .append("\nPlease press enter to begin")
                .toString());
    }

    public static void petType() {
        if (typeOfPetInput.equals("Cat")) {
            catList.add(nameOfPetInput);
            System.out.println(nameOfPetInput + " and the sound your pet makes is " + cat.speak() + ".");
        } else if (typeOfPetInput.equals("Dog")) {
            dogList.add(nameOfPetInput);
            System.out.println(nameOfPetInput + " and the sound your pet makes is " + dog.speak() + ".");
        } else if (typeOfPetInput.equals("Mouse")) {
            mouseList.add(nameOfPetInput);
            System.out.println(nameOfPetInput + " and the sound your pet makes is " + mouse.speak() + ".");
        }

    }

}





/*

Part 3:
Modify your program from part 1 to use the Pet class and its subclasses. Keep a list of the pets your user
lists and at the end of the program print out a list of their names and what they say when they speak.
 */