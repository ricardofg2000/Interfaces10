package model;

public class Chirigota extends AgrupacionOficial implements Callejera {
	private Integer cuples;

	public Chirigota() {
		super();
	}

	public Chirigota(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			Integer cuples) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setCuples(cuples);
	}

	public Integer getCuples() {
		return cuples;
	}

	public void setCuples(Integer cuples) {
		this.cuples = cuples;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Chirigota de nombre" + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La chirigota " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String caminitoDelFalla() {
		return "La chirigota " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota " + super.getNombre();
	}

	@Override
	public String toString() {
		return "Chirigota " + super.toString() + ", cuples=" + cuples;
	}

}
