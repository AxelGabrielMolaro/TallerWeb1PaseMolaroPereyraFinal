package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

@RestController
public class IndexControlador {

		@RequestMapping("index")
		public ModelAndView index()
		{
			ModelMap mIndex=new ModelMap();
			mIndex.put("usuario", new UsuarioRegistrado(null, null, null, null));//para logiar
			mIndex.put("torneo", new Torneo(null));//para buscar torneo
			return new ModelAndView("home",mIndex);
			
		}
}


