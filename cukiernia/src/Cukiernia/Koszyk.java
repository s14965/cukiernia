package Cukiernia;

import java.util.ArrayList;
import java.util.List;

import s³odycze.Tort;

public class Koszyk {
	private List<Tort> Produkty = new ArrayList<>();
	private Tort Tort;
		
	public void dodajProdukt(String Typ, String Rozmiar, int iloœæ) {
		int i = 0;
		do{
			Tort = Wytwórnia.ZróbTort(Typ, Rozmiar);
			Produkty.add(Tort);
			i++;
		}while(i<iloœæ);
	}
	public void wypiszProdukty() {
		int i = 0;
		System.out.println("Zamówione torty:");
		do {
			System.out.print(i+1 + ". ");
			System.out.print(Produkty.get(i).getNazwa() + " ");
			System.out.print(Produkty.get(i).getWielkoœæ() + " ");
			System.out.print(Produkty.get(i).getCena() + "z³ ");
			System.out.println("");
			Produkty.get(i).getSk³ad();
			System.out.println("");
			i++;
		} while(i<Produkty.size());
		System.out.println("Razem                    " + cenaCa³kowita() + "z³");
	}
	public double cenaCa³kowita() {
		double cenaCa³kowita = 0;
		for (Tort Tort : Produkty) {
			cenaCa³kowita += Tort.getCena();
		}
		return cenaCa³kowita;
	}
		
}
