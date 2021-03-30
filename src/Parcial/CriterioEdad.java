package Parcial;

public class CriterioEdad extends Criterio {
	private int edad;
	
	public CriterioEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(VoluntarioSimple voluntario) {
		return voluntario.getEdad() > this.edad;
	}

}
