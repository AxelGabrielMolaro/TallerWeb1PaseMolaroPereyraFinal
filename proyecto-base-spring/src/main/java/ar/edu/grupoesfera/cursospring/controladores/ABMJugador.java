package ar.edu.grupoesfera.cursospring.controladores;

import java.util.HashSet;

import javax.inject.Inject;

import org.aspectj.weaver.NewMethodTypeMunger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.servicios.EquipoService;

@RestController
public class ABMJugador {

	//atributo de la interface
	@Inject
	private EquipoService equipoService;
	
	
	//mostrarEquipoVacio
	@RequestMapping("usuarioRegistrado/verTorneo/{nombreDelTorneo}/equipo/{nombreDelEquipo}")
	public ModelAndView mostrarEquipoVacio(
			@PathVariable ("nombreDelEquipo") String nombreEquipo
			)
	{
		ModelMap modeloEquipoVacio=new ModelMap();
		modeloEquipoVacio.put("listaDeJugadores", equipoService.MostrarJugadores());
		modeloEquipoVacio.put("nombreEquipo", nombreEquipo);
		return new ModelAndView("equipo",modeloEquipoVacio);
	}
	
	
	
	//agregar Jugador
	@RequestMapping("usuarioRegistrado/verTorneo/{nombreDelTorneo}/equipo/{nombreDelEquipo}/agregarJugador")
	public ModelAndView agregarJugadorForm()
	{
		ModelMap modeloAgregarJ=new ModelMap();
		modeloAgregarJ.put("jugador", new Jugador(null, null, null));
		return new ModelAndView("agregarJugadorForm",modeloAgregarJ);
	}
	
	//mostrar equipo con un jugador
	@RequestMapping(value="usuarioRegistrado/verTorneo/{nombreDelTorneo}/equipo/{nombreDelEquipo}/equipo2",method = RequestMethod.POST)
	public ModelAndView obtenerUnaListDeJug(
			@RequestParam ("apellido") String apellido,
			@RequestParam ("nombre") String nombre,
			@RequestParam ("documento")Integer documento,
			@PathVariable ("nombreDelTorneo")String nombreTorneo,
			@PathVariable("nombreDelEquipo")String nombreEquipo

			)
	{
		try {
			this.equipoService.agregarJugador(nombre, apellido, documento);
			HashSet<Jugador>listaDejugadores=this.equipoService.MostrarJugadores();
			ModelMap modeloAgregarJugador=new ModelMap();
			modeloAgregarJugador.put("listaDeJugadores", listaDejugadores);
			modeloAgregarJugador.put("nombreTorneo", nombreTorneo);
			modeloAgregarJugador.put("nombreEquipo", nombreEquipo);
			return new ModelAndView("equipo2",modeloAgregarJugador);//cree equyipo 2 por un bug
		} catch (Exception e) {
			ModelMap modelExepcion=new ModelMap();
			modelExepcion.put("exepcion",e.getMessage());
			return new ModelAndView("exepcion",modelExepcion);
		}
		
		
		
		
	}
	
	
	//eliminar
	@RequestMapping(value="usuarioRegistrado/verTorneo/{nombreDelTorneo}/equipo/{nombreDelEquipo}/{documento}",method = RequestMethod.GET)
	public ModelAndView eliminarJugadorGet(
			@PathVariable ("documento")Integer documento
			)
	{
		ModelMap modeloEliminar = new ModelMap();
		try {
			equipoService.eliminarJugador(documento);
			modeloEliminar.put("listaDeJugadores",equipoService.MostrarJugadores());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("equipo3",modeloEliminar);
	}
	//modificar
	@RequestMapping("usuarioRegistrado/verTorneo/{nombreDelTorneo}/equipo/{nombreDelEquipo}/modificarJugador")
	public ModelAndView modificarJugadorForm()
	{
		ModelMap modeloModificar1=new ModelMap();
		Jugador j1=new Jugador(null, null, null);
		modeloModificar1.put("jugador", j1);
		modeloModificar1.put("listaDeJugadores",equipoService.MostrarJugadores() );
		return new ModelAndView("modificarFormulario1",modeloModificar1);
	}
	
	
	@RequestMapping(value="usuarioRegistrado/verTorneo/{nombreDelTorneo}/equipo/{nombreDelEquipo}/moficarJugador2",method = RequestMethod.POST)
	public ModelAndView modificarJugadorForm2
	(
		@RequestParam("documento")Integer documento
	)
	{
		ModelMap modeloModif2=new ModelMap();
		try {
			modeloModif2.put("jugador", equipoService.buscarJugador(documento));
		} catch (Exception e) {

				//nada aun
		}
		return new ModelAndView("modificarFormulario2",modeloModif2);
	}
	
	@RequestMapping(value="usuarioRegistrado/verTorneo/{nombreDelTorneo}/equipo/{nombreDelEquipo}/modificarJugador3",method = RequestMethod.POST)
	public ModelAndView modificarJugadorForm3
	(
		@RequestParam ("apellido") String apellido,
		@RequestParam ("nombre") String nombre,
		@RequestParam("documento")Integer documento
	)
	{
		ModelMap modeloModif3=new ModelMap();
		try {
			Jugador jugadorBuscado=equipoService.buscarJugador(documento);
			jugadorBuscado.setApellido(apellido);
			jugadorBuscado.setNombre(nombre);
			jugadorBuscado.setDocumento(documento);
			modeloModif3.put("listaDeJugadores",equipoService.MostrarJugadores() );
		} catch (Exception e) {

				//nada aun
		}
		return new ModelAndView("equipo3",modeloModif3);
	}
	
	
}
