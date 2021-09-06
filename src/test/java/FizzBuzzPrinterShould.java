import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzPrinterShould {

    private FizzBuzzPrinter target;

    @BeforeEach
    void setUp() {
        target = new FizzBuzzPrinter();
    }

    @Test void
    print_out_the_number_one() {
        assertEquals(target.print(1), "1");
    }

    @Test void
    print_number_three_to_fizz() {
        assertEquals(target.print(3), "Fizz");
    }

    @Test
    void print_number_five_to_buzz() {
            assertEquals(target.print(5), "Buzz");
        }

    @Test
    void name() {
    }
}
