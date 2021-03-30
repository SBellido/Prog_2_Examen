package Parcial;

import java.util.ArrayList;
import java.util.List;

public class VoluntarioCompuestoPrivado extends VoluntarioCompuesto {

	public VoluntarioCompuestoPrivado() { }
	
	@Override
	public List<VoluntarioSimple> listarPorCriterio(Criterio criterio) {
		List<VoluntarioSimple> listaVacia = new ArrayList<>();
		return listaVacia;
	}

}
