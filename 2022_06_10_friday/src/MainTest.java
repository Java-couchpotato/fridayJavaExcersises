import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {
    Main mt = new Main();

    @Test
    public void multiple() {
        List<Integer> list = Arrays.asList(1, 9, 2, 18, 3, 6, 0, 25);
        int n = 18;
        assertTrue(String.valueOf(true), mt.multiple(list,n));
    }


}