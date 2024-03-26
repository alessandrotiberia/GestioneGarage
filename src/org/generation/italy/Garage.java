package org.generation.italy;

public class Garage {

	private Veicolo[] posti = new Veicolo[15];

	public boolean aggiungiPosto(Veicolo v) {
		for (int i = 0; i < 15; i++) {
			if (posti[i] == null) {
				posti[i] = v;
				System.out.println("Veicolo inserito");
				return true;
			}
		}
		System.out.println("Veicolo non inserito correttamente");
		return true;
	}

	public Veicolo estrazione(int i) {
		Veicolo v = posti[i];
		posti[i] = null;
		return v;
	}

	public void stampaSituazioneGarage() {
		for (int i = 0; i < 15; i++) {
			System.out.println(posti[i]);
		}
	}

	public static void main(String[] args) {
		Garage g = new Garage();
		Auto a = new Auto();
		a.setAlimentazione("diesel");
		a.setAnno(2000);
		a.setCilindrata(2000);
		a.setMarca("fiat");
		a.setPorte(2);

		g.aggiungiPosto(a);
		g.stampaSituazioneGarage();
		g.estrazione(0);
		g.stampaSituazioneGarage();

	}
}
