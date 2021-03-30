package Parcial;

public class CriterioPlacebo extends Criterio {

	public CriterioPlacebo() {	}

	public boolean cumple(VoluntarioSimple voluntario) {
		return voluntario.isPlacebo();
	}
}
