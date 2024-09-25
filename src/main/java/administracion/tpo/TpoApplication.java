package administracion.tpo;

import administracion.tpo.dao.*;
import administracion.tpo.modelo.*;
import administracion.tpo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class TpoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TpoApplication.class, args);
	}

	@Autowired
	private IRepositotyInquilinos repositoryInquilino;
	@Autowired
	private IRepositoryDuenios repositoryDuenios;
	@Autowired
	private IRepositoryPersona repositoryPersona;
	@Autowired
	private IRepositoryEdificio repositoryEdificio;
	@Autowired
	private IRepositoryUnidad repositoryUnidad;
	@Autowired
	private IRepositoryImagen repositoryImagen;
	@Autowired
	private IRepositoryReclamo repositoryReclamo;

	@Override
	public void run(String... args) throws Exception {

		/*
		List<Edificio> edificios = EdificioDAO.getInstance().getAll(repositoryEdificio);
		List<Unidad> unidades = UnidadDAO.getInstance().getAll(repositoryUnidad);
		List<Persona> personas = PersonaDAO.getInstance().getAll(repositoryPersona);
		List<Reclamo> reclamos = ReclamoDAO.getInstance().getAll(repositoryReclamo);


		for (Edificio edificio : edificios) {
			System.out.println(edificio.toString());
		}

		for (Unidad unidad : unidades) {
			System.out.println(unidad.toString());
		}

		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		for (Reclamo reclamo : reclamos) {
			System.out.println(reclamo.toString());
		}
		*/
		
		/*
		Optional<Persona> p=PersonaDAO.getInstance().getById("DNI92876004", repositoryPersona);
		System.out.println(p);
		*/

		/*
		List<Imagen> imagenList = ImagenDAO.getInstance().getAll(repositoryImagen);

		for (Imagen i : imagenList) {
			System.out.println(i.toString());
		}
		*/
		
		/* agregar una nueva persona
		Persona nueva=new Persona("DNI893012344","PEPE, JULIAN");
		PersonaDAO.getInstance().save(nueva, repositoryPersona);
		*/
		
		/* comprobar si esa persona se guardó correctamente
		 * el Optional se usa si ese objeto a retornar no existe
		Optional<Persona> p2=PersonaDAO.getInstance().getById("DNI893012344", repositoryPersona);
		System.out.println(p2);
		*/
		
		//se elimina a la persona agregada anteriormente
		//PersonaDAO.getInstance().delete("DNI893012344", repositoryPersona);
		
		/*
		List<Unidad> unidades = UnidadDAO.getInstance().getAll(repositoryUnidad);
		for (Unidad unidad : unidades) {
			System.out.println(unidad.toString());
		}
		*/
		
		/*
		List<Persona> personas = PersonaDAO.getInstance().getAll(repositoryPersona);
		for(Persona p:personas) {
			System.out.println(p.toString());
		}*/
		/*
		List<Unidad> unidades = UnidadDAO.getInstance().getAll(repositoryUnidad);
		for (Unidad unidad : unidades) {
			System.out.println(unidad.toString());
		}
		*/

/*PERSONA
		Persona persona = new Persona("31313131313131311","juani");
		//CREATE
		PersonaDAO.getInstance().save(persona,repositoryPersona);
		//READ
		Optional<Persona> p = PersonaDAO.getInstance().getById("31313131313131311",repositoryPersona);
		if
		System.out.println(p.toString());
		//UPDATE
		Persona persona1 = new Persona("31313131313131311","ivan");
		PersonaDAO.getInstance().save(persona1,repositoryPersona);
		//DELETE
		PersonaDAO.getInstance().delete("31313131313131311",repositoryPersona);
*/
/*DUENIOS
		//CREATE
		Duenios duenio = new Duenios(111111,"3131131313131");
		DueniosDAO.getInstance().save(duenio,repositoryDuenios);
		//READ
		Optional<Duenios> dueniosOptional =DueniosDAO.getInstance().getById(1773,repositoryDuenios);
		if(dueniosOptional.isPresent())
		System.out.println(dueniosOptional.toString());
		//UPDATE
		Duenios dUpdate = new Duenios(1773,111111,"3131131313132");
		DueniosDAO.getInstance().save(dUpdate,repositoryDuenios);
		//DELETE
		DueniosDAO.getInstance().delete(1773,repositoryDuenios);
*/

/*EDIFICIO*/
		/*
		//CREATE no esta hablitado crear edificios
		Edificio edificio = new Edificio("edificioLuqui","direcciondeLuqui");
		EdificioDAO.getInstance().save(edificio,repositoryEdificio);
		//READ
		List<Edificio> edificioOptional =EdificioDAO.getInstance().getAll(repositoryEdificio);
		for (Edificio edificio : edificioOptional) {
			System.out.println(edificio.toString());
		}

		//UPDATE
		Edificio eUpdate = new Edificio();
		EdificioDAO.getInstance().save(eUpdate,repositoryEdificio);
		//DELETE
		EdificioDAO.getInstance().delete(10,repositoryEdificio);
		*/

/*UNIDAD
		//CREATE
		Unidad unidad = new Unidad();
		UnidadDAO.getInstance().save(unidad,repositoryUnidad);
		//READ
		Optional<Unidad> unidadOptional =UnidadDAO.getInstance().getById(1773,repositoryUnidad);
		if(unidadOptional.isPresent())
			System.out.println(unidadOptional.toString());
		//UPDATE
		Unidad uUpdate = new Unidad();
		UnidadDAO.getInstance().save();
		//DELETE
		UnidadDAO.getInstance().delete();
*/

/*EDIFICIO
		//CREATE
		Imagen imagen = new Imagen();
		ImagenDAO.getInstance().save(imagen,repositoryImagen);
		//READ
		Optional<Imagen> imagenOptional =ImagenDAO.getInstance().getById(repositoryImagen);
		if(imagenOptional.isPresent())
			System.out.println(imagenOptional.toString());
		//UPDATE
		Imagen iUpdate = new Imagen();
		ImagenDAO.getInstance().save(iUpdate,repositoryImagen);
		//DELETE
		//ImagenDAO.getInstance().delete(repositoryImagen);
*/
/*RECLAMO*/
		//CREATE
		//READ
		//UPDATE
		//DELETE
/*INQUILINO

		//CREATE
		Inquilino inquilino = new Inquilino();
		InquilinoDAO.getInstance().save(inquilino,repositoryInquilino);
		//READ
		Optional<Inquilino> inquilinoOptional =InquilinoDAO.getInstance().getById(,repositoryInquilino);
		if(inquilinoOptional.isPresent())
			System.out.println(inquilinoOptional.toString());
		//UPDATE
		Inquilino iUpdate = new Inquilino();
		InquilinoDAO.getInstance().save();
		//DELETE
		InquilinoDAO.getInstance().delete();
		*/

	}
}
