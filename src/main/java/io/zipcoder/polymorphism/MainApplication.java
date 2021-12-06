package io.zipcoder.polymorphism;

import static io.zipcoder.polymorphism.Pet.list;

public class MainApplication {
    private static String nameOfPetInput;
    private static IOConsole console = new IOConsole(AnsiColor.RED);

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.getWelcomeScreen();

        String numberOfPetInput = console.getStringInput("\nHow many pets do you have?");
        String typeOfPetInput = console.getStringInput("What are the type of pets you have?");
        nameOfPetInput = console.getStringInput("What are the names of your pets?");
        System.out.println("You have " + numberOfPetInput + " pet(s)." + " The types of pet(s) you have are "
                + typeOfPetInput + "." + " The name of your pet(s) are " + nameOfPetInput + ".");
        if (nameOfPetInput.equals("Cat")) {
            list.add(nameOfPetInput);

        }
        System.out.println(list);
    }
    private String getWelcomeScreen() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to Talking Pets!")
                .append("\nPlease press enter to begin")
                .toString());
    }

}






/*

Part 3:
Modify your program from part 1 to use the Pet class and its subclasses. Keep a list of the pets your user
lists and at the end of the program print out a list of their names and what they say when they speak.
 */