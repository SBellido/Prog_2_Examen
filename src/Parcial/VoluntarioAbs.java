package Parcial;

import java.util.List;

public abstract class VoluntarioAbs {

	protected abstract int cantVoluntarios();
	protected abstract int cantVoluntarios(Criterio criterio);
	protected abstract List<VoluntarioSimple> listarPorCriterio(Criterio criterio);
	
	public double porcentajeVoluntarios(Criterio criterio) {
		int cantidad = this.cantVoluntarios();
		int cumplen = this.cantVoluntarios(criterio);
		return (double)cumplen / (double)cantidad;
	}


}
