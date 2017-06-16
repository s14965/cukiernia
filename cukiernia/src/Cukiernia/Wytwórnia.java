package Cukiernia;

import s這dycze.Tort;
import s這dycze.TortCzekoladowy;
import s這dycze.TortKawowy;
import s這dycze.TortTruskawkowy;

public class Wytw鏎nia {
	private static Tort Tort;

	public static Tort Zr鏏Tort(String Typ, String Rozmiar) {
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
