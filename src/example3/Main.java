package example3;

import java.util.function.Function;

public class Main {
    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY YEAR"));
    }
    private static void printResultOfLambda() {
        //System.out.println(function.apply("HAPPY YEAR"));
        System.out.println("HAPPY YEAR");
    }
    public static void oneMoreMethod(Function<String, Integer> f) {
        System.out.println(f.apply("string"));
    }

    public static void oneMoreMethod2(Function<Integer, Integer> f) {
        System.out.println(f.apply(4));
    }

    public static void main(String[] args) {
        Function<String, Integer> function = s -> s.length();
        Function<Integer, Integer> function2 = i -> ++i;
        printResultOfLambda();
        printResultOfLambda(function);
        oneMoreMethod(function);
        oneMoreMethod2(function2);

        // вложили без ссылки
        printResultOfLambda(s -> s.length());

    }
}
