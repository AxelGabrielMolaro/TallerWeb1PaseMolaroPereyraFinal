package ar.edu.grupoesfera.cursospring.servicios;

import java.util.HashSet;

import org.hibernate.annotations.common.util.StringHelper;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface TorneoService {
	
	
	
	public void eliminarEquipoDeTorneo(String nombre);
	
	public void modificarEquipoDeTorneo(String Nombre) throws Exception;
	
	public Equipo buscarUnEquipoDeterminado(String nombre) throws Exception;
	
	public HashSet<Equipo> mostrarEquipos();

	void agregarEquipoAalTorneo(String nombre);
	//ver quipo
	public void seleccionarEquipoATrabajar(String nombre);

	Torneo buscarTorneo(String nombre) throws Exception;
}
