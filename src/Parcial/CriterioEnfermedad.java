package Parcial;

public class CriterioEnfermedad extends Criterio {
	private String enfermedad;
	
	public CriterioEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public boolean cumple(VoluntarioSimple voluntario) {	
		return voluntario.tieneEnfermedad(this.enfermedad);
	}

}
