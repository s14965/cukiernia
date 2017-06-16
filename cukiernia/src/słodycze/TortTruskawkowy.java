package s³odycze;

public class TortTruskawkowy extends Tort {
	public TortTruskawkowy(String Wielkoœæ) {
		this.Rozmiar=Wielkoœæ;
		setCena(Rozmiar);
	}
	
	public String getWielkoœæ() {
		return Rozmiar;
	}
	@Override
	public String getNazwa() {
		return 	"Tort Truskawkowy";
	}
	@Override
	public double getCena() {
		return Cena;
	}
	@Override
	public void getSk³ad() {
		System.out.println("Sk³ad: krem	truskawkowy, truskawki,	bia³y biszkopt.");
	}
	private double setCena(String Rozmiar) {
		switch(Rozmiar) {
			case "Ma³y": {
				this.Cena = 25;
				break;
			}
			case "Œredni": {
				this.Cena = 30;
				break;
			}
			case "Du¿y": {
				this.Cena = 35;
				break;
			}
		}
		return Cena;
	}

}
