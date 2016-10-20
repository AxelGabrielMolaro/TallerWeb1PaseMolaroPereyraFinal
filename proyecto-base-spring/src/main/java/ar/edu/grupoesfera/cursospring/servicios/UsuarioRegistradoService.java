package ar.edu.grupoesfera.cursospring.servicios;

import java.util.HashSet;

import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface UsuarioRegistradoService {

		//agregar 
	//agrega
	public void agregarTorneo(String nombre)throws Exception;

	
	//muestra la lista
	public HashSet<Torneo> MostrarTorneos();
	
	//busca uno específico
	public Torneo buscarTorneo(String nombre)throws Exception;

	//elimino
	public void eliminarTorneo(String nombre)throws Exception;
}
