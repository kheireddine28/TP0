package RomanNumeral_cours;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void convert() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        int result1 = roman.convert("VIII");
        Assertions.assertEquals(1,result);
        Assertions.assertEquals(8,result1);

    }
}