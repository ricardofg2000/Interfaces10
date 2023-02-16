package model;

import java.util.Comparator;

public class CompIntegranteNombre implements Comparator<Integrante> {

	@Override
	public int compare(Integrante o1, Integrante o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getNombre().compareTo(o2.getNombre());
		}
		return comp;
	}

}
