package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String,String> upperCaseName = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        Function<String,String> lowerCaseName = String::toUpperCase;

        BiFunction<String,Integer,String> upperCasePerson= (name,age) -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCasePerson.apply("Alejandro",16));
    }
}
