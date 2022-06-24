package telran.practice.day;

public class Main {

    public static void main(String[] args) {
	DayOfTheWeek firstDay = new DayOfTheWeek(Day.Friday);
    firstDay.checkDay();
    DayOfTheWeek firstDay1 = new DayOfTheWeek(Day.Sunday);
        firstDay1.checkDay();
    }

    //1.написать программу , которая при вводе с клавиатуры дня недели отвечает
    // на вопрос является ли этот день выходным.
    // ( для выходного ответ it is true ,для рабочего it is false.
    // Использовать в решении класс типа ENUM .
    // Вам может понадобиться метод этого класс valueOf
    // DayOfWeek day=DayOfWeek.valueOf("Wednesday");

    //2. Дана строка, состоящая из слов, разделенных пробелом "aaa BBBB dEfxc"
    // написать метод, позволяющий изменять слова в строке следующим образом:
    // при длине слова =3 , изменить все буквы этого слова на заглавные
    // при длине слова =4 , изменить все буквы этого слова на строчные
    // при длине слова =5 , изменить все буквы слова на звездочки
    // и возвращающий измененную строку
    // пример: дана строка "aaa BBBB dEfxc"
    // при длине слова =3 , изменить все буквы слова на заглавные -> "AAA BBBB dEfxc"
    // при длине слова =4 , изменить все буквы слова на строчные -> "AAA BBBB dEfxc"
    // public static String transform (String str, XXX)
}
