package model;

public class Comparsa extends AgrupacionOficial {
	private String empresaA;

	public Comparsa() {
		super();
	}

	public Comparsa(String nombre, String autor, String autorM, String autorL, String tipo, Integer puntos,
			String empresaA) {
		super(nombre, autor, autorM, autorL, tipo, puntos);
		setEmpresaA(empresaA);
	}

	public String getEmpresaA() {
		return empresaA;
	}

	public void setEmpresaA(String empresaA) {
		this.empresaA = empresaA;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Comparsa de nombre" + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La comparsa " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String caminitoDelFalla() {
		return "La comparsa " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String toString() {
		return "Comparsa " + super.toString() + ", Empresa del atrezzo=" + empresaA;
	}
}
