package s�odycze;

public class TortKawowy extends Tort {
	public TortKawowy(String Wielko��) {
		this.Rozmiar=Wielko��;
		setCena(Rozmiar);
	}
	
	public String getWielko��() {
		return Rozmiar;
	}
	@Override
	public String getNazwa() {
		return 	"Tort Kawowy     ";
	}
	@Override
	public double getCena() {
		return Cena;
	}
	@Override
	public void getSk�ad() {
		System.out.println("Sk�ad: krem	kawowy,	ziarna kawy, bia�y biszkopt.");
	}
	private double setCena(String Rozmiar) {
		switch(Rozmiar) {
			case "Ma�y": {
				this.Cena = 22;
				break;
			}
			case "�redni": {
				this.Cena = 27;
				break;
			}
			case "Du�y": {
				this.Cena = 32;
				break;
			}
		}
		return Cena;
	}

}
