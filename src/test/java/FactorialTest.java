import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    void testFactorial() {
        Factorial f = new Factorial();
        assertEquals(120, f.getFactorial(5));
    }
}
