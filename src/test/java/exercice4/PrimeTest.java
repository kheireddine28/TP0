package exercice4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    //oremier classe d'equivalence infrieur a 2
    void isPrimeInferieurADeux() {
        assertFalse(Prime.isPrime(1));

    }
    //dexieme classe d'equivalence seperieur a 2
    @Test

    void isPrimeSeperieurADeux() {
        assertTrue(Prime.isPrime(3));

    }
    //troisieme classe d'equivalence seperieur a 2 et pas premier
    @Test

    void isPrimeSeperieurADeuxEtPremier() {
        assertFalse(Prime.isPrime(16));

    }

}