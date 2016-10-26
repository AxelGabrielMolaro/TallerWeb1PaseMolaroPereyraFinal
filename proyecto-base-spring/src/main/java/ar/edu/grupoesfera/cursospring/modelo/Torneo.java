package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashSet;
import java.util.TreeMap;

public class Torneo {
	
		private static Torneo instance;
		private String nombre;
		private HashSet<Equipo> listaDeEquipos=new HashSet<Equipo>();
		
		public static Torneo getInstance(){
			if(instance==null){
				instance = new Torneo(null);
			}
			return instance;
		}
		
		public Torneo(String nombre)
		{
			this.nombre=nombre;
		}
		
		//getter an seters
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public HashSet<Equipo> getListaDeEquipos() {
			return listaDeEquipos;
		}
		public void setListaDeEquipos(HashSet<Equipo> listaDeEquipos) {
			this.listaDeEquipos = listaDeEquipos;
		}

		
		
		//equals
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
			Torneo other = (Torneo) obj;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
}
