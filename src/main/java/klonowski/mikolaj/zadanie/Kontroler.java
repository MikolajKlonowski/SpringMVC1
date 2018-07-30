package klonowski.mikolaj.zadanie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Kontroler {
    public RepozytoriumProduktowe repozytoriumProduktowe;

    public Kontroler(RepozytoriumProduktowe repozytoriumProduktowe) {
        this.repozytoriumProduktowe = repozytoriumProduktowe;
    }

    @GetMapping("/")
    public String a(Model model) {
        model.addAttribute("produkty", repozytoriumProduktowe.getListaProduktow());
        return "index";
    }
}
