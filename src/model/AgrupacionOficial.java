package model;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {
	private final Integer MAX_INT = 10;
	private Integer puntos;
	private Integrante[] integrantes;
	private Integer contIntegrantes = 0;

	public AgrupacionOficial() {
		super();
		integrantes = new Integrante[MAX_INT];
	}

	public AgrupacionOficial(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos) {
		super(nombre, autor, autorM, autorL, tipo);
		setPuntos(puntos);
		integrantes = new Integrante[MAX_INT];
	}

	public Integer getContIntegrantes() {
		return contIntegrantes;
	}

	public void setContIntegrantes(Integer contIntegrantes) {
		this.contIntegrantes = contIntegrantes;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Integrante[] getIntegrantes() {
		return integrantes;
	}
	
	public Integrante getIntegrantes(Integer i) {
		return integrantes[i];
	}

	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	public Integer getMAX_INT() {
		return MAX_INT;
	}

	public boolean insertarIntegrante(Integrante i) {
		boolean isOK = false;
		boolean noEX = true;
		if (i != null) {
			for (int j = 0; j < integrantes.length; j++) {
				if (i == integrantes[j]) {
					noEX = false;
					break;
				}
			}
		}
		if (noEX) {
			for (int j = 0; j < integrantes.length; j++) {
				if (integrantes[j] == null) {
					integrantes[j] = i;
					isOK = true;
					break;
				}
			}
		}
		return isOK;
	}

	boolean eliminarIntegrante(Integrante i) {
		boolean isOK = false;
		for (int j = 0; j < integrantes.length; j++) {
			if (integrantes[j] == i) {
				integrantes[j] = null;
				isOK = true;
				break;
			}
		}
		return isOK;
	}
	
	public String listadoIntegrante() {
		String texto = "";
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] != null) {
				texto += integrantes[i];
			}
		}
		return texto;
	}

	public abstract String caminitoDelFalla();

	@Override
	public String toString() {
		return super.toString() + ", Puntos=" + puntos + ", integrantes=" + listadoIntegrante();
	}

}
