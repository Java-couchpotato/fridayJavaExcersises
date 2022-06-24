package telran.practice;

import java.util.Random;
import java.util.Scanner;

//  * -Класс GameGuessNumber должен содержать две статические переменные scanner для ввода чисел с
////        * клавиатуры и secret, в которой записано секретное число
////        * -Класс GameGuessNumber должен содержать следующие методы (могут быть и другие по
////        * желанию): int readNumberOfAttempts()-считывает количество предоставляемых попыток
////        *           int readNumber() - считывает вводимое число
////        *           void guessNumber(int attempts) содержит логику игры
public class GameGuessNumber {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static int secret = random.nextInt(10);
    static int scanner;
    static int count = 0;

    int readNumberOfAttempts() {
        if (scanner != secret) {
            ++count;
            System.out.println(count +"попыток");
        }
        return count;
    }

    int readNumber() {
        scanner = sc.nextInt();
        return scanner;
    }

    void guessNumber(int attempts) {
        System.out.println(secret);
        readNumber();
        for (int i = 0; i <=attempts; i++) {
            readNumberOfAttempts();
            if (scanner > secret) {
                System.out.println("too big, next number");
                readNumber();
            } else if (scanner < secret) {
                System.out.println("too low, next number");
                readNumber();
            } else {
                System.out.println("correct number");
                break;
            }

        }

    }
}
