package ar.edu.grupoesfera.cursospring.servicios;

import ar.edu.grupoesfera.cursospring.modelo.Login;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

public interface LoginService {

	public void agregarUsuarioALogin(String nombre,String apellido,String mail,String contrase�a) throws Exception;
	
	public UsuarioRegistrado buscarUnUsuarioEspecifico(String mail)throws Exception;
	
	public Boolean validarLogin(String mail,String contrase�a)throws Exception;
	
	
	
}
