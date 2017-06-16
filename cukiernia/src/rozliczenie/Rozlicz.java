package rozliczenie;

import java.util.ArrayList;
import java.util.List;

import Cukiernia.Koszyk;
import s³odycze.Tort;

public class Rozlicz {
	private double cena;
	private String Adres;
	private String Klient;
	private String SposóbOdbioru;
	
	private List<String> Lokacje = new ArrayList<>();
	{
		Lokacje.add("Lokal1");
		Lokacje.add("Lokal2");
		Lokacje.add("Lokal3");
		
	}
	
	public Rozlicz(Koszyk koszyk, String Adres, String Klient) {
		this.cena = koszyk.cenaCa³kowita();
		this.Adres = Adres;
		this.Klient = Klient;
		sprawdzAdres(Adres);
		generujRachunek(koszyk);
	}
	
	private String sprawdzAdres(String Adres) {
		if(Lokacje.contains(Adres)) {
			SposóbOdbioru = "Odbiór Osobisty";
		} else {
			cena += 5;
			SposóbOdbioru = "Dostawa. Dop³ata 5z³.";
		}
		return SposóbOdbioru;
	}
	
	private void generujRachunek(Koszyk koszyk) {
		koszyk.wypiszProdukty();
		System.out.println("Sposób odbioru: " + SposóbOdbioru);
		System.out.println("Do zap³aty: " + cena + "z³");
		System.out.println("Klient: " + Klient);
		System.out.println("Adres: " + Adres);
		System.out.println("-----------------------------------------------");
	}
}
