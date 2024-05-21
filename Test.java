package Hello;

public class Test {

	public static void main(String[] args) {
		
		Restoran restoran=new Restoran();
		
		
		Garson garson1 = new Garson("Metin");
		Garson garson2 = new Garson("Ali");
		Garson garson3 = new Garson("Feyyaz");
		
		restoran.garsonEkle(garson1);
		restoran.garsonEkle(garson2);
		restoran.garsonEkle(garson3);
		
		Icecek icicek1= new Icecek("Kola",15,"Küçük");
		Icecek icicek2= new Icecek("Ayran",10,"Orta");
		Icecek icicek3= new Icecek("Cay",5,"Standart");
		
		restoran.munuyeUrunekleme(icicek1);
		restoran.munuyeUrunekleme(icicek2);
		restoran.munuyeUrunekleme(icicek3);
		
		Yemek yemek1 = new Yemek("Balik Ekmek",30,"Deniz Urunu");
		Yemek yemek2 = new Yemek("Kirmizi Et",50,"Et");
		Yemek yemek3 = new Yemek("Kokorec",40,"Sakat at");
		

		restoran.munuyeUrunekleme(yemek1);
		restoran.munuyeUrunekleme(yemek2);
		restoran.munuyeUrunekleme(yemek3);
		
		
		Musteri musteri1 = new Musteri("Fatih Terim");
		Musteri musteri2 = new Musteri("Şenol Güneş");
		Musteri musteri3 = new Musteri("Aykut Kocaman");
		
		restoran.musteriEkle(musteri1);
		restoran.musteriEkle(musteri2);
		restoran.musteriEkle(musteri3);
		
		System.out.println("Menu");
		System.out.println("-------");
		restoran.menuyuGoster();
		restoran.rasgeleSiparislerOlustur();
		
		
	}

}
