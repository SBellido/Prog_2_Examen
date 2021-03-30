package Parcial;

/*
 * Para el siguiente problema. reconocer los objetos, su estado y comportamiento, e
implementar en JAVA

La OMS desea implementar un sistema para el control de los estudios clÃ­nicos que se
realizan para evaluar la efectividad de diversas vacunas. En una fase avanzada de los
estudios, las vacunas deben ser probadas en personas con diversas caracterÃ­sticas. Para
ello, mantiene un banco de voluntarios de los cuales se registra su nombre, nacionalidad,
edad, gÃ©nero, un conjunto de enfermedades preexistentes (por ejemplo, diabetes,
hipertensiÃ³n, asma, etc.), si recibiÃ³ el placebo o la vacuna, y si contrajo la enfermedad.
Para una mejor organizaciÃ³n de los voluntarios, estos se agrupan por zona geogrÃ¡fica, es
decir por barrios, ciudades, provincias. Hay zonas que estÃ¡n incompletas y por eso puede
ser que en una ciudad ademÃ¡s de barrios haya voluntarios sueltos y esto se repita para
provincias, o paÃ­ses.

Dada un barrio, ciudad, o provincia, el sistema debe poder responder a los siguiente servicios:
â—� Contar la cantidad de voluntarios que participaron del estudio.
â—� Contar la cantidad de voluntarios que recibieron un placebo.
â—� Contar la cantidad de voluntarios que recibieron la vacuna.
â—� Contar la cantidad de voluntarios con â€œdiabetesâ€� que recibieron la vacuna y no contrajeron la enfermedad.
â—� Cualquier combinaciÃ³n lÃ³gica de los anteriores.
â—� Obtener el porcentaje de voluntarios que recibieron la vacuna.
â—� Obtener el porcentaje de voluntarios que contrajeron la enfermedad y recibieron un placebo.
â—� Obtener el porcentaje de voluntarios de mÃ¡s de 60 aÃ±os, femeninos, de nacionalidad Argentina que recibieron la vacuna.
â—� Cualquier combinaciÃ³n lÃ³gica de los anteriores.

NOTA: Los porcentajes se obtienen como la cantidad de voluntarios que cumplen con la
condiciÃ³n dada, dividido el total de voluntarios participantes.
La OMS tambiÃ©n desea reutilizar la lista de voluntarios que participaron de estudios
clÃ­nicos previos. Por tal razÃ³n, cuando surge una nueva vacuna, se desea listar a todos
los voluntarios que pueden participar en la evaluaciÃ³n. 

Para ello, se especifican distintos criterios:
â—� Voluntarios de mÃ¡s de 25 aÃ±os, que no posean hipertensiÃ³n.
â—� Voluntarios masculinos que padezcan asma, pero no sean diabÃ©ticos.
â—� Voluntarios que no poseen enfermedades preexistentes.
â—� Cualquier combinaciÃ³n lÃ³gica de los anteriores.

Debido a que en algunos paÃ­ses se respeta la privacidad de los voluntarios, la OMS
accede a la creaciÃ³n de grupos privados. Estos grupos nunca informan la lista de
voluntarios (los listados no incluyen a ningÃºn voluntario que pertenezca al grupo privado),
aunque sÃ­ acceder al nÃºmero de participantes y porcentajes. Estos grupos pueden
contener voluntarios, un barrio, ciudad, o provincia.

Tener en cuenta todos los conceptos vistos durante el desarrollo de la materia.
 */
public class MainRecuperatorio {

	public static void main(String[] args) {
		VoluntarioSimple juan = new VoluntarioSimple("Juan PÃ©rez", "Argentino", 34, "Transgenero", true);
		VoluntarioSimple juana = new VoluntarioSimple("Juana PÃ©rez", "Peruano", 23, "Pansexual", false);
		VoluntarioSimple pedro = new VoluntarioSimple("Pedro Martinez", "Argentino", 45, "Masculino", false);
		VoluntarioSimple martina = new VoluntarioSimple("Martina Rodriguez", "Argentino", 21, "Femenino", true);
		VoluntarioSimple seba = new VoluntarioSimple("SebastiÃ¡n Bellido", "Argentino", 41, "Masculino", false);

		juan.agregarEfermedad("diabetes");
		juan.agregarEfermedad("asma");
		juana.agregarEfermedad("reflujo");
		juana.agregarEfermedad("dolores varios");
		pedro.agregarEfermedad("otitis");
		pedro.agregarEfermedad("infecciÃ³n");
		martina.agregarEfermedad("infecciÃ³n");
		martina.agregarEfermedad("diabetes");
		
		VoluntarioCompuesto tandil = new VoluntarioCompuesto();
		VoluntarioCompuesto barrio = new VoluntarioCompuesto();
		
		VoluntarioCompuestoPrivado barrioPrivado = new VoluntarioCompuestoPrivado();
		
		CriterioEnfermedad criterioEnfermedad = new CriterioEnfermedad("diabetes");
		CriterioEdad criterioEdad = new CriterioEdad(40);
		CriterioNacionalidad criterioNacionalidad = new CriterioNacionalidad("Peruano");
		CriterioPlacebo criterioPlacebo = new CriterioPlacebo();
		CriterioGenero criterioGenero = new CriterioGenero("Masculino");
		CriterioNot criterioNot = new CriterioNot(criterioPlacebo);
		CriterioAnd criterioAnd = new CriterioAnd(criterioGenero, criterioNacionalidad);
		CriterioOr criterioOr = new CriterioOr(criterioGenero, criterioNacionalidad);
		CriterioSinEnfermedad criterioSinEnfermedad = new CriterioSinEnfermedad();
		
		barrio.agregarVoluntario(juan);
		barrio.agregarVoluntario(juana);
		barrio.agregarVoluntario(pedro);
		barrio.agregarVoluntario(martina);
		barrioPrivado.agregarVoluntario(seba);
		tandil.agregarVoluntario(barrio);
		tandil.agregarVoluntario(barrio);
		tandil.agregarVoluntario(barrioPrivado);
		
//		System.out.println(tandil);
//		System.out.println(tandil.listarPorCriterio(criterioGenero));
		System.out.println(tandil.cantVoluntarios());
		System.out.println(tandil.cantVoluntarios(criterioNot));
		System.out.println(tandil.porcentajeVoluntarios(criterioEdad) + "%");
		
		
	}

}
