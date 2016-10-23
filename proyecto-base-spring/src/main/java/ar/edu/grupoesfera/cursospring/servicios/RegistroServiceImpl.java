package ar.edu.grupoesfera.cursospring.servicios;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.AlmacenUsuariosRegistrados;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

@Service("registroService")
public class RegistroServiceImpl implements RegistroService {
	
	AlmacenUsuariosRegistrados miAlmacenUs=new AlmacenUsuariosRegistrados();

	@Override
	public void agregarUsuarioRegistradoAAlmacen(String nombre, String apellido, String mail, String contraseña)
			throws Exception {
		
		UsuarioRegistrado usuarioAAgregar=new UsuarioRegistrado(nombre, apellido, contraseña, mail);
		
		if(miAlmacenUs.getListaDeUsuariosAlmacenador().contains(usuarioAAgregar))
		{
			throw new Exception("el Usuario que quieres registrar ya existe");
		}
		else
		{
			miAlmacenUs.getListaDeUsuariosAlmacenador().add(usuarioAAgregar);
		}
		
	}
	
	@Override
	public HashSet<UsuarioRegistrado> mostrarUsuariosRegistradosEnAlmacen() {
		return miAlmacenUs.getListaDeUsuariosAlmacenador();
	}
	
	//validar
	@Override
	public Boolean validarLoginMailContra(String mail, String contraseña) throws Exception {
		
		UsuarioRegistrado usuarioAValidar=new UsuarioRegistrado(null, null, contraseña, mail);
		if(miAlmacenUs.getListaDeUsuariosAlmacenador().contains(usuarioAValidar))
		{
			
			for(UsuarioRegistrado each:miAlmacenUs.getListaDeUsuariosAlmacenador())
			{ 
				
				if(each.getMail().equals(usuarioAValidar.getMail()))
				{
					
					if(each.getContraseña().equals(usuarioAValidar.getContraseña()))
					{

						
						return true;
					}
					else
					{
						throw new Exception("contraseña invalida");
					}
				}
			}
			
		}
		else
		{
			throw new Exception("El mail que ingresarte no exite");
		}
		return null;
		
	}
}
