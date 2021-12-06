package io.zipcoder.polymorphism;

public class MainApplication extends TalkingPetsApp {

    public static void main(String[] args) {
    TalkingPetsApp talkingPetsApp = new TalkingPetsApp();
    talkingPetsApp.run();
    }
}

/*
Part 2:
Create a Pet class, and a subclass for each type of pet that you want your program to support. Your classes should
follow the following requirements:

The Pet class must have a speak method that each subclass overrides.
The Pet class must have a name field with setters and getters.
Use the tests provided as examples to write your own tests for other supported types of pets.

Part 3:
Modify your program from part 1 to use the Pet class and its subclasses. Keep a list of the pets your user lists and
at the end of the program print out a list of their names and what they say when they speak.
 */