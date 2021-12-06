package io.zipcoder.polymorphism;

public class TalkingPetsApp {

    private final IOConsole console = new IOConsole(AnsiColor.RED);

    public void run() {
    getPetInputFromUser();
    getPetTypeFromUser();
    getPetNameFromUser();

    }

    private String getPetInputFromUser() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to Talking Pets!\n")
                .append("\nPlease tell us how many Pets you have?")
                .toString());
    }

    private String getPetTypeFromUser() {
        return console.getStringInput(new StringBuilder()
                .append("What kind of Pets do you have?")
                .toString());
    }
    private String getPetNameFromUser() {
        return console.getStringInput(new StringBuilder()
                .append("What are the names of your Pets?")
                .toString());
    }
}

