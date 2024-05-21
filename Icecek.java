package Hello;
class Icecek extends Urun{
		private String boy=new String();
		
		Icecek(String ad, double fiyat,String boy) {
			super(ad, fiyat);
			boy=this.boy;
		}
		
		
		public String UrunBilgisi() 
		{
			return ad + " - " + fiyat + " TL"; 
		}
		
	}