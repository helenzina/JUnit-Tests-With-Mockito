import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListTransformerTest {
    List<String> inputList;
    ListTransformer listTransformer;

    @Before
    public void setUp(){
        inputList= new ArrayList<>();
        listTransformer= new ListTransformer();
    }

    @Test
    public void testTransformList(){
        inputList.add("abc");
        inputList.add("hello");
        inputList.add("world");
        List<String> actual= listTransformer.transformList(inputList);
        List<String> expected= new ArrayList<>();
        expected.add("ABC");
        expected.add("HELLO");
        expected.add("WORLD");
        assertEquals(expected, actual);
    }

    @Test
    public void testTransformListWhenInputListIsEmpty(){
        List<String> actual= listTransformer.transformList(inputList);
        assertEquals(inputList, actual);
    }

    @Test (expected= Exception.class)
    public void testTransformListWhenStringIsNull(){
        inputList.add(null);
        List<String> actual= listTransformer.transformList(inputList);
    }

    @Test
    public void testTransformListWhenStringHasUpperCase(){
        inputList.add("Abc");
        inputList.add("Hello");
        inputList.add("World");
        List<String> actual= listTransformer.transformList(inputList);
        List<String> expected= new ArrayList<>();
        expected.add("ABC");
        expected.add("HELLO");
        expected.add("WORLD");
        assertEquals(expected, actual);
    }

    @After
    public void teardown(){
        listTransformer= null;
        inputList.clear();
    }
}