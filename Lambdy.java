package zadaniaDomowe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lambdy {
    public static void main(String[] args) {

        List<String> imiona = Arrays.asList("Stefan", "Maria", "Halina", "Przemysław", "Genowefa", "Sven");
        //imiona.stream().map(func).collect(Collectors.toList());

        List<Character> listaPierwszychLiter = imiona.stream().map((imie) -> imie.charAt(0)).collect(Collectors.toList());
        System.out.println(listaPierwszychLiter);

        List<String> listaWielkichImion = imiona.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(listaWielkichImion);

        List<String> listaMialychImion = imiona.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(listaMialychImion);

        List<Integer> listaDlugosciImion = imiona.stream().map(String::length).collect(Collectors.toList());
        System.out.println(listaDlugosciImion);

        Function<String, String> odwr1 = (s) -> {
            char[] chars = new char[s.length()];
            int n = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                chars[n] = s.charAt(n++);
            }
            return new String(chars);
        };
        Function<String, String> odwr2 = (s) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        };
        Function<String, String> odwr3 = (s) ->
                new StringBuilder(s).reverse().toString();

        Function<String, Boolean> waru1 = (s) -> s.startsWith("a");
        Function<String, Boolean> waru2 = (s) -> s.endsWith("a") || s.endsWith("A");

    }

}

