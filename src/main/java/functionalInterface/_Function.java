package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        // geht in die static Funktion
        // Main Methoden nimmt nur static Methoden aufgenommen
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction
                .andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // BiFunktion

    }


    // lambda ausdruck number -> number + 1 ist das gleiche wie return number + 1
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    // normale fkt
    static int incrementByOne(int number) {
        return number + 1;
    }

    BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
