import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzPrinterShould {

    private FizzBuzzPrinter target;

    @BeforeEach
    void setUp() {
        target = new FizzBuzzPrinter();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "3, Fizz",
            "4, 4",
            "5, Buzz",
            "6, Fizz",
            "8, 8",
            "9, Fizz",
            "10, Buzz",
            "15, FizzBuzz",
            "30, FizzBuzz"
    }) void
    print_out_the_expected_output(int input, String output) {
        assertEquals(target.print(input), output);
    }
}
