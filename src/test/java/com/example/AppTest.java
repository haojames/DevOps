package com.example;


/**
 * Unit test for simple App.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello Jenkins!", hw.sayHello());
    }
}
