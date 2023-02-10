package example2;
import java.util.function.*;
public class Main {

    // если один аргумент, то () - опциональны
    Function<Integer, Integer> adder1 = x -> x + 1;

    // С принудительной поддержкой типа
    Function<Integer, Integer> mult2 = (Integer x) -> x * 2;

    // множественные выражения
    Function<Integer, Integer> adder5 = (x) -> {
        x += 2;
        x += 3;
        return x;
    };

}
