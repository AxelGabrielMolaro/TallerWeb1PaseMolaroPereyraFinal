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

import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;
import ar.edu.grupoesfera.cursospring.servicios.UsuarioRegistradoService;

@RestController
public class ABMTorneo {
	
	@Inject
	private UsuarioRegistradoService usuarioRegistradoService;
	
	@RequestMapping("usuarioRegistrado/listaDeTorneos")
	public ModelAndView mostrarListaVacia()
	{
		ModelMap modeloVacio=new ModelMap();
		modeloVacio.put("listaDeTorneos", usuarioRegistradoService.MostrarTorneos());
		return new ModelAndView("listaDeTorneos",modeloVacio);
	}
	
	//Buscar torneo
	@RequestMapping(value="buscar",method=RequestMethod.POST)
	public ModelAndView buscarTorneo(@ModelAttribute("SpringMvc")@RequestParam("nombre")String nombre,ModelMap model) throws Exception{
		try{
			System.out.print("entre en el try");
			model.put("torneoBuscado",this.usuarioRegistradoService.buscarTorneo(nombre));
			return new ModelAndView ("resultadoBusquedaTorneo",model);
		}catch(Exception e){
			ModelMap modelExepcion=new ModelMap();
			modelExepcion.put("exepcion",e.getMessage());
			return new ModelAndView("exepcion",modelExepcion);
		}
	}
	
	//agregar equipo
	
	@RequestMapping("usuarioRegistrado/agregarTorneo")
	public ModelAndView formAgregarTorneo()
	{
		ModelMap modeloAgregarForm1=new ModelMap();
		Torneo t1=new Torneo(null);
		modeloAgregarForm1.put("torneo", t1);
		return new ModelAndView("agregarTorneoFormulario",modeloAgregarForm1);
		
	}
	
	@RequestMapping(value="usuarioRegistrado/listaDeTorneos",method=RequestMethod.POST)
	public ModelAndView mostrarTorneosDpsDeAgregar(
			@RequestParam ("nombre") String nombre
			)
	{
		ModelMap modeloAgregarTorneo2=new ModelMap();
		try {
			usuarioRegistradoService.agregarTorneo(nombre);
			modeloAgregarTorneo2.put("listaDeTorneos", usuarioRegistradoService.MostrarTorneos());
			return new ModelAndView("listaDeTorneos",modeloAgregarTorneo2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	//eliminar
	@RequestMapping(value="usuarioRegistrado/{torneoAEliminar}",method = RequestMethod.GET)
	public ModelAndView eliminarTorneo(
			@PathVariable("torneoAEliminar") String nombre
			)
	{
		ModelMap modeloEliminarTorneo=new ModelMap();
		try {
			usuarioRegistradoService.eliminarTorneo(nombre);
			modeloEliminarTorneo.put("listaDeTorneos", usuarioRegistradoService.MostrarTorneos());
			return new ModelAndView("listaDeTorneos",modeloEliminarTorneo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
}
