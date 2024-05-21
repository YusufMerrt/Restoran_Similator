package Hello;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Siparis {

	 Yemek yemek ;
	 Icecek icecek;
	Garson garson ;
	 Musteri musteri;
	String tarih;
    private static long siparisNoCounter = 1;
    long siparisNo;
	
	 
     
    static long siparis_no;
	
	Siparis(Yemek yemek,Icecek icecek,Garson garson,Musteri musteri, LocalDateTime tarih)
	{
		this.yemek = yemek;
        this.icecek = icecek;
        this.garson = garson;
        this.musteri = musteri;
        //this.tarih = tarih;
        this.siparisNo = siparisNoCounter++;
        
	}
	
	void siparisBilgisi()
	{
		
	}
	
	void siparisYazdır(PrintWriter yazici) 
	{
		
	}
	
}
	
