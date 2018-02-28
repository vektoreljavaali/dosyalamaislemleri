package islem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosyaislemleri {

	public void dosyayaz(String dosyayolu,String icerik,boolean ekle) throws IOException {
		
        File ds = new File(dosyayolu);
		
		BufferedWriter bf = new BufferedWriter(new FileWriter(ds, ekle));
		
		bf.write(icerik);
		bf.newLine();
		
		bf.close();
		
	}
	
	public void dosyayaz(String dosyayolu,String[] icerik,boolean ekle) throws IOException {
		File ds = new File(dosyayolu);
		BufferedWriter bf = new BufferedWriter(new FileWriter(ds, ekle));
		for (String diziicerigi : icerik) {
		bf.write(diziicerigi);
		bf.newLine();
		}
		bf.close();
	}
	
	public String[] dosyaoku(String dosyayolu) throws FileNotFoundException {
	
		File ds = new File(dosyayolu);
		Scanner sc = new Scanner(ds);
		int diziuzunlugu=0;
		while(sc.hasNextLine()) {
					diziuzunlugu++;	
					sc.nextLine();
		}
		sc.close();
		String[] sonuc = new String[diziuzunlugu];
		int i=0;
		
		sc = new Scanner(ds);
		while(sc.hasNextLine()) {
			sonuc[i] = sc.nextLine();
			i++;
		}
		sc.close();
	
		return sonuc;
	}
	
	
	
}
