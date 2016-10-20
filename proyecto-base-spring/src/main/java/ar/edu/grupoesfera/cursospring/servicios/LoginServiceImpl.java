package ar.edu.grupoesfera.cursospring.servicios;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Login;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	Login login1=new Login();

	
	

	@Override
	public void agregarUsuarioALogin(String nombre, String apellido, String mail, String contraseña) throws Exception {
	
		UsuarioRegistrado usuarioAAgregar=new UsuarioRegistrado();
		usuarioAAgregar.setNombre(nombre);
		usuarioAAgregar.setApellido(apellido);
		usuarioAAgregar.setContraseña(contraseña);
		usuarioAAgregar.setMail(mail);
		
		if(login1.getListaDeUsuariosRegitrados().contains(usuarioAAgregar))
		{
			throw new Exception("El usuario ya existe");
		}
		else
		{
			login1.getListaDeUsuariosRegitrados().add(usuarioAAgregar);
		}
		
	}
	@Override
	public UsuarioRegistrado buscarUnUsuarioEspecifico(String mail) throws Exception {
		
		UsuarioRegistrado usuarioABuscar=new UsuarioRegistrado();
		usuarioABuscar.setNombre(null);
		usuarioABuscar.setApellido(null);
		usuarioABuscar.setContraseña(null);
		usuarioABuscar.setMail(mail);
		
		if(login1.getListaDeUsuariosRegitrados().contains(usuarioABuscar))
		{
			for(UsuarioRegistrado each:login1.getListaDeUsuariosRegitrados())
			{
				if(usuarioABuscar==each)
				{
					return each;
				}
			}
		}
		else
		{
			throw new Exception("El usuario que buscas no existe");
		}
		return null;
		
		
		
		
		
	}
	
	@Override
	public Boolean validarLogin(String mail, String contraseña) throws Exception {
		
		UsuarioRegistrado usuarioValidado=buscarUnUsuarioEspecifico(mail);
		if(login1.getListaDeUsuariosRegitrados().contains(usuarioValidado))
		{
			
			String contraseñaOriginal=usuarioValidado.getContraseña();
			if(contraseña==contraseñaOriginal)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else {
			throw new Exception("El Usuario con el que logueas no existe") ;
		}
		
		
	}

	
	
	
}
