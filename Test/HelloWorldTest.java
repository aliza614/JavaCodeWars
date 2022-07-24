import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getName() throws Exception{
        HelloWorld john=new HelloWorld("John");
        assertEquals("John",john.getName());
    }
}