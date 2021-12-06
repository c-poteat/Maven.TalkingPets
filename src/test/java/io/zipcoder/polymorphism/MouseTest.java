package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;


public class MouseTest {

    @Test
    public void inheritanceTest() {
        Mouse mouse = new Mouse();
        Assert.assertTrue(mouse instanceof Pet);
    }

    @Test
    public void mouseSetName() {
        // Given
        Mouse mouse = new Mouse();
        String expected = "Jerry";

        //When
        mouse.setName(expected);
        String actual = mouse.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Jerry";

        // When
        Mouse mouse = new Mouse(expected);

        // Then
        String actual = mouse.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mouseSpeakTest() {
        // Given
        Mouse mouse = new Mouse();
        String actual = "squeak";

        //Then
        Assert.assertEquals(actual,mouse.speak());
    }

}