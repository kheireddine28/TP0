package exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {


    @Test
    void fibonacciIsNegative() {

        assertThrows(IllegalArgumentException.class,() ->Fibonacci.fibonacci(-1) );
    }
    @Test
    void fibonacciIsZero(){
        assertEquals(0,Fibonacci.fibonacci(0));
    }
    @Test
    void fibonacciIsUN(){
        assertEquals(1,Fibonacci.fibonacci(1));
    }
    @Test
    void fibonacciIsAutre(){
        assertEquals(3,Fibonacci.fibonacci(4));
    }

}