package model;

public class Coro extends AgrupacionOficial {
	private Integer bandurrias;
	private Integer guitarras;

	public Coro() {
		super();
	}

	public Coro(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			Integer bandurrias, Integer guitarras) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setBandurrias(bandurrias);
		setGuitarras(guitarras);
	}

	public Integer getBandurrias() {
		return bandurrias;
	}

	public void setBandurrias(Integer bandurrias) {
		this.bandurrias = bandurrias;
	}

	public Integer getGuitarras() {
		return guitarras;
	}

	public void setGuitarras(Integer guitarras) {
		this.guitarras = guitarras;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Coro de nombre" + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El coro " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String caminitoDelFalla() {
		return "El coro " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String toString() {
		return "Coro " + super.toString() + ", Número bandurrias=" + bandurrias + ", Número guitarras=" + guitarras;
	}
}
