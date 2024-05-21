package Hello;

public class Urun {
    protected String ad;
    protected double fiyat;

    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public String UrunBilgisi() {
        return ad + " - " + fiyat + " TL";
    }
}



	
	
	

