package model;

public class Romancero extends Agrupacion implements Callejera {
	private String tematicaC;

	public Romancero() {
		super();
	}

	public Romancero(String nombre, String autor, String autorM, String autorL, String tipo, String tematicaC) {
		super(nombre, autor, autorM, autorL, tipo);
		setTematicaC(tematicaC);
	}

	public String getTematicaC() {
		return tematicaC;
	}

	public void setTematicaC(String tematicaC) {
		this.tematicaC = tematicaC;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Romancero de nombre" + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El romancero " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota " + super.getNombre();
	}

	@Override
	public String toString() {
		return "Romancero " + super.toString() + ", Temática del cartelón=" + tematicaC;
	}
}
