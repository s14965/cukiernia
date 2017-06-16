package s�odycze;

public class TortTruskawkowy extends Tort {
	public TortTruskawkowy(String Wielko��) {
		this.Rozmiar=Wielko��;
		setCena(Rozmiar);
	}
	
	public String getWielko��() {
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
	public void getSk�ad() {
		System.out.println("Sk�ad: krem	truskawkowy, truskawki,	bia�y biszkopt.");
	}
	private double setCena(String Rozmiar) {
		switch(Rozmiar) {
			case "Ma�y": {
				this.Cena = 25;
				break;
			}
			case "�redni": {
				this.Cena = 30;
				break;
			}
			case "Du�y": {
				this.Cena = 35;
				break;
			}
		}
		return Cena;
	}

}
