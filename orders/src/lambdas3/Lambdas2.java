package lambdas3;

import java.util.function.Function;
import java.util.function.Predicate;

//написать метод, принимающий строку, содержащую слова разделенные пробелом и два
//// функциональных интерфейса  function and predicate. Метод должен предоставлять воз
////можность реализации следующих действий:
//// при длине слова 3 изменить все буквы этого слова на строчные и вернуть измененную строку
//// при длине слова 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
//// при длине слова 4 изменить все буквы этого слова на строчные и вернуть измененную строку
//// при длине слова 4 изменить все буквы этого слова на заглавные и вернуть измененную строку
//// при длине слова 5 изменить все буквы этого слова на звездочки и вернуть измененную строку
// // (т.е.написать лямбду для каждого случая )
public class Lambdas2{

    public String changeString(String input, Function<String,String> function, Predicate<String>predicate){
        String[]str =input.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (predicate.test( str[i])){
                str[i] = function.apply(str[i]);
            }
        }
      return String.join(" ",str);
    }
}
