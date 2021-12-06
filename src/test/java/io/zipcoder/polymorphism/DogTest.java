package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;


public class DogTest {

    @Test
    public void inheritanceTest() {
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Pet);
    }
    @Test
    public void dogSetName() {
        // Given
        Dog dog = new Dog();
        String expected = "Spike";

        //When
        dog.setName(expected);
        String actual = dog.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dogSpeakTest() {
        // Given
        Dog dog = new Dog();
        String actual = "woof";

        //Then
        Assert.assertEquals(actual,dog.speak());
    }
    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Fido";

        // When
        Dog dog = new Dog(expected);

        // Then
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
}