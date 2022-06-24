package lambdasStandart;

import java.util.function.*;

public class Lambdas {


    public static void main(String[] args) {
        //* 1.конкатинировать строки a и b=ab
        BiFunction<String ,String,String > f = (a, b)-> a.concat(b);

        //* 2.ecли длина строки = 3 вернуть true иначе false
        Predicate<String>p = s->s.length()==3?true:false;
        System.out.println(f.apply("a","b"));
        //* 3.ecли длина строки = 4 вернуть true иначе false
        Predicate<String>p2 = s->s.length()==4?true:false;
        System.out.println(p2.test("train"));
        System.out.println(p2.test("trap"));
        //* 4.вернуть строку в верхнем регистре
        Function<String,String>s = k->k.toUpperCase();
        System.out.println(s.apply("fantastic"));
        //* 5.если длина строки 4 вернуть четыре звездочки иначе вернуть строку без изменений
        Function<String,String>s2 = sa->sa.length()==4?"****":sa;
        System.out.println(s2.apply("ab"));
        System.out.println(s2.apply("abad"));
        //* 6.распечатать строку в виде !строка!
        Consumer<String>s3 =s1-> System.out.println("!"+s1+"!");
        s3.accept("mama");
        //* 7. печатает "Hello World"
        Supplier s4 = ()-> "Hello world";
        System.out.println(s4.get());


    }

}
