package zadaniaDomowe4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZabawaZOptional {

    public static void main(String[] args) {
        Map<String, Double> mapa = new HashMap<>();
        mapa.put("Marek", 200.0);
        mapa.put("Monika", 1000.95);
        mapa.put("Agata", 500.60);
        mapa.put("Dorota", 499.99);
        mapa.put("Piotrek", 50.50);
        double kosztProduktu = 50.00;

        Double s1 = mapa.get("Marek");
        if (s1 != null) {
            System.out.println(s1);
        }
        Optional<Double> kwota = Optional.ofNullable(mapa.get("Marek"));
        kwota.map((n) -> n.doubleValue()).ifPresent(System.out::println);


    }


}
