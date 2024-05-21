package Hello;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Garson extends Kisi {

    Garson(String ad) {
        super(ad);
    }

    void siparisAl(Siparis s, ArrayList<Siparis> siparisler) {
        // Siparişleri listeye ekle
        siparisler.add(s);

        // Sipariş içeriğini konsola yazdır
        System.out.println("Sipariş alındı:");
        System.out.println(s);

        // Dosyaya yazdırma işlemi
        dosyayaYaz(s);
    }

    private void dosyayaYaz(Siparis siparis) {
        try {
            
         // Klasörü kontrol et ve yoksa oluştur
            File klasor = new File("Siparisler");
            if (!klasor.exists()) {
                klasor.mkdir();
            }
		// Dosya adını oluştur
            String dosyaAdi = "Siparisler/siparis_" + siparis.siparisNo + ".txt";

            // Dosyayı oluştur ve yazma işlemi için BufferedWriter kullan
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi));
            writer.write("Sipariş Detayları:\n");
            writer.write(siparis.toString());
            
            writer.close(); // Dosyayı kapat
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
