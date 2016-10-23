package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;
import ar.edu.grupoesfera.cursospring.servicios.RegistroService;

@RestController
public class registroControlador {

	@Inject
	private RegistroService registroService;
	
	@RequestMapping("registro")
	public ModelAndView modeloRegistroForm()
	{
		ModelMap modeloRegistroForm=new ModelMap();
		UsuarioRegistrado usuarioVacio=new UsuarioRegistrado(null, null, null, null);
		modeloRegistroForm.put("usuario", usuarioVacio);
		return new ModelAndView("formularioDeRegistro",modeloRegistroForm);
	}
	
	@RequestMapping(value="loginFormularioLogin",method= RequestMethod.POST)
	public ModelAndView loginFormulario1(
			@RequestParam ("nombre") String nombre,
			@RequestParam ("apellido") String apellido,
			@RequestParam ("mail") String mail,
			@RequestParam ("contrase�a") String contrase�a
			)
	{
		ModelMap modeloLoginForm=new ModelMap();
		try {
			
			registroService.agregarUsuarioRegistradoAAlmacen(nombre, apellido, mail, contrase�a);
			modeloLoginForm.put("listaDeUsuarios", registroService.mostrarUsuariosRegistradosEnAlmacen());
			modeloLoginForm.put("usuario",new UsuarioRegistrado(null, null, null, null));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return new  ModelAndView("loginForm",modeloLoginForm);
				
	}
	
	//validacion
	@RequestMapping(value="validacionPrueba",method=RequestMethod.POST)
	public ModelAndView validacionDelLogin(
			@RequestParam("mail") String mail,
			@RequestParam("contrase�a") String contrase�a
			
			)
	{
		ModelMap modelosValidarLogin2=new ModelMap();
		try {
			modelosValidarLogin2.put("resultado",registroService.validarLoginMailContra(mail, contrase�a));
			modelosValidarLogin2.put("c",contrase�a);
			modelosValidarLogin2.put("m", mail);
		} catch (Exception e) {
			ModelMap modelExepcion=new ModelMap();
			modelExepcion.put("exepcion",e.getMessage());
			return new ModelAndView("exepcion",modelExepcion);
		}
		return new ModelAndView("validacionPrueba",modelosValidarLogin2);
	}
	
	
	
}