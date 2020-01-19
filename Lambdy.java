package zadaniaDomowe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        List<String> listaOdwroconychImion = new ArrayList<>();
        for (String l : imiona) {
            String noweImie = "";
            int dlugosc = l.length();
            for (int x = dlugosc - 1; x >= 0; x--) {
                noweImie = noweImie + l.charAt(x);
            }
            listaOdwroconychImion.add(noweImie);
        }
        System.out.println(listaOdwroconychImion);

    }

}

