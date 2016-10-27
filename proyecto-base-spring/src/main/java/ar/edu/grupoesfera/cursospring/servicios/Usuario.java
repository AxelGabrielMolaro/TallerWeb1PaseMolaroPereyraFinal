package ar.edu.grupoesfera.cursospring.servicios;

public interface Usuario {

	Object getUsuario();

	Object getPassword();

	Object getRol();

	Usuario validarUsuario(Object usuario, Object password);

	
}
