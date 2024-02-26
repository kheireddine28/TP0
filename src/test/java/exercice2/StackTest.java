package exercice2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
   private static  Stack s;
  @BeforeEach
  void setup(){
      s = new Stack();
  }
    @Test
    //premier classe d'equvalence est que la pile est ajouter les elements
    void pushisShouldAddElementtoTopOfStack() {
        s.push(3);
        assertEquals(1,s.size());
        assertEquals(3,s.peek());
    }
    @Test
    void pushShouldExpaindIsStackIsFull(){
        for (int i=0;i<10;i++) {
            s.push(i);
        }
        assertEquals(10,s.size());
        s.push(12);
        assertEquals(11,s.size());
        assertEquals(12,s.peek());
    }
    @Test
    @DisplayName("verifier fonction pop")
    void popIsStackFonctionneBien() {
        s.push(2);
        int result = s.pop();
        assertEquals(2,result);
    }
    @Test
    void popIsVide(){
        assertThrows(IllegalStateException.class,() ->s.pop());
    }
    @Test
    void peekIsVide() {
        //classe d'equivalence 1 pile vide
        assertThrows(IllegalStateException.class,() ->s.peek());

    }
    @Test
    void peekIsPasVide() {
        //classe d'equivalence 2 pile pas vide
        s.push(3);
        assertEquals(3,s.peek());
        assertEquals(1,s.size());


    }


    @Test
    void isEmpty() {
        //classe d'equivalence 1 pile vide
        boolean b=s.isEmpty();
        Assertions.assertTrue(b);

    }
    @Test
    void IsPilePasVide(){
        //classe d'equivalence 1 pile pas vide
        s.push(5);
        boolean b1=s.isEmpty();
        Assertions.assertFalse(b1);
    }

    @Test
    void sizeIsSeprieur() {
        //classe d'equivalence 1 seperieur 10
        for (int i=0;i<=10;i++) {
            s.push(i);
        }
        int result = s.size();
        assertEquals(11,result);
    }
    @Test
    void sizeIsInferieur(){
        //categorie 2 inferieur a 10
        for (int i=0;i<=5;i++) {
            s.push(i);
        }
        int result1 = s.size();
        assertEquals(6,result1);
    }
}