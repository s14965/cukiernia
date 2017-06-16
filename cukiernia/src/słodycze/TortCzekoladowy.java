package s³odycze;

public class TortCzekoladowy extends Tort {
	public TortCzekoladowy(String Wielkoœæ) {
		this.Rozmiar=Wielkoœæ;
		setCena(Rozmiar);
	}
	
	public String getWielkoœæ() {
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
	public void getSk³ad() {
		System.out.println("Sk³ad: krem czekoladowy, polewa czekoladowa, ciemny biszkopt.");
	}
	private double setCena(String Rozmiar) {
		switch(Rozmiar) {
			case "Ma³y": {
				this.Cena = 20;
				break;
			}
			case "Œredni": {
				this.Cena = 25;
				break;
			}
			case "Du¿y": {
				this.Cena = 30;
				break;
			}
		}
		return Cena;
	}

}
