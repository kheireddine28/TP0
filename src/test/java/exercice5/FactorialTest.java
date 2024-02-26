package exercice5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    // premier classe d'equivalence le nombre est negative
    void factorialIsNegative() {
        assertThrows(IllegalArgumentException.class,() ->Factorial.factorial(-3));
    }
    @Test
        // deuxieme classe d'equivalence le nombre est quelquenque
    void factorialIsPositive() {
       assertEquals(6,Factorial.factorial(3));
    }

}