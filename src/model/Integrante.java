package model;

public class Integrante {
	private Integer numeroParticipante;
	private String nombre;
	private Integer edad;
	private String localidad;
	private static Integer cont = 1;

	public Integrante() {
		setNumeroParticipante(cont++);
	}

	public Integrante(String nombre, Integer edad, String localidad) {
		setNumeroParticipante(cont++);
		setNombre(nombre);
		setEdad(edad);
		setLocalidad(localidad);
	}

	public Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	private void setNumeroParticipante(Integer numeroParticipante) {
		this.numeroParticipante = numeroParticipante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		}

	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Integrante " + numeroParticipante + " Nombre=" + nombre + " Edad=" + edad + " Localidad=" + localidad;
	}

}
