package map;

import java.util.*;

public class MapSetExerc {
    public static void main(String[] args) {

    }
    //6.Есть массив с положительными целыми числами. найти элемент(если он есть), который встречается
    //        // в массиве > length/2  (доминантный). В противном случае вернуть -1

    public static int findDominant(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > list.size() / 2) {
                return key;
            }
        }
        return -1;
    }


    //4. С использованием множеств написать метод, который вернет список без повторяющихся элементов
    // List<String> removeDuplicates(List<String>input
    // {Ivan,Maria,Piotr,Anna,Maria,Ivan}->{Ivan,Maria,Piotr;Anna}
    public static List<String> removeDuplicates(List<String> input) {
        Set<String> set1 = new HashSet<>();
        for (String str : input) {
            set1.add(str);
        }
        List<String> list = new ArrayList<>();
        for (String str : set1) {
            list.add(str);
        }
        return list;
    }


    //5.C использованием множеств написать метод, возвращающий повторяющиеся элементы из списка
    // List<String> getDuplicates(List<String>input
    // {Ivan,Maria,Piotr,Anna,Maria,Ivan}->{Ivan,Maria}

    public static List<String> getDuplicates(List<String> input) {
        List<String> input2 = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String str : input) {
            if (set.contains(str) && !input2.contains(str)) {
                input2.add(str);
            } else {
                set.add(str);
            }
        }
        return input2;
    }

    //3.Дан список имен, где некоторые имена повторяются. написать метод, который по имени вернет количество
// вхождений этого имени в список
    //public static int nameByNumberOccurence(List<String> list, String name) Vasia->3

    public static int nameByNumberOccurence(List<String> list, String name) {
        Map<String, Integer> map = new HashMap<>();

        for (String i : list) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else map.put(i, 1);
        }
        if (!map.containsKey(name)) {
            return 0;
        }

        return map.get(name);

    }

    //2 Дан не пустой массив строк, вернуть мапу Map<String,Boolean>  где каждая строка является ключом,
//        // а значением является true  если строка в массиве встречается больше одного раза и false  если
//        // только один раз
//        // wordmultiple(["a","b","a","c","b"])->{a:true,b:true, c:false
//        // }

    public static Map checkReplications(List<String> list) {
        Map<String, Boolean> map1 = new HashMap<>();
        for (String str : list) {
            if (map1.containsKey(str)) {
                map1.replace(str, true);
            } else {
                map1.put(str, false);
            }
        }

        return map1;
    }

    //1. Дана Map<String,String>. написать метод, возвращающий мапу такую, что если в исходной мапе
//        // есть ключи "a" и "b" то нужно создать новый ключ "ав" с суммой значений от ключей а и в. Если нет
//        // то ничего не нужно менять
//        //mapAB({"a":"Hi","b":"There"}->{"a":"Hi","ab":HiThere, "b":"There"}
//        //mapAB({"a":"Hi"}-> {a:Hi}
    public static Map sumKey(Map<String, String> map1) {
        String value = null;
        // Map<String, String> map2 = map1;
        if (map1.containsKey("a") && map1.containsKey("b")) {
            value = map1.get("a").concat(map1.get("b"));
            map1.put("ab", value);
        }

        return map1;
    }
}

