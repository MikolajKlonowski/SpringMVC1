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

    public String add(@RequestPart int ilosc, @RequestParam String nazwa) {
        System.out.println(ilosc);

        Produkt produkt = repozytoriumProduktowe.findByName(nazwa);
        kosz.put(produkt, ilosc);
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

