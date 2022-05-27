package map;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapSetExercTest {
    MapSetExerc mapSetExerc = new MapSetExerc();
    Map<String, String> map = new HashMap<>();

    @Test
    public void sumKey_containsElts() {
        map.put("a", "Hi");
        map.put("b", "There");
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        map2.put("b", "There");
        map2.put("ab", "HiThere");
        assertEquals(map2, mapSetExerc.sumKey(map));
    }

    @Test
    public void sumKey_containsMoreElts() {
        map.put("a", "Hi");
        map.put("b", "There");
        map.put("C", "There");
        map.put("bA", "There");
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        map2.put("b", "There");
        map2.put("C", "There");
        map2.put("bA", "There");
        map2.put("ab", "HiThere");
        assertEquals(map2, mapSetExerc.sumKey(map));
    }

    @Test
    public void sumKey_alreadyContains_abKey() {
        map.put("a", "Hi");
        map.put("b", "There");
        map.put("ab", "HiThere");
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        map2.put("b", "There");
        map2.put("ab", "HiThere");
        assertEquals(map2, mapSetExerc.sumKey(map));
    }

    @Test
    public void sumKey_NotContainsKey() {
        map.put("a", "Hi");
        map.put("C", "There");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        map2.put("C", "There");

        assertEquals(map2, mapSetExerc.sumKey(map));
    }

    @Test
    public void checkReplications_1() {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b");
        Map<String, Boolean> map2 = new HashMap<>();
        map2.put("a",true);
        map2.put("b",true);
        map2.put("c",false);

        assertEquals(map2,mapSetExerc.checkReplications(list));
    }


}