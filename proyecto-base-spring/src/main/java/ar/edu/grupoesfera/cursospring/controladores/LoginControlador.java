package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;
import ar.edu.grupoesfera.cursospring.servicios.LoginService;

@RestController
public class LoginControlador {

	@Inject
	private LoginService loginService;
	
	@RequestMapping("login")
	public ModelAndView loginForm()
	{
		ModelMap modeloLogin=new ModelMap();
		modeloLogin.put("usuario",new UsuarioRegistrado());
		return new ModelAndView("loginFormulario",modeloLogin);
	}
	@RequestMapping(value="login2",method=RequestMethod.POST)
	public ModelAndView loginForm2(
			
			@RequestParam("mail") String mail,
			@RequestParam("contraseña")String contraseña
			) throws Exception
	{
		ModelMap modeloValidarLogin=new ModelMap();
		loginService.agregarUsuarioALogin("a","a","a","a");
		modeloValidarLogin.put("usuario",loginService.buscarUnUsuarioEspecifico(mail));
		return new ModelAndView("mensajeLoginBeta",modeloValidarLogin);
	}
}
