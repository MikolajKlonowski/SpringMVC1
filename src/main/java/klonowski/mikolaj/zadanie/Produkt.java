package klonowski.mikolaj.zadanie;

public class Produkt {
private String nazwa;
private Double cena;
private String url;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Produkt(String nazwa, Double cena, String url) {

        this.nazwa = nazwa;
        this.cena = cena;
        this.url = url;
    }
}
