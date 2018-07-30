package klonowski.mikolaj.zadanie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class KontrolerKoszyka {
    private Produkt produkt;
    private RepozytoriumProduktowe repozytoriumProduktowe;
    public Map<Produkt, Integer> kosz;

    public KontrolerKoszyka(RepozytoriumProduktowe repozytoriumProduktowe) {
        kosz = new HashMap<>();
    }


    @PostMapping("/addItem")
    public String add(@RequestParam int ilosc, @RequestParam String nazwa) {
//        System.out.println(ilosc);
        System.out.println(nazwa+nazwa+nazwa+ilosc+ilosc+ilosc+"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Produkt produkt1 = repozytoriumProduktowe.findByName(nazwa);
//        kosz=repozytoriumProduktowe.addNewList(produkt,ilosc);

        kosz.put(produkt1, ilosc);




        return "/redirect:/koszyk";

    }


    @GetMapping("/koszyk")
    @ResponseBody
    public String kosz() {
        String wynik = "";
        for (Map.Entry<Produkt, Integer> produktIntegerEntry : kosz.entrySet()) {
            wynik += produktIntegerEntry.getKey().getNazwa() + ":" + produktIntegerEntry.getValue() + "<br>";

        }
        return wynik;
    }


}

