package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void setNameTest() {
        // Given
        Pet pet = new Pet();
        String expected = "Random pet name";

        //When
        pet.setName(expected);
        String actual = pet.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = null;

        // When
        Pet pet = new Pet();

        // Then
        String actualName = pet.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Felix";

        // When
        Pet pet = new Pet(expected);

        // Then
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        // Given
        Pet pet = new Pet();
        String actual = "speak";

        //Then
        Assert.assertEquals(actual,pet.speak());
    }
}