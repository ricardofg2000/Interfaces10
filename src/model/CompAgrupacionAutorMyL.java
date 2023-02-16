package model;

import java.util.Comparator;

public class CompAgrupacionAutorMyL implements Comparator<Agrupacion> {

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getAutorM().compareTo(o2.getAutorM());
			if (comp == 0) {
				comp = o1.getAutorL().compareTo(o2.getAutorL());
			}
		}
		return comp;
	}

}
