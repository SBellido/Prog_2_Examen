package Parcial;
import java.util.ArrayList;
import java.util.List;

public class VoluntarioSimple extends VoluntarioAbs {
	private String nombre;
	private String nacionalidad;
	private int edad;
	private String genero;
	private boolean placebo;
	private boolean pasoEnfermedad;
	private List<String> enfermedadesPre;

	public VoluntarioSimple(String nombre, String nacionalidad, int edad, String genero, boolean placebo) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad; 
		this.genero = genero;
		this.placebo = placebo;
		this.enfermedadesPre = new ArrayList<>();
	}

	public void agregarEfermedad(String enfermedad) {
		if (!this.tieneEnfermedad(enfermedad)) 
			enfermedadesPre.add(enfermedad);
	}
	
	public boolean tieneEnfermedad(String enfermedad) {
		return this.enfermedadesPre.contains(enfermedad);
	}
	
	public boolean voluntarioSano() {
		return this.enfermedadesPre.isEmpty();
	}
	
	@Override
	public int cantVoluntarios() {
		return 1;
	}

	@Override
	public int cantVoluntarios(Criterio criterio) {
		if (criterio.cumple(this)) 
			return 1;
		 else
			return 0;
	}

	@Override
	public List<VoluntarioSimple> listarPorCriterio(Criterio criterio) {
		List<VoluntarioSimple> voluntarioCumple = new ArrayList<>();
		if (criterio.cumple(this)) {
			voluntarioCumple.add(this);
			return voluntarioCumple;
		}
		return voluntarioCumple;
	}

	
	@Override 
	public boolean equals(Object obj) {
		try {
			VoluntarioSimple aux = (VoluntarioSimple) obj;
			return (this.getEdad() == aux.getEdad() &&
					this.getGenero().equals(aux.getGenero()) &&
					this.getNacionalidad().equals(aux.getNacionalidad()) &&
					this.getNombre().equals(aux.getNombre()));
		} catch (Exception e) {
			return false;
		}
	}
	
	
@Override
	public String toString() {
		return "\n---------------------" + 
				"\nVoluntarioSimple" + 
				"\nNombre: "+ this.getNombre() + 
				"\nNacionalidad: " + this.getNacionalidad() + 
				"\nGénero: " + this.getGenero() + 
				"\nEdad: " + this.getEdad() + 
				"\nPlacebo: " + this.isPlacebo() + 
				"\nPaso Enfermedad: " + this.isPasoEnfermedad() + 
				"\nEnfermedadesPre: " + this.enfermedadesPre;
	}

	//	GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isPlacebo() {
		return placebo;
	}

	public void setPlacebo(boolean placebo) {
		this.placebo = placebo;
	}

	public boolean isPasoEnfermedad() {
		return pasoEnfermedad;
	}

	public void setPasoEnfermedad(boolean pasoEnfermedad) {
		this.pasoEnfermedad = pasoEnfermedad;
	}

}
