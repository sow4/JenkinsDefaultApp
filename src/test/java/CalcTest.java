import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void shouldProperAdd() {
        Calc calc = new Calc();

        int result = calc.add(2,3);

        assertEquals(6, result);
    }

    @Test
    void shouldProperSub() {
        Calc calc = new Calc();

        int result = calc.sub(6,3);

        assertEquals(3, result);
    }
}