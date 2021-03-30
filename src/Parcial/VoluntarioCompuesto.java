package Parcial;


import java.util.ArrayList;
import java.util.List;

public class VoluntarioCompuesto extends VoluntarioAbs {
	private List<VoluntarioAbs> voluntarios;
	
	public VoluntarioCompuesto() {
		this.voluntarios = new ArrayList<>();
	}

	public void agregarVoluntario(VoluntarioAbs voluntario) {
		if (!this.tieneVoluntario(voluntario))
			this.voluntarios.add(voluntario);
	}
	
	public boolean tieneVoluntario(VoluntarioAbs voluntario) {
		return this.voluntarios.contains(voluntario);
	}
	
	@Override
	public int cantVoluntarios() {
		int total = 0;
		for (VoluntarioAbs voluntarioAbs : this.voluntarios) 
			total += voluntarioAbs.cantVoluntarios();
		return total;
	}

	@Override
	public int cantVoluntarios(Criterio criterio) {
		int total = 0;
		for (VoluntarioAbs voluntarioAbs : this.voluntarios)
			total += voluntarioAbs.cantVoluntarios(criterio);
		return total;
	}

	@Override
	public List<VoluntarioSimple> listarPorCriterio(Criterio criterio) {
		List<VoluntarioSimple> voluntariosCumple = new ArrayList<>();
		for (VoluntarioAbs voluntarioAbs : this.voluntarios) {
			voluntariosCumple.addAll(voluntarioAbs.listarPorCriterio(criterio));
		}
		return voluntariosCumple;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			VoluntarioCompuesto aux = (VoluntarioCompuesto) obj;
			return this.voluntarios.containsAll(aux.voluntarios);
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "" + this.voluntarios;
	}
}
