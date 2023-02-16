package model;

import java.util.Comparator;

public class CompAgrupacionAutor implements Comparator<Agrupacion> {

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getAutor().compareTo(o2.getAutor());
		}
		return comp;
	}

}
