package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer oscar = new Customer("Oscar","4424698547");

        // Concepto #4 : Consumer functional interface
        greetCustomer.accept(oscar);

        // BiConsumer
        greetCustomerV2.accept(oscar,false);

    }

    static Consumer<Customer> greetCustomer = customer ->
            System.out.println("Hello "+customer.name+" thanks for registering phone number "+customer.phoneNUmber);

    static BiConsumer<Customer,Boolean> greetCustomerV2  = (customer,showPhoneNumber) ->
            System.out.println("Hello "+customer.name+" thanks for registering phone number "+(showPhoneNumber ? customer.phoneNUmber : "***"));

    static class Customer{
        private final String name;
        private final String phoneNUmber;

        public Customer(String name, String phoneNUmber) {
            this.name = name;
            this.phoneNUmber = phoneNUmber;
        }
    }
}
