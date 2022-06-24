package telran.practice.day;

////1.написать программу , которая при вводе с клавиатуры дня недели отвечает
//    // на вопрос является ли этот день выходным.
//    // ( для выходного ответ it is true ,для рабочего it is false.
//    // Использовать в решении класс типа ENUM .
//    // Вам может понадобиться метод этого класс valueOf
//    // DayOfWeek day=DayOfWeek.valueOf("Wednesday");


enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

}
public class DayOfTheWeek {


    private Day dayOfWeek;

    public DayOfTheWeek(Day dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Day getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Day dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void checkDay() {
        String s="";
        switch (dayOfWeek) {
            case Sunday:
                s="it is true";
                System.out.println(s);
                break;
            case Saturday:
                s="it is true";
                System.out.println(s);
                break;
            default:
                s="it is false";
                System.out.println(s);
                break;
        }

    }

}

