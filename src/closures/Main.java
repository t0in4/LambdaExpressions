package closures;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Другой важный трюк с лямбда выражениями это возможность захвата
        // из контекста где лямбда выражение объявлено и использовать значения
        // внутри тела - техника называется closures
        // Захват переменной возможет, только если она константа (final ) или
        // она по факту не изменяется во время выполнения всего блока кода (effectively final)

        // пример с final константой
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;
        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));

        // пример с фактически константой (effectively final)
        int constant = 100;
        Function<Integer, Integer> adder100 = x -> x + constant;
        //constant++;
        System.out.println(adder100.apply(200));
        System.out.println(adder100.apply(300));



    }
}
