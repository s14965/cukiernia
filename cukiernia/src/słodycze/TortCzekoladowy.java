package s�odycze;

public class TortCzekoladowy extends Tort {
	public TortCzekoladowy(String Wielko��) {
		this.Rozmiar=Wielko��;
		setCena(Rozmiar);
	}
	
	public String getWielko��() {
		return Rozmiar;
	}
	@Override
	public String getNazwa() {
		return 	"Tort Czekoladowy";
	}
	@Override
	public double getCena() {
		return Cena;
	}
	@Override
	public void getSk�ad() {
		System.out.println("Sk�ad: krem czekoladowy, polewa czekoladowa, ciemny biszkopt.");
	}
	private double setCena(String Rozmiar) {
		switch(Rozmiar) {
			case "Ma�y": {
				this.Cena = 20;
				break;
			}
			case "�redni": {
				this.Cena = 25;
				break;
			}
			case "Du�y": {
				this.Cena = 30;
				break;
			}
		}
		return Cena;
	}

}
