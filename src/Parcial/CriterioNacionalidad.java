package Parcial;

public class CriterioNacionalidad extends Criterio {
	private String nacionalidad;
	
	public CriterioNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public boolean cumple(VoluntarioSimple voluntario) {	
		return voluntario.getNacionalidad().equals(this.nacionalidad);
	}

}
