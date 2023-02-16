package model;

public class Cuarteto extends AgrupacionOficial implements Callejera {
	private Integer miembros;

	public Cuarteto() {
		super();
	}

	public Cuarteto(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			Integer miembros) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setMiembros(super.getContIntegrantes());
	}

	public Integer getMiembros() {
		return miembros;
	}

	public void setMiembros(Integer miembros) {
		this.miembros = miembros;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del cuarteto de nombre" + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El cuarteto " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String caminitoDelFalla() {
		return "El cuarteto " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota " + super.getNombre();
	}

	@Override
	public String toString() {
		return "Cuarteto " + super.toString() + ", Número miembros=" + super.getContIntegrantes();
	}
}
