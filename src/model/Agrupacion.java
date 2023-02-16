package model;

public abstract class Agrupacion implements Comparable<Agrupacion> {

	private String nombre;
	private String autor;
	private String autorM;
	private String autorL;
	private String tipo;
	private Integer agrupacionesTotales;
	private static Integer cont = 1;

	public Agrupacion() {
		setAgrupacionesTotales(cont++);
	}

	public Agrupacion(String nombre, String autor, String autorM, String autorL, String tipo) {
		setAgrupacionesTotales(cont++);
		setNombre(nombre);
		setAutor(autor);
		setAutorM(autorM);
		setAutorL(autorL);
		setTipo(tipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorM() {
		return autorM;
	}

	public void setAutorM(String autorM) {
		this.autorM = autorM;
	}

	public String getAutorL() {
		return autorL;
	}

	public void setAutorL(String autorL) {
		this.autorL = autorL;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getAgrupacionesTotales() {
		return agrupacionesTotales;
	}

	public void setAgrupacionesTotales(Integer agrupacionesTotales) {
		this.agrupacionesTotales = agrupacionesTotales;
	}

	public static Integer getCont() {
		return cont;
	}

	private static void setCont(Integer cont) {
		Agrupacion.cont = cont;
	}

	public abstract String cantarPresentacion();

	public abstract String hacerTipo();

	@Override
	public int compareTo(Agrupacion a2) {
		return this.getNombre().compareTo(a2.getNombre());
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Autor=" + autor + ", AutorM=" + autorM + ", AutorL=" + autorL + ", Tipo=" + tipo;
	}

}
