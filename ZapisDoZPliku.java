package zadaniaDomowe4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZapisDoZPliku {

    public static void main(String[] args) throws IOException {
        List<Pracownik> pracownikList = Arrays.asList(
                new Pracownik("Marek", "Onoszko", 5000),
                new Pracownik("Patryk", "Patryczkowy", 4000),
                new Pracownik("Magda", "Halicka", 4500)
        );
        List<Firma> firmaList = Arrays.asList(
                new Firma("Elsa", "Tomasz", pracownikList),
                new Firma("Domus", "Zdzisiek", pracownikList),
                new Firma("Sygma", "Anna", pracownikList)
        );
        List<String> listaFirmOdczytana = new ArrayList<>();
        Path firmydir = Paths.get("firmy");
        if (!Files.exists(firmydir)) {
            Files.createDirectory(firmydir);             // jezeli jest juz katalog i chcesz go stworzyc to wyrzuci blad
        }

        for (Firma f : firmaList) {

            Path plikFirma = firmydir.resolve(f.getNazwa() + ".txt");
            if (!Files.exists(plikFirma)) {
                Files.createFile(plikFirma);
            }

            BufferedWriter writer = Files.newBufferedWriter(plikFirma);
            writer.write("Firma <" + f.getNazwa() + ">");
            writer.newLine();
            writer.write("Szef <" + f.getSzef() + ">");
            writer.newLine();
            writer.write("Liczba Pracowników <" + f.getPracownikList().size() + ">");

            for (Pracownik p : pracownikList) {
                writer.newLine();
                writer.write("<" + p.getImie() + " " + p.getNazwisko() + ">; <" + p.getWynagrodzenie() + ">");
            }
            writer.close();

            BufferedReader reader = Files.newBufferedReader(plikFirma);
            String czytajNazwe = reader.readLine();
            listaFirmOdczytana.add(czytajNazwe);
            reader.close();
        }
        System.out.println(listaFirmOdczytana);

    }
}
