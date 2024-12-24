package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args){

        // Functions recibe un argumento y produce un resultado
        int increment = incrementByOne.apply(1);
        System.out.println(increment);

        int multiply = multiplyByTen.apply(increment);
        System.out.println(multiply);

        // chaining functions
        int incrementByOneAndMultipleByTen = incrementByOne.andThen(multiplyByTen).apply(2);
        System.out.println(incrementByOneAndMultipleByTen);

        // BiFunctions recibe dos argumentos y produce un resultado
        System.out.println(incrementByOneAndMultiply.apply(1,20));

    }

    // concepto #3: functions
    static Function<Integer,Integer> incrementByOne = number -> number+1;
    static Function<Integer,Integer> multiplyByTen = number -> number*10;

    //BiFunctions
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiply =
            (numberToIncrementByOne,numberToMultiplyBy)
                    ->  (numberToIncrementByOne+1)*numberToMultiplyBy;

}
