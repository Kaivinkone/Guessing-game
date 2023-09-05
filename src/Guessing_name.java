import java.util.Scanner;

public class Guessing_name {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String arvaus = "";
		String vastaus = "";
		String oikeaV = "Pentti";
		int laskuri = 0;
		
		System.out.println("Tervetuloa pelaamaan.");
		
		// looppirakenteen lisääminen
		do { 
		System.out.println("Arvaa nimi.");
		arvaus = in.nextLine();
		laskuri++;
				
		// Pentti vastaus voittaa ja katkaisee loopin
		if (arvaus.equals("Pentti")) {
			System.out.println("Onneksi olkoon, voitit!");
			break;
		}
		
		// Ilman Penttiä palaute ja uudelleen kysymys
		else if (!arvaus.equals("Pentti")) {
			System.out.println("Et voittanut tällä kertaa.");
			//luodaan apua väärin vastanneille
			char apu = oikeaV.charAt(laskuri-1);
			System.out.println("Tässä hieman apua, vinkki nimen kirjaimista järjestyksessä: " + apu);
			System.out.println("Paina enteriä pelataksesi uudestaan. Lopettaaksesi pelin kirjoita lopeta");
			vastaus = in.nextLine();
		}
		// Jatketaan looppia niin kauan kuin arvaus ei oo Pentti	
		}while (!vastaus.equals("lopeta")); 
		System.out.println("Arvastit " + laskuri + " kertaa. Kiitos pelaamisesta!");
		

		}

	}
