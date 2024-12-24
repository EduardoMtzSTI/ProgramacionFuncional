package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Mariana",
                "marian89@gmail.com",
                "4525987484",
                LocalDate.of(2000,5,24)
        );

        ValidationResult  result = isEmailValid()
                .and(isPhoneNumberValid())
                .and((isAnAdult())).apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
