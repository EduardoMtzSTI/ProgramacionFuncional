package streams;

import static streams.Main.Gender.FAMELE;
import static streams.Main.Gender.MALE;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Rodrigo", MALE),
                new Person("Rocio", FAMELE),
                new Person("Jorge", MALE),
                new Person("Maria", FAMELE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        final Predicate<Person> personPredicate = person -> person.gender.equals(FAMELE);

        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);
        System.out.println("Solo contiene mujeres: "+containsOnlyFemales);

        boolean containsAtLeastOneFemale = people.stream()
                .anyMatch(personPredicate);
        System.out.println("Contiene alguna mujer: "+containsAtLeastOneFemale);

        boolean notContainsFemales = people.stream()
                .noneMatch(personPredicate);
        System.out.println("No contiene mujeres: "+notContainsFemales);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
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
