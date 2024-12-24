package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        //Concepto #6 : supplier
        System.out.println(getDBConnectionUrl.get());

    }

    static Supplier<List<String>> getDBConnectionUrl =  () ->
            List.of("jdbc://localhost:5432/users","jdbc://localhost:5432/customers");

}
