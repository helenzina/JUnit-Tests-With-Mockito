import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {

    CalculatorService calculatorService;
    Calculator calculator;

    @Before
    public void setUp(){
        calculatorService= Mockito.mock(CalculatorService.class);
        calculator= new Calculator(calculatorService);
    }

    @Test
    public void testAdd(){
        Mockito.when(calculatorService.add(1,2)).thenReturn(3);
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void testSub(){
        Mockito.when(calculatorService.subtract(1,2)).thenReturn(-1);
        assertEquals(-1, calculator.subtract(1,2));
    }

    @Test
    public void testMul(){
        Mockito.when(calculatorService.multiply(1,2)).thenReturn(2);
        assertEquals(2, calculator.multiply(1,2));
    }

    @Test
    public void testDiv(){
        Mockito.when(calculatorService.divide(1,2)).thenReturn(0.5);
        assertEquals(0.5, calculator.divide(1,2), 1);
    }

    @Test (expected = Exception.class)
    public void testDivWithZero(){
        Mockito.doThrow(new Exception("Cant divide with 0")).when(calculatorService.divide(1,0));
    }

    @After
    public void teardown(){
        calculator= null;
    }

}