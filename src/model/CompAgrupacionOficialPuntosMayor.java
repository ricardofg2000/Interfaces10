package model;

import java.util.Comparator;

public class CompAgrupacionOficialPuntosMayor implements Comparator<AgrupacionOficial>{

	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getPuntos().compareTo(o2.getPuntos());
		}
		return (comp*-1);
	}
}
