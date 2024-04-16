import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTestJunit5 {

    @Test
    void testFactorial() {
        assertEquals(1, Main.factorialNumber(0));
        assertEquals(1, Main.factorialNumber(1));
        assertEquals(2, Main.factorialNumber(2));
        assertEquals(6, Main.factorialNumber(3));
        assertEquals(24, Main.factorialNumber(4));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorialNumber(-1));
    }
}
