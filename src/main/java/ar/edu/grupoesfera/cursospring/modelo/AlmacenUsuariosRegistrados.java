package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashSet;

public class AlmacenUsuariosRegistrados {
	
	private HashSet<UsuarioRegistrado> listaDeUsuariosAlmacenador=new HashSet<UsuarioRegistrado>();

	//get seters
	
	public HashSet<UsuarioRegistrado> getListaDeUsuariosAlmacenador() {
		return listaDeUsuariosAlmacenador;
	}

	public void setListaDeUsuariosAlmacenador(HashSet<UsuarioRegistrado> listaDeUsuariosAlmacenador) {
		this.listaDeUsuariosAlmacenador = listaDeUsuariosAlmacenador;
	}
	
	
	
}
