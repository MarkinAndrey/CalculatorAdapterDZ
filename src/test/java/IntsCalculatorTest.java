import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IntsCalculatorTest {

    @ParameterizedTest
    @CsvSource({"3, 5",
            "-1, 1",
            "1, -1",
            "-1, -1",})
    void sum(int arg1, int arg2) {
        Ints intsCalc = new IntsCalculator();
        int result = arg1 + arg2;

        assertEquals(result, intsCalc.sum(arg1, arg2));
    }

    @ParameterizedTest
    @CsvSource({"3, 5",
            "-1, 1",
            "1, -1",
            "-1, -1",})
    void sub(int arg1, int arg2) {
        Ints intsCalc = new IntsCalculator();
        int result = arg1 - arg2;

        assertEquals(result, intsCalc.sub(arg1, arg2));
    }

    @ParameterizedTest
    @CsvSource({"3, 5",
            "-1, 1",
            "1, -1",
            "-1, -1",})
    void mult(int arg1, int arg2) {
        Ints intsCalc = new IntsCalculator();
        int result = arg1 * arg2;

        assertEquals(result, intsCalc.mult(arg1, arg2));
    }

    @ParameterizedTest
    @CsvSource({"3, 5",
            "-1, 1",
            "1, -1",
            "-1, -1",
            "1, 0"})
    void div(int arg1, int arg2) throws BadArgException {
        Ints intsCalc = new IntsCalculator();
        if (arg2 != 0) {
            int result = arg1 / arg2;

            assertEquals(result, intsCalc.div(arg1, arg2));
        }
        else {
            assertThrows(BadArgException.class, () -> intsCalc.div(arg1, arg2));
        }
    }

    @ParameterizedTest
    @CsvSource({"3, 5",
            "-1, 1",
            "1, -1",
            "-1, -1",
            "1, 0"})
    void pow(int arg1, int arg2) {
        Ints intsCalc = new IntsCalculator();
        int result =(int) Math.pow(arg1, arg2);

        assertEquals(result, intsCalc.pow(arg1, arg2));
    }
}