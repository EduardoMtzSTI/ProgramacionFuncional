package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // concepto #5: Predicate
        System.out.println(isPhoneNumberValid.test("524425987461"));
        System.out.println(isPhoneNumberValid.test("564425987461"));
        System.out.println(isPhoneNumberValid.test("56442598746"));
        // encadenamiento de predicados
        System.out.println(
                "El numero es valido y contiene el numero 3 :"+
                        isPhoneNumberValid.and(containsNumber3).test("56012_456789")
        );
        System.out.println(
                "El numero es valido y contiene el numero 3 :"+
                        isPhoneNumberValid.or(containsNumber3).test("56012_456789")
        );
        //ByPredicates
        //...
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.startsWith("56") && phoneNumber.length() == 12;

    static  Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

}
