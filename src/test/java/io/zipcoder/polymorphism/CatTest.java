package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;


public class CatTest {

    @Test
    public void inheritanceTest() {
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void catSetName() {
        // Given
        Cat cat = new Cat();
        String expected = "Tom";

        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Tom";

        // When
        Cat cat = new Cat(expected);

        // Then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        // Given
        Cat cat = new Cat();
        String actual = "meow";

        //Then
        Assert.assertEquals(actual,cat.speak());
    }
}