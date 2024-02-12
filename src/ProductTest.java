import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void setUp(){
        product= new Product();
    }

    @Test
    public void testBreakupString() throws Exception{
        String example= "GR-12AEW-433A";
        List<String> actual= product.breakupString(example);
        List<String> expected= new ArrayList<>();
        expected.add("GR");
        expected.add("12AEW");
        expected.add("433A");
        assertEquals(expected, actual);
        //me array:
        // List<String[]> expected = Arrays.asList(new String[]{"GR"},
        // new String[]{"12AEW"},
        // new String[]{"433A"});
    }

    @Test (expected = Exception.class)
    public void testBreakupStringWhenWrongFormat() throws Exception{
        String example= "sdasfdf";
        List<String> actual= product.breakupString(example);
    }

    @After
    public void tearDown(){
        product= null;
    }
}
