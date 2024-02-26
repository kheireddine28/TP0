package exercice1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("getFullName")
    void getFullName() {
        // Arrange
        Person p1 = new Person("messaoudi","kheir eddine",23);
        Person p2 = new Person("boudali","nadjib",17);

        //Act
        String tast1 = p1.getFullName();
        String tast2 = p2.getFullName();

        // Assert
        assertEquals("messaoudi kheir eddine", tast1);
        assertEquals("boudali   nadjib", tast2);


    }

    @Test
    @DisplayName("isAdult")
    void isAdult() {
        // Arrange
        Person p1 = new Person("messaoudi ","kheir eddine ",23);
        Person p2 = new Person("boudali ","nadjib ",17);
        Person p3 = new Person("amrauoi ","chihab ",18);
        //Act
        boolean tast1 = p1.isAdult();
        boolean tast2 = p2.isAdult();
        boolean tast3 = p3.isAdult();
        // Assert
        assertEquals(true, tast1);
        assertEquals(false, tast2);
        assertEquals(true, tast3);

    }
}