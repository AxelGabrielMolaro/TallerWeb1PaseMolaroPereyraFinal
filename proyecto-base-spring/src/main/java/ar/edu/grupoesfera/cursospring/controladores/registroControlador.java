package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;
import ar.edu.grupoesfera.cursospring.servicios.RegistroService;

@RestController
public class registroControlador {

	@Inject
	private RegistroService registroService;
	
	//fformulario de registro
	@RequestMapping("registro")
	public ModelAndView modeloRegistroForm()
	{
		ModelMap modeloRegistroForm=new ModelMap();
		UsuarioRegistrado usuarioVacio=new UsuarioRegistrado(null, null, null, null);
		modeloRegistroForm.put("usuario", usuarioVacio);
		return new ModelAndView("formularioDeRegistro",modeloRegistroForm);
	}
	
	//agrego un Uuser Registrado
	@RequestMapping(value="loginFormularioLogin",method= RequestMethod.POST)
	public ModelAndView loginFormulario1(
			@RequestParam ("nombre") String nombre,
			@RequestParam ("apellido") String apellido,
			@RequestParam ("mail") String mail,
			@RequestParam ("contraseña") String contraseña
			)
	{
		ModelMap modeloLoginForm=new ModelMap();
		try {
			
			registroService.agregarUsuarioRegistradoAAlmacen(nombre, apellido, mail, contraseña);
			modeloLoginForm.put("listaDeUsuarios", registroService.mostrarUsuariosRegistradosEnAlmacen());
			modeloLoginForm.put("usuario",new UsuarioRegistrado(null, null, null, null));
			modeloLoginForm.put("torneo",new Torneo(null));//esto para que muestreel busar torneo el index
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//return new  ModelAndView("loginForm",modeloLoginForm); antes
		return new  ModelAndView("home",modeloLoginForm);//rediriege al home ahora
				
	}
	
	//validacion posta refirige a hom2
	
	
		@RequestMapping(value="home2",method=RequestMethod.POST)
		public ModelAndView validacionDelLogin2(
				@RequestParam("mail") String mail,
				@RequestParam("contraseña") String contraseña
				
				)
		{
			ModelMap modelosValidarLogin2=new ModelMap();
			try {
				modelosValidarLogin2.put("resultado",registroService.validarLoginMailContra(mail, contraseña));
				modelosValidarLogin2.put("c",contraseña);
				modelosValidarLogin2.put("m", mail);
				modelosValidarLogin2.put("torneo",new Torneo(null));//para mostrar el buscar toneo
			} catch (Exception e) {
				ModelMap modelExepcion=new ModelMap();
				modelExepcion.put("exepcion",e.getMessage());
				return new ModelAndView("exepcion",modelExepcion);
			}
			return new ModelAndView("homeLogueado",modelosValidarLogin2);
		}
		
	//validacion
	@RequestMapping(value="validacionPrueba",method=RequestMethod.POST)
	public ModelAndView validacionDelLogin(
			@RequestParam("mail") String mail,
			@RequestParam("contraseña") String contraseña
			
			)
	{
		ModelMap modelosValidarLogin2=new ModelMap();
		try {
			modelosValidarLogin2.put("resultado",registroService.validarLoginMailContra(mail, contraseña));
			modelosValidarLogin2.put("contra",contraseña);
			modelosValidarLogin2.put("mail", mail);
		} catch (Exception e) {
			ModelMap modelExepcion=new ModelMap();
			modelExepcion.put("exepcion",e.getMessage());
			return new ModelAndView("exepcion",modelExepcion);
		}
		return new ModelAndView("validacionPrueba",modelosValidarLogin2);
	}
	
	
	
}
