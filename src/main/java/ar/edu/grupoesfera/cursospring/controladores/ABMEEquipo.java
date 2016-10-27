package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.servicios.EquipoService;
import ar.edu.grupoesfera.cursospring.servicios.TorneoService;

@RestController
public class ABMEEquipo {
	
	@Inject
	private TorneoService  torneoServise;
	
	@RequestMapping("usuarioRegistrado/verTorneo/{nombreDeTorneo}/agregarEquipo")
	public ModelAndView agregarTorneo(
			@PathVariable ("nombreDeTorneo") String nombreDeTorneo
			)
	{
		ModelMap modelAgregarTorneo= new ModelMap();
		modelAgregarTorneo.put("equipo", new Equipo(null));
		modelAgregarTorneo.put("nombreTorneo", nombreDeTorneo);//mostrar el nombre del torneo
		
		return new ModelAndView("torneoFormularioAgregar",modelAgregarTorneo);
	}
	
	
	//ver lista de equipos vacio
	@RequestMapping("usuarioRegistrado/verTorneo/{nombreDeTorneo}")
	public ModelAndView mostrarEquiposDeUnTorneoVacio
	(
			@PathVariable ("nombreDeTorneo") String nombreDeTorneo
	)
	
	{
		ModelMap TorneoVacioModelo=new ModelMap();
		TorneoVacioModelo.put("listaDeEquipos", torneoServise.mostrarEquipos());
		TorneoVacioModelo.put("nombreTorneo", nombreDeTorneo);
		return new ModelAndView("listaDeEquiposEnTorneo",TorneoVacioModelo);		
	}
	
	@RequestMapping("usuarioRegistrado/verTorneo/{nombreDeTorneo}/torneoEquipos")
	public ModelAndView mostrarEquiposDeUnTorneoVista (
			@RequestParam ("nombre") String nombre,
			@PathVariable ("nombreDeTorneo") String nombreDeTorneo
			
			)
	{
		ModelMap modeloTorneoEquipos=new ModelMap();
		torneoServise.agregarEquipoAalTorneo(nombre);
		modeloTorneoEquipos.put("listaDeEquipos", torneoServise.mostrarEquipos());
		modeloTorneoEquipos.put("nombreTorneo", nombreDeTorneo);//mostrar el nombre del torneo
		return new ModelAndView("listaDeEquiposEnTorneoAgregar",modeloTorneoEquipos);//cree el agregar y el lista eliminar para evitar bugs
	}
	
	@RequestMapping(value="usuarioRegistrado/verTorneo/{nombreDeTorneo}/{equipoAEliminar}",method = RequestMethod.GET)
	public ModelAndView eliminarUnEquipoPorUrl1(
			@PathVariable ("equipoAEliminar") String nombre1,
			@PathVariable ("nombreDeTorneo") String nombreDeTorneo
			)
	{
		
		ModelMap modeloEliminar1= new ModelMap();
		torneoServise.eliminarEquipoDeTorneo(nombre1);
		modeloEliminar1.put("nombreTorneo", nombreDeTorneo);//mostrar el nombre del torneo
		modeloEliminar1.put("listaDeEquipos", torneoServise.mostrarEquipos());
		return new ModelAndView("listaDeEquiposEnTorneoEliminar",modeloEliminar1);
	
	}
	//modificar
	
	@RequestMapping("torneo/modificarEquipo")
	public ModelAndView modificarEquipoEnTorneo1()
	{
		ModelMap modeloModifEquipo1=new ModelMap();
		
		modeloModifEquipo1.put("listaDeEquipos", torneoServise.mostrarEquipos());
		Equipo e1=new Equipo(null);
		modeloModifEquipo1.put("equipo", e1);
		return new ModelAndView("formModificarEquipo1",modeloModifEquipo1);
	}
	
	@RequestMapping(value="torneo/modificarEquipo2",method = RequestMethod.POST)
	public ModelAndView modificarEquipoEnTorneo2(
			@ModelAttribute ("nombre") String nombre
			)
	{
		ModelMap modeloModifEquipo2=new ModelMap();
		
		try {
			
			modeloModifEquipo2.put("equipo",torneoServise.buscarUnEquipoDeterminado(nombre));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ModelAndView("formModificarEquipo2",modeloModifEquipo2);
	}
}
