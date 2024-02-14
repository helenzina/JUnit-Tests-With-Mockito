import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulatorTest{

    StringManipulator stringManipulator;

    @Before
    public void setUp(){
        stringManipulator= new StringManipulator();
    }

    @Test
    public void testReverseString() {
        String actual= stringManipulator.reverseString("hello");
        String expected= "olleh";
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseStringWhenManyStrings() {
        String actual= stringManipulator.reverseString("hello world");
        String expected= "dlrow olleh";
        assertEquals(expected, actual);
    }

    @Test (expected= Exception.class)
    public void testReverseStringWhenInputIsNull() {
        String actual= stringManipulator.reverseString(null);
    }

    @Test
    public void testReverseStringWhenInputIsEmptyString() {
        String actual= stringManipulator.reverseString("");
        String expected= "";
        assertEquals(expected, actual);
    }

}

