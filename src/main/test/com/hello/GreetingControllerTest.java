package com.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@ApplicationTest
class GreetingControllerTest {
	GreetingController controller = new GreetingController();

    @Test
    @DisplayName("One add one is two!")
    void myFirstTest() {
    	assertEquals(controller.helloWorld(), "Hello World");
    }

}