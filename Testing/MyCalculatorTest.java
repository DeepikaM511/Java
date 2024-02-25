package Testing;


import org.junit.Test;
import static org.junit.Assert.*;
public class MyCalculatorTest {
    @Test
    public void TestAdd()
    {
        int expected = 10;
        int actual = MyCalculator.add(4,5);
        assertEquals(expected,actual);
    }

}