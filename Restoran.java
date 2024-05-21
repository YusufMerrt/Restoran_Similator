package Hello;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Restoran {

	
	private ArrayList<Urun> menu;
	private ArrayList<Siparis> siparisler;
	private ArrayList<Musteri> musteriler;
	private ArrayList<Garson> garsonlar;
	
	Restoran()
	{
		this.menu = new ArrayList<>();
        this.siparisler = new ArrayList<>();
        this.musteriler = new ArrayList<>();
        this.garsonlar = new ArrayList<>();
	}
	
	
	void munuyeUrunekleme(Urun urun) 
	{
		menu.add(urun);
	}
	
	void musteriEkle(Musteri musteri) 
	{
		musteriler.add(musteri);
	}
	
	void garsonEkle(Garson garson)
	{
		garsonlar.add(garson);
	}
	
	void menuyuGoster() 
	{
		
		for (Urun item : menu) {
			
            System.out.println(item.UrunBilgisi());
            System.out.println("-------");
        }
	}
	
	void rasgeleSiparislerOlustur()
	{
		 Random rand = new Random();
		    for (int i = 0; i < 10; i++) {
		        Musteri randomMusteri = musteriler.get(rand.nextInt(musteriler.size()));
		        Garson randomGarson = garsonlar.get(rand.nextInt(garsonlar.size()));
		        LocalDateTime now = LocalDateTime.now();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		       String formattedDate = now.format(formatter);
		        
		        // Rasgele yemek ve içecek seçimi
		        Urun randomUrun = menu.get(rand.nextInt(menu.size()));
		        
		        Siparis randomSiparis = new Siparis(
		            randomUrun instanceof Yemek ? (Yemek) randomUrun : null,
		            randomUrun instanceof Icecek ? (Icecek) randomUrun : null,
		            randomGarson, 
		            randomMusteri, 
		            now
		        );
		        randomGarson.siparisAl(randomSiparis, siparisler);
		    }
	}
	
}
