package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
    public class LambdaBehindTheScreenRunner {
        static class  EvenNumberPredicate implements Predicate<Integer> {


            @Override
            public boolean test(Integer number) {
                return number %2 == 0;
            }


            static class SystemOutConsumer implements Consumer<Integer>{


                @Override
                public void accept(Integer number) {
                    System.out.println(number);
                }

                class NumberSquareMapper implements Function<Integer, Integer>{


                    @Override
                    public Integer apply(Integer integer) {
                        return numbers * number;
                    }
                }



        public static void main(String[] args) {
            //1. Storing functions in variables
            //2. Passing functions to methods
            //3. Returning functions from methods

            Predicate<? super Integer> evenPredicate = n -> n%2 == 0;
            Predicate<? super Integer> oddPredicate = n -> n%2 == 1;

            List.of(23, 43, 34, 45, 36, 48, 79).stream()
                    .filter(new EvenNumberPredicate())
                    .map(n -> n * n)
                    .forEach(new SystemOutConsumer());


            List.of(23, 43, 34, 45, 36, 48, 79).stream()
                    .filter(n -> n % 2 == 0)
                    .map(new NumberSquareMapper())
                    .forEach(e -> System.out.println(e));

            //Stream<T> filter(Predicate<? super T> predicate);
            //boolean test(T t);
            }
        }
    }
}
