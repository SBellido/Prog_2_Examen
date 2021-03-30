package Parcial;

public class CriterioSinEnfermedad extends Criterio {

	public CriterioSinEnfermedad() {

	}

	@Override
	protected boolean cumple(VoluntarioSimple voluntario) {	
		return voluntario.voluntarioSano();
	}

}
