package org.generation.italy;

public class Furgone extends Veicolo {

	private int capacita;

	public int getCapacita() {
		return capacita;
	}

	@Override
	public String toString() {
		return "Furgone [capacita=" + capacita + "]";
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}
}
