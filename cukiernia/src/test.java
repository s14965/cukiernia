import Cukiernia.Koszyk;
import rozliczenie.Rozlicz;

public class test {

	public static void main(String[] args) {
		Koszyk Szymon = new Koszyk();
		Szymon.dodajProdukt("Czekoladowy", "Ma�y", 2);
		Szymon.dodajProdukt("Kawowy", "�redni", 1);
		Szymon.dodajProdukt("Truskawkowy", "Du�y", 3);
		Rozlicz rozliczenie = new Rozlicz(Szymon, "�eromskiego 1", "Szymon Maj");
		
		Koszyk Piotrek = new Koszyk();
		Piotrek.dodajProdukt("Czekoladowy", "Ma�y", 1);
		Piotrek.dodajProdukt("Czekoladowy", "�redni", 1);
		Piotrek.dodajProdukt("Czekoladowy", "Du�y", 1);
		Piotrek.dodajProdukt("Kawowy", "Ma�y", 1);
		Piotrek.dodajProdukt("Kawowy", "�redni", 1);
		Piotrek.dodajProdukt("Kawowy", "Du�y", 1);
		Piotrek.dodajProdukt("Truskawkowy", "Ma�y", 1);
		Piotrek.dodajProdukt("Truskawkowy", "�redni", 1);
		Piotrek.dodajProdukt("Truskawkowy", "Du�y", 1);
		Rozlicz rozliczenie2 = new Rozlicz(Piotrek, "Lokal1", "Piotrek W.");
	}

}
