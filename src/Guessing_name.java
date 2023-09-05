import java.util.Scanner;

public class Guessing_name {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String arvaus = "";
		String vastaus = "";
		int laskuri = 0;
		
		System.out.println("Tervetuloa pelaamaan.");
		
		do {
		System.out.println("Arvaa nimi.");
		arvaus = in.nextLine();
		laskuri++;
				
		if (arvaus.equals("Pentti")) {
			System.out.println("Onneksi olkoon, voitit!");
			break;
		}
		
		else if (!arvaus.equals("Pentti")) {
			System.out.println("Et voittanut tällä kertaa.");
			System.out.println("Paina enteriä pelataksesi uudestaan. Lopettaaksesi pelin kirjoita lopeta");
			vastaus = in.nextLine();
		}
			
		}while (!vastaus.equals("lopeta")); 
		System.out.println("Arvastit " + laskuri + " kertaa. Kiitos pelaamisesta! :)");
		

		}

	}
