package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);




/*
        0 12
        12 9
        21 13
        34 4
        38 6
        44 2
        46 4
        50 12
        62 15
        77
*/

//        jshell> numbers.stream().reduce(0, (x,y)-> x>y? x:y) if x is greater that y return x if not return y

        int sum = addListFunctional(numbers);
        System.out.println(sum);

        System.out.println(doubleList(numbers));
    }

    private static List<Integer> doubleList(List<Integer> numbers){
        return  numbers.stream()
                .filter(x -> x%2 !=0)
                .collect(Collectors.toList());

    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " " + nextNumber);
        return aggregate + nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
//                .reduce(0, FP02Functional::sum);
//                .reduce(0, (x, y) -> x +y); lambda expression
                .reduce(0, Integer:: sum); // method reference

                //Combine them into one result => One Value
                // 0 and FP02Functional::sum
        }

    }


