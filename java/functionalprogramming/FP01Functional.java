package functionalprogramming;

import java.util.List;

public class FP01Functional {


    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printAllNumbersInListFunctional(numbers);
        //printEvenNumbersInListFunctional(numbers);
        printSquareOfEvenNumbersInListFunctional(numbers);

    }
    static void print(int number){
        System.out.println(number);
    }

//    private static boolean isEven(int number) {
//        return number%2 ==0;
//    }


    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()
                .forEach(FP01Functional::print);//method reference

    }

    //number -> number% 2 ==0
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()
                //.filter(FP01Functional::isEven)//Filter -ONly allow even numbers
                .filter(number -> number% 2 ==0)//lamdba expression
                .forEach(FP01Functional::print);//method reference

    }
    private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()
                //.filter(FP01Functional::isEven)//Filter -ONly allow even numbers
                .filter(number -> number% 2 ==0)//lamdba expression
                //mapping - x -> x * x
                .map(number -> number * number)
                .forEach(FP01Functional::print);//method reference

    }


}