package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashSet;

import javax.management.loading.PrivateClassLoader;

public class UsuarioRegistrado {
	
	private String nombre;
	private String apellido;
	private String contraseña;
	
	private String mail;
	
	
	private HashSet<Torneo> listaDeTorneos=new HashSet<Torneo>();
	
	public UsuarioRegistrado()
	{}
	
	//getter and seters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public HashSet<Torneo> getListaDeTorneos() {
		return listaDeTorneos;
	}

	public void setListaDeTorneos(HashSet<Torneo> listaDeTorneos) {
		this.listaDeTorneos = listaDeTorneos;
	}


	
	// ecuals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioRegistrado other = (UsuarioRegistrado) obj;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		return true;
	}
	
}
