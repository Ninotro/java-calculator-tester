package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    @Test
    void add() {
        float x = Calculator.add(10,5);
        assertEquals(15,x);
        assertNotEquals(12,x);



    }

    @Test
    void substract() {
        float x = Calculator.subtract(10,3);
        assertEquals(7,x);
        assertNotEquals(12,x);
    }

    @Test
    void divide() {
        float x = Calculator.divide(10,2);
        assertEquals(5,x);
        assertNotEquals(4,x);
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(10,0);
        } );


        }
        @Test
        void multiply() {
            float x = Calculator.multiply(2,10);
            assertEquals(20,x);
            assertNotEquals(30,x);
    }


//    assertThrows(IllegalArgumentException.class,()-> Calculator.add(5,) )
}
