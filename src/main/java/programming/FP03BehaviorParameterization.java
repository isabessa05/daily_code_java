package programming;

import java.util.List;

public class FP03BehaviorParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        numbers.stream()
                .filter(x -> x%2==0)
                .forEach(System.out::println);

        numbers.stream()
                .filter(x -> x%2!=0)
                .forEach(System.out::println);
    }
}
