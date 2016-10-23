package ar.edu.grupoesfera.cursospring.servicios;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioRegistrado;

@Service("usuarioRegistrado")
public class UsuarioRegistradoServiceImpl implements UsuarioRegistradoService {

	private UsuarioRegistrado u1=new UsuarioRegistrado("axel", "molaro", "axelmolaro", "axelmolaro@hotmail.com");
	
	@Override
	public void agregarTorneo(String nombre) throws Exception {

		Torneo torneoAAgregar=new Torneo(nombre);
		if(u1.getListaDeTorneos().contains(torneoAAgregar))
		{
			throw new Exception("el torneo que quieres agregar ya existe");
		}
		else
		{
			u1.getListaDeTorneos().add(torneoAAgregar);
		}
		
	}

	@Override
	public HashSet<Torneo> MostrarTorneos() {
		
		return u1.getListaDeTorneos();
	}

	@Override
	public Torneo buscarTorneo(String nombre) throws Exception {

		Torneo torneoBuscado=new Torneo(nombre);
		if (u1.getListaDeTorneos().contains(torneoBuscado)){
			
			for(Torneo each:u1.getListaDeTorneos())
			{
				if(each==torneoBuscado)
				{
					return each;
				}
			}
			
		}
		
		throw new Exception("el torneo que quieres buscar no existe");
		
		
		
		
	}

	@Override
	public void eliminarTorneo(String nombre) throws Exception {
		
		Torneo torneoAEliminar=new Torneo(nombre);
		if (u1.getListaDeTorneos().contains(torneoAEliminar)) {
			u1.getListaDeTorneos().remove(torneoAEliminar);
		}
		else
		{
			throw new Exception("el torneo que quieres eliminar no existe");
		}
		
	}

}
