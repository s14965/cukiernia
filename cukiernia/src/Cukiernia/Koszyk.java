package Cukiernia;

import java.util.ArrayList;
import java.util.List;

import s�odycze.Tort;

public class Koszyk {
	private List<Tort> Produkty = new ArrayList<>();
	private Tort Tort;
		
	public void dodajProdukt(String Typ, String Rozmiar, int ilo��) {
		int i = 0;
		do{
			Tort = Wytw�rnia.Zr�bTort(Typ, Rozmiar);
			Produkty.add(Tort);
			i++;
		}while(i<ilo��);
	}
	public void wypiszProdukty() {
		int i = 0;
		System.out.println("Zam�wione torty:");
		do {
			System.out.print(i+1 + ". ");
			System.out.print(Produkty.get(i).getNazwa() + " ");
			System.out.print(Produkty.get(i).getWielko��() + " ");
			System.out.print(Produkty.get(i).getCena() + "z� ");
			System.out.println("");
			Produkty.get(i).getSk�ad();
			System.out.println("");
			i++;
		} while(i<Produkty.size());
		System.out.println("Razem                    " + cenaCa�kowita() + "z�");
	}
	public double cenaCa�kowita() {
		double cenaCa�kowita = 0;
		for (Tort Tort : Produkty) {
			cenaCa�kowita += Tort.getCena();
		}
		return cenaCa�kowita;
	}
		
}
