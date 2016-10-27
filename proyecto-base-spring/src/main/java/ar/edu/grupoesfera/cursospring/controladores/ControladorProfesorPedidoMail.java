package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.servicios.Usuario;

public class ControladorProfesorPedidoMail {
	
	@Inject
	Usuario personaService;
	
	@RequestMapping(path="/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request) {
		Usuario usuarioValidado = personaService.validarUsuario(usuario.getUsuario(), usuario.getPassword());
		if(usuarioValidado != null){
			request.getSession().setAttribute("ROL",usuarioValidado.getRol());
		return new ModelAndView("home");
		} else {
		ModelMap model = new ModelMap();
		model.put("error", "usuaio-invalido");
		return new ModelAndView("login", model);
		}
    }
}
