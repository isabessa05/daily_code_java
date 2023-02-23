package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

/*
        printAllNumbersInListFunctional(numbers);
        System.out.println("--Only Even Numbers Below--");
        printEvenNumbersInListFunctional(numbers);
        printCoursesIndividually(courses);
        printCourseSpring(courses);
        printCourseWithAtLeast4Letters(courses);
*/
//        printSquaresOfEvenNumbersInListFunctional(numbers);
//        printOddCubeNumbers(numbers);
        printCourseNumberOfChar(courses);

    }

/*
    private static void print(int number) {
        System.out.println(number);
    }
*/

    private static boolean isEven(int number) {
        return number%2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //[12, 9, 13, 4, 6, 2, 4, 12, 15]

        //What to do?
        numbers.stream()
                .forEach(System.out::println);// for each element this method(print) should be called
    }
    //This method accepts a number as a parameter. number -> number%2 ==)
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()
//                .filter(FP01Functional::isEven)
//                .filter(number -> number%2 == 0) // Lambda Expression
                .filter(number -> number%2 != 0) // print odd numbers
                .forEach(System.out::println); // Method Reference
    }

    private static void printCoursesIndividually(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printCourseSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCourseWithAtLeast4Letters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    //Using map in Functional Programs
    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)
                // by using mapping  - x -> x * x
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printOddCubeNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 != 0)
                // by using mapping  - x -> x * x
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printCourseNumberOfChar(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }
// A lambda expression is a simplified representation of a method

}
