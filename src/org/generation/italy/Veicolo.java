package org.generation.italy;

public abstract class Veicolo {

	private String marca;
	private int anno;
	private int cilindrata;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnno() {
		return anno;
	}

	@Override
	public String toString() {
		return ",marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata ;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
}
