package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashSet;

public class Login {

	private String mail;
	private String contrase�a;
	HashSet<UsuarioRegistrado> listaDeUsuariosRegitrados=new HashSet<UsuarioRegistrado>();

	public Login()
	{
		
	}
	//get ansd set
	public HashSet<UsuarioRegistrado> getListaDeUsuariosRegitrados() {
		return listaDeUsuariosRegitrados;
	}

	public void setListaDeUsuariosRegitrados(HashSet<UsuarioRegistrado> listaDeUsuariosRegitrados) {
		this.listaDeUsuariosRegitrados = listaDeUsuariosRegitrados;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	

	
}
