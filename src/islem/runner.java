package islem;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class runner {

	public static void main(String[] args) throws IOException {
		
			dosyaislemleri ds = new dosyaislemleri();
	//	ds.dosyayaz("d:\\db.txt", new String[] {"Muhammet","Ahmet","Selim","mahmut"}, false);
		
		//for (String icerik : ds.dosyaoku("d:\\db.txt")) {
	//		System.out.println(icerik);
	//	}
		
		String[] okunan = ds.dosyaoku("d:\\db.*");
		String[] yazilacak = new String[okunan.length-1];
		int i=0;
		for (String item : okunan) {
			
			if(item.contains("0001-")) {
				
			}
			else
			{
				yazilacak[i] = item;
				i++;		
			}
			
		}
		
		ds.dosyayaz("d:\\db.*", yazilacak, false);
		

	}
	
	public static void islemeski() throws IOException {
		dosyaislemleri ds = new dosyaislemleri();
		Scanner sc = new Scanner(System.in);
		String[] bilgiler = new String[4];
		System.out.println("müþteri Adý...:");
		bilgiler[0] = sc.nextLine();
		System.out.println("müþteri Soyadý...:");
		bilgiler[1] = sc.nextLine();
		System.out.println("müþteri Telefonu...:");
		bilgiler[2] = sc.nextLine();
		System.out.println("müþteri Adresi...:");
		bilgiler[3] = sc.nextLine();
		
		String yazilacak="0001-"+bilgiler[0]+";"+bilgiler[1]+
						";"+ bilgiler[2]+";"+bilgiler[3];	
	
		ds.dosyayaz("d:\\db.txt", yazilacak, true);
		
		System.out.println("Kayýt baþarý ile tamamlanmýþtýr.");
		
		
	}
	

}
