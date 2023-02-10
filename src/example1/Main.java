package example1;

import java.util.function.BiFunction;

public class Main {
    // как бы у нас выглядела метод как лямбда
    public static boolean isDivisible(int x, int y) {
        return x % y == 0;
    }

    public static void main(String[] args) {
        // однострочное лямбда выражение которое проверяет делится ли нацело
        // первое число на второе число
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;
        System.out.println("Java метод: " + isDivisible(3, 5));
        System.out.println("Лямбда функция: " + isDivisible.apply(3, 5));
    }
}
