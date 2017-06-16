package s³odycze;

public class TortKawowy extends Tort {
	public TortKawowy(String Wielkoœæ) {
		this.Rozmiar=Wielkoœæ;
		setCena(Rozmiar);
	}
	
	public String getWielkoœæ() {
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
	public void getSk³ad() {
		System.out.println("Sk³ad: krem	kawowy,	ziarna kawy, bia³y biszkopt.");
	}
	private double setCena(String Rozmiar) {
		switch(Rozmiar) {
			case "Ma³y": {
				this.Cena = 22;
				break;
			}
			case "Œredni": {
				this.Cena = 27;
				break;
			}
			case "Du¿y": {
				this.Cena = 32;
				break;
			}
		}
		return Cena;
	}

}
