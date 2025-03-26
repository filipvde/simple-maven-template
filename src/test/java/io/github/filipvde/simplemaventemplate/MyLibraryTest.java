package io.github.filipvde.simplemaventemplate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLibraryTest {
    @Test
    void testGreet() {
        assertEquals("Hello, John!", MyLibrary.greet("John"));
    }
}