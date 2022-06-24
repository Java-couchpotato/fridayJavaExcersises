import lambdas.*;

public class Main {
//    //-Написать следующие лямбды и интерфейсы, которые они будут использовать:
//            *
//            * интерфейсы: Cheсkable, Printable, Producable,StringConcate,Transformable (для некоторых выражений
//            * используется один и тот же интерфейс)
    public static void main(String[] args) {

        // * 1.конкатинировать строки a и b=ab
        StringConcate stringConcate = (a, b) -> Integer.toString(a) + b;
        System.out.println(stringConcate.concat(10, 24));

        //* 2.ecли длина строки = 3 вернуть true иначе false
        Checkable str = s -> s.length() == 3;
        System.out.println(str.check("abcd"));

        // * 3.ecли длина строки = 4 вернуть true иначе false
        Checkable str2 = s -> s.length() % 2 == 0;
        System.out.println(str.check("abcd"));
        //  * 4.вернуть строку в верхнем регистре
        Transformable tr = s -> s.toUpperCase();
        System.out.println(tr.modify("sdkjfgi"));

        //* 5.если длина строки 4 вернуть четыре звездочки иначе вернуть строку без изменений
        Transformable tr2 = s -> s.length() == 4 ? "****" : s;
        System.out.println(tr2.modify("jdjddjjdf"));
        System.out.println(tr2.modify("jddf"));

        //* 6.распечатать строку в виде !строка!
        Printable pr = s-> System.out.println("!"+s+"!");
        pr.print("sdjh");
        //  * 7. печатает "Hello World"
        Pruducable pr2 = ()-> "Hello World";
        System.out.println(pr2.produce());
    }
}