package lambdas3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lambdas2Test {
    String input;
    Predicate<String> predicate;
    Function<String, String> function;
    private Lambdas2 solution;

    @BeforeEach
    public void init() {
        solution = new Lambdas2();
        input = "mama MYLA ramu try RazA";
    }

    @Test
    void changeString_empty() {
        input = "";
        predicate = s -> s.length() == 3;
        function = s -> s.toLowerCase();

        assertEquals(input, solution.changeString(input, function, predicate));
    }

    @Test
    void changeString_toLowerCase3() {
        predicate = s -> s.length() == 3;
        function = String::toLowerCase;

        assertEquals(input, solution.changeString(input, function, predicate));
    }

    @Test
    void changeString_toUpperCase3() {
        input="mama MYLA ramu TRY RazA";
        predicate = s -> s.length() == 3;
        function = String::toUpperCase;

        assertEquals(input, solution.changeString(input, function, predicate));
    }

    @Test
    void changeString_toLowerCase4() {
        input = "mama myla ramu try raza";
        predicate = s -> s.length() == 4;
        function = String::toLowerCase;

        assertEquals(input, solution.changeString(input, function, predicate));
    }


    @Test
    void changeString_toUpperCase4() {
        input="MAMA MYLA RAMU try RAZA";
        predicate = s -> s.length() == 4;
        function = String::toUpperCase;

        assertEquals(input, solution.changeString(input, function, predicate));
    }


    @Test
    void changeString_toStars() {
        predicate = s -> s.length() == 5;
        function = s->s="*****";

        assertEquals(input, solution.changeString(input, function, predicate));
    }
}