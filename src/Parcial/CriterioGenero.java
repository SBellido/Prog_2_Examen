package Parcial;

public class CriterioGenero extends Criterio {
	private String genero;
	
	public CriterioGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean cumple(VoluntarioSimple voluntario) {
		return voluntario.getGenero().equals(this.genero);
	}

}
