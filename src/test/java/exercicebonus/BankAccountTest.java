package exercicebonus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
     static  BankAccount acount;
    @BeforeEach
    void setUp(){
        acount = new BankAccount(4900.20,1.9);
    }

    @Test
        //premiere  classe d'equivalence <
    void depositIsNegative() {
        assertThrows(IllegalArgumentException.class,() ->acount.deposit(-200.20));
    }
    @Test
    //deuixeme classe d'equivalence > positive
    void depositIsPositive() {
     acount.deposit(200.20);
     assertEquals(5100.40,acount.getBalance());
    }

    @Test
    void withdraw() {
    }

    @Test
    void transfer() {
    }

    @Test
    void addInterest() {
    }

    @Test
    void getBalance() {
    }
}