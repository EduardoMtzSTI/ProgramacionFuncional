package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String school = null;
        Integer status = 1;

        Object value = Optional.ofNullable(school)
                .orElseGet(()->"desconocida");
        System.out.println(value);

        Optional.ofNullable("my-email@gmail.com")
                        .ifPresent( email-> System.out.println("Enviando email a : "+email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        val -> System.out.println("Enviando email a: "+val),
                        () -> System.out.println("No se pudo enviar el email")
                    );

        Optional.of(status)
                .ifPresent(val -> {
                    System.out.println(val == 1 ? "exitoso":"error");
                } );

        //Optional.ofNullable(school).orElseThrow(()-> new IllegalStateException("El nombre de la escuela es requerido") );

    }
}
