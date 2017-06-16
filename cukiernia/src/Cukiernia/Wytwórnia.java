package Cukiernia;

import s�odycze.Tort;
import s�odycze.TortCzekoladowy;
import s�odycze.TortKawowy;
import s�odycze.TortTruskawkowy;

public class Wytw�rnia {
	private static Tort Tort;

	public static Tort Zr�bTort(String Typ, String Rozmiar) {
		switch(Typ) {
			case "Czekoladowy": {
				Tort = new TortCzekoladowy(Rozmiar);
				break;
			}
			case "Kawowy": {
				Tort = new TortKawowy(Rozmiar);
				break;
			}
			case "Truskawkowy": {
				Tort = new TortTruskawkowy(Rozmiar);
				break;
			}
		}
		return Tort;
		
	}
}
