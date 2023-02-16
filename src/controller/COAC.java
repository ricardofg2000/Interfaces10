package controller;

import java.util.Arrays;

import model.*;

public class COAC {

	private Agrupacion[] agrupaciones;
	private Integrante[] integrantes;

	public COAC(Integer n1, Integer n2) {
		agrupaciones = new Agrupacion[n1];
		integrantes = new Integrante[n2];
	}

	public Agrupacion[] getAgrupaciones() {
		return agrupaciones;
	}

	public Agrupacion getAgrupaciones(Integer n) {
		return agrupaciones[n];
	}

	public void setAgrupaciones(Agrupacion[] agrupaciones) {
		this.agrupaciones = agrupaciones;
	}

	public void setAgrupaciones(Integer n1, Agrupacion agrupaciones) {
		this.agrupaciones[n1] = agrupaciones;
	}

	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	public Integrante getIntegrantes(Integer n) {
		return integrantes[n];
	}

	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	public void setIntegrantes(Integer n1, Integrante integrantes) {
		this.integrantes[n1] = integrantes;
	}

	public boolean inscribir_agrupacion(Agrupacion i) {
		boolean isOK = false;
		boolean noEX = true;
		if (i != null) {
			for (int j = 0; j < agrupaciones.length; j++) {
				if (i == agrupaciones[j]) {
					noEX = false;
					break;
				}
			}
		}
		if (noEX) {
			for (int j = 0; j < agrupaciones.length; j++) {
				if (agrupaciones[j] == null) {
					agrupaciones[j] = i;
					isOK = true;
					break;
				}
			}
		}
		return isOK;
	}

	public boolean inscribir_integrante(Integrante i) {
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

	public boolean eliminar_agrupacion(Agrupacion i) {
		boolean isOK = false;
		for (int j = 0; j < agrupaciones.length; j++) {
			if (agrupaciones[j] == i) {
				agrupaciones[j] = null;
				isOK = true;
				break;
			}
		}
		return isOK;
	}

	public boolean eliminar_integrante(Integrante i) {
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

	public void ordenar_por_puntos_menor(AgrupacionOficial[] agO) {
		Arrays.sort(agO, new CompAgrupacionOficialPuntosMenor());
	}

	public void ordenar_por_puntos_mayor(AgrupacionOficial[] agO) {
		Arrays.sort(agO, new CompAgrupacionOficialPuntosMayor());
	}

	public void sortIntegranteName() {
		Arrays.sort(integrantes, new CompIntegranteNombre());
	}

	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones, new CompNombreAgrupacion());
	}

	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new CompAgrupacionAutor());
	}

	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupaciones, new CompAgrupacionAutorMyL());
	}

	public void asignarPuntos(AgrupacionOficial i, Integer puntos) {
		i.setPuntos(puntos);
	}

	public int buscarAgrupacion(Agrupacion agrup) {
		Integer ubi = null;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] == agrup) {
				ubi = i;
				break;
			}
		}
		return ubi;
	}

	public AgrupacionOficial[] getAgrupacionesConcurso() {
		AgrupacionOficial[] aux = new AgrupacionOficial[agrupaciones.length];
		int contAux = 0;
		for (int i = 0; i < aux.length; i++) {
			if (agrupaciones[i] != null && agrupaciones[i] instanceof AgrupacionOficial) {
				aux[contAux++] = (AgrupacionOficial) agrupaciones[i];
			}
		}
		return aux;
	}

	@Override
	public String toString() {
		return "\nCOAC " + Arrays.toString(agrupaciones);
	}
}
