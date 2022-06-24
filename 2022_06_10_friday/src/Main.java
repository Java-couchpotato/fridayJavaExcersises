import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    // написать метод, принимающий лист слов,начинающихся с маленькой буквы ,
    // а возвращающий Treemap, ключами которого являются
    // буквы а значениями - листы слов, начинающихся с данной буквы и расположенных
    // в лексикографи-
    //ческом порядке.
    //{hello,world,hell}-> {h:[hell,hello], w:[world]}
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Map<Character, List<String>> getMapOfWords(List<String> words) {
        Map<Character, List<String>> map = new TreeMap<>();

        for (String word : words) {
            Character char1 = word.charAt(0);
            if (!map.containsKey(char1)) {
                map.put(char1, new ArrayList<>());
                map.get(char1).add(word);
            } else {
                map.get(char1).add(word);
            }

        }
        return map;

    }


    //есть лист интов и некое целое число n. Написать метод , проверяющий найдутся ли в листе
    // два такие числа, что их произведение равно числу n. Решить задачу нескольким способами
    // пара способов без использования дополнительных структур данных и вариант с использованием структуры
    //данных ( deque, queue,)


    public static boolean multiple(List<Integer> list, int n) {

        for (int i = 0; i < list.size(); i++) {
            int k = n / list.get(i);
            if (list.contains(k) && k!=list.get(i)){
                return true;
            }
        }
        return false;
    }
}


