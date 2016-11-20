import org.junit.Test

import static org.junit.Assert.assertEquals

public class TestHelloWorld {

    @Test public void testMessage() {
        HelloWorld unit = new HelloWorld();
        assertEquals("Hello Groovy!", unit.message())
    }
}