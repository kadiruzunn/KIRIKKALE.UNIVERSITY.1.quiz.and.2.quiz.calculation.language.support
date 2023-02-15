package kku.vize.finaL.büt.hesaplama.dil.secenekli;

import java.util.Scanner;

public class main {

	final static String english = "en";
	final static String turkce = "tr";
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("HOS GELDINIZ. " + "TURKCE DEVEM ETMEK İCİN 'tr' , INGILIZCE DEVAM ETMEK ICIN 'en' yazınız:");
		String secimEkreni = input.next();
		
		
		
		if (secimEkreni.equals("en")) {
			System.out.println("You chose English. Please enter your 1st exam note : ");
		} else if (secimEkreni.equals("tr")) {
			System.out.println("Turkce sectiniz. Lütfen vize notunuzu giriniz : ");
		} else {
			System.out.println("HATALI GIRDINIZ - You entered wrong");
		}
	
		Scanner vizeNotu = new Scanner(System.in);
		int ilkNot = vizeNotu.nextInt();
		int vizeNotuKatsayili = ilkNot * 40/100;
		
		if (secimEkreni.equals("en")) {
			System.out.println("Your 1st note: " + ilkNot + "." + " Please enter your final note : ");
		} else if (secimEkreni.equals("tr")) {
			System.out.println("Vize notunuz: " + ilkNot + "." + " Lütfen final notunuzu giriniz : ");
		} 
	
		
		Scanner finalNotu = new Scanner(System.in);
		int ikinciNot = finalNotu.nextInt();
		
		int finalNotuKatsayili = ikinciNot * 60/100;
		
		int sonNot = finalNotuKatsayili + vizeNotuKatsayili;
		
		if (secimEkreni.equals("en")) {
			System.out.println("Your 1st note: " + ilkNot + "." + "Your final note: " + ikinciNot);
			System.out.println("Your note : " + sonNot);
			if (sonNot < 50) {
				System.out.println("YOU DID NOT PASS THIS LESSON ");
			}
			if (sonNot >= 50) {
				System.out.println("YOU PASS THIS LESSON");
			}
		} else if (secimEkreni.equals("tr")) {
			System.out.println("Vize notunuz: " + ilkNot + "." + "Final notunuz: " + ikinciNot);
			System.out.println("Notunuz : " + sonNot);
		} if (sonNot < 50) {
			System.out.println("BÜT'E KALDINIZ");
		} if (sonNot >= 50) {
			System.out.println("DERSTEN GECTINIZ");
		}
		
	}

}
