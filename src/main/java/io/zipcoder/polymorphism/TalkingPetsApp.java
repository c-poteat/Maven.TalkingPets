package io.zipcoder.polymorphism;

public class TalkingPetsApp {

    private final IOConsole console = new IOConsole(AnsiColor.RED);

    public void run() {
        getWelcomeScreen();
        String numberOfPetInput = console.getStringInput("\nHow many pets do you have?");
        String typeOfPetInput = console.getStringInput("What are the type of pets you have?");
        String nameOfPetInput = console.getStringInput("Whare the names of your pets?");
        System.out.println("You have " + numberOfPetInput + " pet(s)." + " The types of pet(s) you have are " + typeOfPetInput
                + "." + " The name of your pet(s) are " + nameOfPetInput + ".");

    }

    private String getWelcomeScreen() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to Talking Pets!")
                .append("\nPlease press enter to begin")
                .toString());
    }
}

