package Parcial;

public class CriterioNot extends Criterio {
	private Criterio criterio;
	
	public CriterioNot(Criterio criterio) {
		this.criterio = criterio;
	}

	@Override
	public boolean cumple(VoluntarioSimple voluntario) {		
		return !this.criterio.cumple(voluntario);
	}

}
