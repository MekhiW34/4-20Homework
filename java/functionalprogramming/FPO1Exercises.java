package functionalprogramming;

import java.util.List;

public class FPO1Exercises {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        printOddNumbersInListFunctional(numbers);
        printCubesOfNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

//          courses.stream()
//            .forEach(System.out::println);

            courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

            courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);

            courses.stream()
                    .map(course -> course + " " + course.length())
                    .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven)//Filter -ONly allow even numbers
                .filter(number -> number % 2 != 0)//lamdba expression
                .forEach(FP01Functional::print);//method reference
    }
    private static void printCubesOfNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven)//Filter -ONly allow even numbers
                .filter(number -> number % 2 != 0)//lamdba expression
                .map(number -> number * number * number)
                .forEach(FP01Functional::print);//method reference
    }
}
