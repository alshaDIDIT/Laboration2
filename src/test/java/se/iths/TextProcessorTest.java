package se.iths;

import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class TextProcessorTest {

    @AfterEach
    void init() {
        System.out.println("Test efter varje test");
    }

    @RepeatedTest(2)
    @DisplayName("Uppercase")
    public void upperCaseTest() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue("HEJ PONTUS!".equals(textProcessor.upperCase("Hej Pontus!")));
        System.out.println("Success");
    }

    @Disabled
    @DisplayName("Lowercase")
    public void lowerCaseTest() {
        TextProcessor textProcessor = new TextProcessor();
        assertFalse("HEJ PONTUS!".equals(textProcessor.lowerCase("Hej Pontus!")));
        assertNull("");
    }

    @RepeatedTest(4)
    @DisplayName("Reversed")
    public void backwardsTest() {
        TextProcessor textProcessor = new TextProcessor();
        assertTrue("!sutnoP jeH".equals(textProcessor.backwards("Hej Pontus!")));
        assertNotNull("Hej Pontus!");
        System.out.println("Success");
    }

}
