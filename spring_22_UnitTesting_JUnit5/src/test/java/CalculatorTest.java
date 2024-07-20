import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add(){
        System.out.println("Add Method");

    }
    @Test
    void testCase1(){
        System.out.println("Test Case 1");
      //  assertTrue(Calculator.operator.equals("add"));

    }
    @Test
    void testCase2(){
        System.out.println("Test Case 2");
        int actual  = Calculator.add(2,3);
        assertEquals(5,actual,"Test failed");
        assertEquals("add",Calculator.operator);
    }
}