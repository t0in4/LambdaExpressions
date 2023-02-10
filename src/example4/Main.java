package example4;

import java.util.function.Function;

public class Main {

    public static void printResultOfLambda(Function<String, Integer> f) {
        System.out.println(f.apply(new java.util.Scanner(System.in).nextLine() ));
    }

    public static void main(String[] args) {
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });
    }
}
