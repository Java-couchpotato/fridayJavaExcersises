package string_02_02_22hw;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;



//Given the String like “20*((876/8)+19)” , implements the method that check if the parentheses are correct. Try to solve it yourself without help of Google
//“9*(8+3)-( (9+1)5)” -> true
//“9(8+3)- (9+1)5)” -> false
//“98+3)-( (9+1)*5” -> false
public class Main {
    public static void main(String[] args) {
        int array1[] = {10, 3, 3, 5, -9};
        int exp1[] = {1, 4};
        System.out.println(Arrays.toString(reverseArray(array1)));
        System.out.println(Arrays.toString(reverseArray2(exp1)));

        String[] names = {"ivan", "vasiliy", "andrey", "konstantin", "maria"};
        int[] ages = {2008, 2010, 2000, 1894, 1993};
        int a = 13;
        countAgeName(names, ages, a);

    }

    //Implement a method that returns the new array that is the given array in reverse order
//{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i <= array.length / 2; i++) {
            int b = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = b;

        }
        return array;
    }

    //Implement a method that returns a given array in reverse order. It’s look like previous
//but you should solve it without new array
//{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
    public static int[] reverseArray2(int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return array;
    }
    //Given arrays String[] names and int[ ] yearsOfBirthday of the same length, that contains names and years of birthday of the persons. Every element in yearsOfBirthday is corresponding with element at the same index in names. Implement the program that prints the name and the age of all person who older that given int. Than print the name and age of oldest person.
//For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) ->
//Olga 18 years
//Oleg 40 years
    //*******
//Oleg 40 years is oldest
//

    public static void countAgeName(String[] names, int[] yearsOfBirth, int num) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int max = yearsOfBirth[0];
        int indexOfMax = 0;


        for (int i = 0; i < yearsOfBirth.length; i++) {
            int age = year - yearsOfBirth[i];

            if (age > num) {
                System.out.println("******" + names[i] + " " + age + " years ");
            }

            if (yearsOfBirth[i] < max) {
                max = yearsOfBirth[i];
                indexOfMax = i;
            }
        }
        System.out.println(names[indexOfMax] + " " + (year - yearsOfBirth[indexOfMax]) + " years");
    }

}
