package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> isEvenPredicate = x -> x%2==0; // A predicate (boolean -valued function) of one argument.
        Predicate<Integer> isEvenPredicate2 = new Predicate <Integer>() { // This is what is happening behind the scenes of the above lambda
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };

        Function<Integer, Integer> squareFunction = x -> x * x; // A function that accepts one argument and produces a result. One input One output

        Consumer<Integer> sysOutConsumer = System.out::println; // Consumer represents an operation that accepts a single input argument adn returns no result.

        /**
         * Functional interface has exactly one abstract method.
         *
         *  numbers.stream()
         *  .filter(isEvenPredicate)
         *  .map(squareFunction)
         *  .forEach(sysOutConsumer);
         **/

        int sum = numbers.stream().reduce(0, Integer::sum);

        BinaryOperator<Integer> sumBinaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) { // apply is a function discripter
                return null;
            }
        };

    }

}
