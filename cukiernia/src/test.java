import Cukiernia.Koszyk;
import rozliczenie.Rozlicz;

public class test {

	public static void main(String[] args) {
		Koszyk Szymon = new Koszyk();
		Szymon.dodajProdukt("Czekoladowy", "Ma³y", 2);
		Szymon.dodajProdukt("Kawowy", "Œredni", 1);
		Szymon.dodajProdukt("Truskawkowy", "Du¿y", 3);
		Rozlicz rozliczenie = new Rozlicz(Szymon, "¯eromskiego 1", "Szymon Maj");
		
		Koszyk Piotrek = new Koszyk();
		Piotrek.dodajProdukt("Czekoladowy", "Ma³y", 1);
		Piotrek.dodajProdukt("Czekoladowy", "Œredni", 1);
		Piotrek.dodajProdukt("Czekoladowy", "Du¿y", 1);
		Piotrek.dodajProdukt("Kawowy", "Ma³y", 1);
		Piotrek.dodajProdukt("Kawowy", "Œredni", 1);
		Piotrek.dodajProdukt("Kawowy", "Du¿y", 1);
		Piotrek.dodajProdukt("Truskawkowy", "Ma³y", 1);
		Piotrek.dodajProdukt("Truskawkowy", "Œredni", 1);
		Piotrek.dodajProdukt("Truskawkowy", "Du¿y", 1);
		Rozlicz rozliczenie2 = new Rozlicz(Piotrek, "Lokal1", "Piotrek W.");
	}

}
