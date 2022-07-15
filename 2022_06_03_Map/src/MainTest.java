import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class MainTest {
    List<String> actual;
    private Main2 main;

    @BeforeEach
    public void init() {
        main = new Main2();
        actual = new ArrayList<>();
        actual.add("ivan");
        actual.add("mara");
        actual.add("vian");
        actual.add("vani");
        actual.add("aram");
        actual.add("aram");
        actual.add("petr");
    }

    public void no_anagramm() {
        assertEquals(null, main.anagrammList("rob", actual));
    }
}