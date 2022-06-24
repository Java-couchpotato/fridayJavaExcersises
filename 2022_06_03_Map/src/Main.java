import java.util.*;

public class Main {

    public static List<String> showAnagramm(String str, List<String> strings) {
        List<String> anagramms = new ArrayList<>();
        for (String name : strings) {
            if (name.equals(str)) {
                anagramms.add(name);
            }
            if (isAnagramm(str, name) && !name.equals(str)) {
                anagramms.add(name);
            }

        }
        return anagramms;

    }

    static boolean isAnagramm(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //3. Написать метод, который принимает список имен и их анаграмм и имя по
    // которому он выдает список всех его анаграмм, включая само имя
    //  public List<String>anagramList(String str, List<String>strings)
    //{"ivan","airam","vani","vian","maria","kolya"}, ivan -> {ivan,vani,vian}
    public List<String> anagrammList(String string, List<String> strings) {
        Map<String, List<String>> anagramm = new HashMap<>();
        for (String s : strings) {
            String sortedKey = sortAnagramm(s);
            if (anagramm.containsKey(sortedKey)){
                List<String>value = anagramm.get(sortedKey);
                value.add(s);
                anagramm.put(sortedKey,value);
            }
            else{
                List<String>value = new ArrayList<>();
                value.add(s);
                anagramm.put(sortedKey,value);
            }
        }
        return anagramm.get(sortAnagramm(string));
    }

        private String sortAnagramm (String str){
        char[]chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
        }
        //написать метод, возвращающий элемент из списка, встречающийся наибольшее количество раз
// 1,5, -10,1-> 1
// public int findMaxOccuredElt(List<Integer> numbers)


        //написать метод, возвращающий элемент из списка не имеющий пары
//public int findSingleNumber(List<Integer>numbers)
// 1,2,1->2,  1,1,1->1

        //4. Написать метод "validate"  который принимает возраст человека и бросает "InvalidAgeException"
        // если возраст меньше 18 а в противном случае выводит на экран надпись "welcome to vote"

    public

    }