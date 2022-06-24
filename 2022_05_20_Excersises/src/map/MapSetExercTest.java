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
        map2.put("a", true);
        map2.put("b", true);
        map2.put("c", false);

        assertEquals(map2, mapSetExerc.checkReplications(list));
    }

    @Test
    public void nameByNumberOccurence_withNameNotFromList() {
        List<String> list = Arrays.asList("Vasya", "Albina", "Vasya", "Timucin", "Albina", "Vasya");
        Map<String, Integer> map2 = new HashMap<>();

        assertEquals(1, mapSetExerc.nameByNumberOccurence(list, "Timucin"));
    }

    @Test
    public void nameByNumberOccurence_oneTime() {
        List<String> list = Arrays.asList("Vasya", "Albina", "Vasya", "Timucin", "Albina", "Vasya");
        Map<String, Integer> map2 = new HashMap<>();

        assertEquals(0, mapSetExerc.nameByNumberOccurence(list, "Tuin"));
    }

    @Test
    public void removeDuplicates_3Duplicates() {
        List<String> list = Arrays.asList("Vasya", "Albina", "Vasya", "Timucin", "Albina", "Vasya");
        List<String> list2 = Arrays.asList("Timucin", "Vasya", "Albina");


        assertEquals(list2, mapSetExerc.removeDuplicates(list));
    }

    @Test
    public void removeDuplicates_noDuplicates() {
        List<String> list = Arrays.asList("Vasya", "Albina", "Vasyak", "Timucin");
        List<String> list2 = Arrays.asList("Vasya", "Albina", "Vasyak", "Timucin");


        assertEquals(list2.size(), mapSetExerc.removeDuplicates(list).size());
    }

    @Test
    public void getDuplicates_2Names() {
        List<String> list = Arrays.asList("Vasya", "Albina", "Vasya", "Timucin", "Albina", "Vasya");
        List<String> list2 = Arrays.asList("Vasya", "Albina");


        assertEquals(list2, mapSetExerc.getDuplicates(list));
    }

    @Test
    public void getDuplicates_noDuplicates() {
        List<String> list = Arrays.asList("Vasya", "Albina", "kasya", "Timucin");
        List<String> list2 = Arrays.asList();


        assertEquals(list2, mapSetExerc.getDuplicates(list));
    }

    @Test
    public void findDominant_element3() {
        List<Integer> list = Arrays.asList(11, 3, 5, 7, 3, 3, 3, 3, 3, 3);
        int expected = 3;

        assertEquals(expected, mapSetExerc.findDominant(list));
    }

    @Test
    public void findDominant_NoElement() {
        List<Integer> list = Arrays.asList(11, 3, 5, 7, 3, 13, 30, 33, 13, 3);
        int expected = -1;

        assertEquals(expected, mapSetExerc.findDominant(list));
    }

}