package Hello;

public class Yemek extends Urun {
    private String tur;

    public Yemek(String ad, double fiyat, String tur) {
        super(ad, fiyat);
        this.tur = tur;
    }

    @Override
    public String UrunBilgisi() {
        return ad + " - " + fiyat + " TL - " + tur;
    }
}
