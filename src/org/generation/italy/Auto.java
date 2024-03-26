package org.generation.italy;

public class Auto extends Veicolo {

	private int porte;
	private String alimentazione;

	public int getPorte() {
		return porte;
	}

	@Override
	public String toString() {
		return "Auto [porte=" + porte + ", alimentazione=" + alimentazione + super.toString() +"]";
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
}
