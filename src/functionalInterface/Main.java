package functionalInterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    /** REGLAS

        FUNCIONES PURAS
        - Devuelven el mismo valor de salida cuando reciben los mismos parámetros
        - No dependen de factores externos
        - no alteran estados externos (ej. no contadores)

        FUNCIONES DE ORDEN SUPERIOR
        - toman una o mas funciones como parametro
        - retornan otra funcion como resultado
        - se pueden almacenar en variables o estructuras

     */
    public static void main(String[] args){

        List<Person> people = List.of(
                new Person("Rodrigo",Gender.MALE),
                new Person("Rocio",Gender.FAMELE),
                new Person("Jorge",Gender.MALE),
                new Person("Maria",Gender.FAMELE)
        );

        // concepto #2: predicate
        Predicate<Person> isFamele = (person) -> person.gender.equals(Gender.FAMELE);

        // concepto #1: stream
        List<Person> wemen = people.stream()
                .filter(isFamele)
                .toList();

        wemen.forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name,Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        FAMELE,MALE
    }
}
