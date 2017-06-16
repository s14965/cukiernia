package rozliczenie;

import java.util.ArrayList;
import java.util.List;

import Cukiernia.Koszyk;
import s�odycze.Tort;

public class Rozlicz {
	private double cena;
	private String Adres;
	private String Klient;
	private String Spos�bOdbioru;
	
	private List<String> Lokacje = new ArrayList<>();
	{
		Lokacje.add("Lokal1");
		Lokacje.add("Lokal2");
		Lokacje.add("Lokal3");
		
	}
	
	public Rozlicz(Koszyk koszyk, String Adres, String Klient) {
		this.cena = koszyk.cenaCa�kowita();
		this.Adres = Adres;
		this.Klient = Klient;
		sprawdzAdres(Adres);
		generujRachunek(koszyk);
	}
	
	private String sprawdzAdres(String Adres) {
		if(Lokacje.contains(Adres)) {
			Spos�bOdbioru = "Odbi�r Osobisty";
		} else {
			cena += 5;
			Spos�bOdbioru = "Dostawa. Dop�ata 5z�.";
		}
		return Spos�bOdbioru;
	}
	
	private void generujRachunek(Koszyk koszyk) {
		koszyk.wypiszProdukty();
		System.out.println("Spos�b odbioru: " + Spos�bOdbioru);
		System.out.println("Do zap�aty: " + cena + "z�");
		System.out.println("Klient: " + Klient);
		System.out.println("Adres: " + Adres);
		System.out.println("-----------------------------------------------");
	}
}
