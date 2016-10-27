package ar.edu.grupoesfera.cursospring.servicios;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.AlmacenUsuariosRegistrados;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

@Service("registroService")
public class RegistroServiceImpl implements RegistroService {
	
	AlmacenUsuariosRegistrados miAlmacenUs=new AlmacenUsuariosRegistrados();

	@Override
	public void agregarUsuarioRegistradoAAlmacen(String nombre, String apellido, String mail, String contrase�a)
			throws Exception {
		
		UsuarioRegistrado usuarioAAgregar=new UsuarioRegistrado(nombre, apellido, contrase�a, mail);
		
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
	public Boolean validarLoginMailContra(String mail, String contrase�a) throws Exception {
		
		UsuarioRegistrado usuarioAValidar=new UsuarioRegistrado(null, null, contrase�a, mail);
		if(miAlmacenUs.getListaDeUsuariosAlmacenador().contains(usuarioAValidar))
		{
			
			for(UsuarioRegistrado each:miAlmacenUs.getListaDeUsuariosAlmacenador())
			{ 
				
				if(each.getMail().equals(usuarioAValidar.getMail()))
				{
					
					if(each.getContrase�a().equals(usuarioAValidar.getContrase�a()))
					{

						
						return true;
					}
					else
					{
						throw new Exception("contrase�a invalida");
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
