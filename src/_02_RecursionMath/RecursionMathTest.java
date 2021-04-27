package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4))
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(16, RecursionMath.recursiveDivision(32, 2));
    	assertEquals(5, RecursionMath.recursiveDivision(30, 6));
    	assertEquals(13, RecursionMath.recursiveDivision(91, 7));
    	
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(8, RecursionMath.recursivePower(2, 3));
        assertEquals(25, RecursionMath.recursivePower(5, 2));
        assertEquals(7776, RecursionMath.recursivePower(6, 5));
    }
}
