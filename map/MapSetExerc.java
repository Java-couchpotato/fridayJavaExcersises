package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSetExerc {
    public static void main(String[] args) {

    }

    //3.Дан список имен, где некоторые имена повторяются. написать метод, который по имени вернет количество
// вхождений этого имени в список
    //public static int nameByNumberOccurence(List<String> list, String name) Vasia->3

    public static int nameByNumberOccurence(List<String> list, String name) {

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

