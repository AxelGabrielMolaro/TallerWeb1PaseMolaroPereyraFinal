package ar.edu.grupoesfera.cursospring.servicios;

import java.util.HashSet;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

public interface RegistroService {
	
	public void agregarUsuarioRegistradoAAlmacen(String nombre,String apellido,String mail,String contraseña)throws Exception;
	
	public HashSet<UsuarioRegistrado> mostrarUsuariosRegistradosEnAlmacen();
	
	public Boolean validarLoginMailContra(String mail,String contraseña)throws Exception;
	
}
