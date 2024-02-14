import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackTest {

    Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testPush() throws Exception {
        stack.push("aaa");
        String actual = stack.pop();
        String expected = "aaa";
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void testPop() throws Exception {
        stack.pop();
    }

    @Test
    public void testIsEmpty() {
        boolean actual = stack.isEmpty();
        assertTrue(actual);
    }

    @After
    public void teardown() {
        stack = null;
    }

}

