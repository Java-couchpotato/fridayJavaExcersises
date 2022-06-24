package telran.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//
//    //2.Найти минимальное количество платформ, требующихся для приема поездов на жд станции.
//    //Дано время прибытия и отправки поездов .  List arrivals упорядочен
//    public int minPlatforms(List arrivals,List departures){
//        return 0;
public class Exercises {
    ////1.Есть лист положительных целых чисел нечетной длины >=3.
//    // Известно, что существует индекс элемента этого листа такой, что сумма всех элементов слева от него
//    // равняется сумме всех элеменотов справа от него. Найти этот индекс.
//    //3,2 1 4 1

    //3.Given a String, write method to check if all its characters are unique. The string consists only of English letters.
    //Solve the task at least by two different ways:
    //
    //by using methods of String class
    //by using ascii value of characters.


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 1, 4, 1);
        System.out.println(findElement(list));
    }
    public static int minPlatform(List<Integer>arrivals,List<Integer>depatures){
        Collections.sort(depatures);
        int max=0;
        int counterP=0;

        int i = 0;
        int j = 0;

        while(i< arrivals.size()&& j< depatures.size()){
            if (arrivals.get(i)<depatures.get(i)){
                counterP++;
                i++;
                if (counterP>max){
                    max=counterP;
                }
            }else {
                counterP--;
                j++;
            }
        }
        return max;
    }

    static int findElement(List<Integer> list) {
        int sum = 0;
        int index = -1;
        int numAtLastIndex = list.get(list.size()-1);
        int LastPossIndex = list.size()-2;


        for (int i = 0; i < list.size()-1; i++) {
            sum += list.get(i);
        }

        for (int i = LastPossIndex; i > 0; i--) {
            if (sum == numAtLastIndex) {
                index = i;
            } else {
                System.out.println(numAtLastIndex);
                numAtLastIndex = numAtLastIndex+ list.get(i);
                System.out.println(numAtLastIndex+"  after");
                sum-= list.get(i+1);
                System.out.println("sum after "+sum);
            }
        }
        return index;

    }

    public int minPlatforms(List arrivals, List departures) {
        return 0;
    }
}


