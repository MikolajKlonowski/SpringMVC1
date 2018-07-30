package klonowski.mikolaj.zadanie;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepozytoriumProduktowe {
    private List<Produkt> listaProduktow;

    public RepozytoriumProduktowe() {
        listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt("Chleb", 2.33, "https://polskikoszyk.pl/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/1794/chleb-dobrodziej-jaglany-z-ziarnami-chia-650-g-chleb-od-piekarza-i-cukiernika_0.jpg"));
        listaProduktow.add(new Produkt("Bułka", 0.33, "http://lalorraine.pl/wp-content/uploads/2016/11/20161115-bulka_rezyczka_jasna_4045130.jpg"));
        listaProduktow.add(new Produkt("Rogal", 1.33, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Rogalik.jpg/220px-Rogalik.jpg"));
    }

    public void setListaProduktow(List<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public List<Produkt> getListaProduktow() {

        return listaProduktow;
    }

    public Produkt findByName(String nazwa) {
        for (Produkt produkt : listaProduktow) {
            if (produkt.getNazwa() == nazwa) {
                return produkt;
            }

        }
        return null;
    }
}